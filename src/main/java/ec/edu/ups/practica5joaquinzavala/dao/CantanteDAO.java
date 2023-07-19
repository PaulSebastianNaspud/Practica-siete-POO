package ec.edu.ups.practica5joaquinzavala.dao;

import ec.edu.ups.practica5joaquinzavala.idao.ICantanteDAO;
import ec.edu.ups.practica5joaquinzavala.modelo.Cantante;
import ec.edu.ups.practica5joaquinzavala.modelo.Disco;
import ec.edu.ups.practica5joaquinzavala.modelo.GeneroMusical;
import ec.edu.ups.practica5joaquinzavala.modelo.Nacionalidad;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CantanteDAO implements ICantanteDAO {
    
    //contador estatico para el maximo elementos de la lista de la clase
    private long contDisco;
    
    //atributo lista cantante
    private RandomAccessFile listaCantanteRAF;
    private List<Cantante> listaCantante;

    //contructor
    public CantanteDAO() {
        this.listaCantante = new ArrayList();
        this.listaCantanteRAF = this.instanciarListaCantanteRAF();
        
    }
    
    
    private RandomAccessFile instanciarListaCantanteRAF(){
        try{
            return new RandomAccessFile("src\\main\\resources\\ec\\edu\\ups\\practicasiete\\fileraf\\cantante.datcan", "rw");
        }catch(IOException iOException){
        }return null;
    }
    
    private String rellenarBite(String obj, int max){
        if (obj.length() < max) {
            obj = String.format("%-" + max + "s", obj);
        } else if (obj.length() > max) {
            obj = obj.substring(0, max);
        }
        return obj;
    }
    
    

    //sobrescritura
    @Override
    public void create(Cantante obj) {
        try{
            listaCantanteRAF.seek(listaCantanteRAF.length());
            //codigo 4 byte pos 0
            listaCantanteRAF.writeInt(obj.getCodigo());
            //nombre 27 byte pos 4
            listaCantanteRAF.writeUTF(this.rellenarBite(obj.getNombre(), 25));
            //apeliido 27 byte pos 31
            listaCantanteRAF.writeUTF(this.rellenarBite(obj.getApellido(), 25));
            //edad 4 bity pos 58
            listaCantanteRAF.writeInt(obj.getEdad());
            //salario 8 byte pos 62
            listaCantanteRAF.writeDouble(obj.getSalario());
            //nacionalidada 22 byte pos 70
            listaCantanteRAF.writeUTF(this.rellenarBite(String.valueOf(obj.getNacionalidad()), 20));
            //nombreArtisitico 27 byte pos 92
            listaCantanteRAF.writeUTF(rellenarBite(obj.getNombreArtistico(), 25));
            //genero Musioal 17 byte pos 119
            listaCantanteRAF.writeUTF(this.rellenarBite(String.valueOf(obj.getGeneroMusical()), 15));
            //numero de sensillos 4 bity pos 136
            listaCantanteRAF.writeInt(obj.getNumeroDeSensillos());
            //numero de conciertos 4 bity pos 140
            listaCantanteRAF.writeInt(obj.getNumeroDeConciertos());
            //numero de sensillos 4 bity pos 144
            
            // cantante byte sin discos 148

            //rellenar archivos (55 Disco) * 10
            listaCantanteRAF.writeUTF(rellenarBite("", 350));
            //cantante peso 496
            
        }catch(IOException iOException){}
         catch(Exception exception){}
    }

    @Override
    public Cantante read(int codigo) {
        try {
            long cont = 0;
            while (cont < listaCantanteRAF.length()) {
                listaCantanteRAF.seek(cont);
                
                int codigoLista = listaCantanteRAF.readInt();
                if (codigoLista == codigo) {
                    
                    listaCantanteRAF.seek(cont + 4);
                    String nombre = listaCantanteRAF.readUTF().trim();
                    
                    listaCantanteRAF.seek(cont + 31);
                    String apellido = listaCantanteRAF.readUTF().trim();
                    
                    listaCantanteRAF.seek(cont + 58);
                    int edad = listaCantanteRAF.readInt();
                    
                    listaCantanteRAF.seek(cont+ 62);
                    double salario = listaCantanteRAF.readDouble();
                    
                    listaCantanteRAF.seek(cont + 70);
                    Nacionalidad nacionalidad = Nacionalidad.valueOf((listaCantanteRAF.readUTF().replaceAll("\\s", "")));
                    
                    listaCantanteRAF.seek(cont + 92);
                    String nombreArtistico = listaCantanteRAF.readUTF().trim();
                    
                    listaCantanteRAF.seek(cont + 119);
                    GeneroMusical generoMusical = GeneroMusical.valueOf(listaCantanteRAF.readUTF().trim().replaceAll("\\s", ""));
                    
                    
                    //numero de sensillos se calcula en base de la lista

                    listaCantanteRAF.seek(cont + 136);
                    int numeroDeConciertos = listaCantanteRAF.readInt();
                    
                    listaCantanteRAF.seek(cont + 140);
                    int numeroDeGiras = listaCantanteRAF.readInt();
                    
                    return new Cantante(nombreArtistico, generoMusical, numeroDeConciertos, numeroDeGiras, codigo, nombre, apellido, edad, salario, nacionalidad);
                }
                cont += 496;
            }
        }catch (IOException iOException) {
            System.out.println("Erro: "  +  iOException);
        }
        return null;
    }
    
    //sobre escritura del metodo para buscar cantante por nombre de disco
    @Override
    public Cantante buscarPorNombreDeDisco(String valor) {
        for (Cantante cantante : listaCantante) { //for each de la lista de las personas
            for (Disco disco : cantante.listarDiscografia()) {
                //comparar Strings hasta que se cumpla la condicion atraves del get
                if (disco.getNombre().equals(valor)) {
                    return cantante; //return de persona
                }
            }
        }
        return null; // si no exite, return null
    }

    @Override
    public void update(Cantante obj) {
        for (int i = 0; i < listaCantante.size(); i++) {
            Cantante cantantito = listaCantante.get(i);
            if (cantantito.getCodigo() == obj.getCodigo()) {
                listaCantante.set(i, (Cantante) obj);
                break;
            }
        }
    }

    @Override
    public void delete(Cantante obj) {
        Iterator<Cantante> it = listaCantante.iterator();
        while (it.hasNext()) {
            Cantante c = it.next();
            if (c.getCodigo() == obj.getCodigo()) {
                it.remove();
                return;
            }
        }
    }

    @Override
    public List<Cantante> findAll() {
        return null;
    }
    
     @Override
    public void createDisco(Cantante cantante, int codigo, String nombre, int anioDeLanzamiento) {
        if (listaCantante.contains(cantante)) {
            cantante.agregarDisco(new Disco(codigo, nombre, anioDeLanzamiento));
        }
    }

    @Override
    public Disco readDisco(Cantante cantante, int codigo) {
        if (listaCantante.contains(cantante)) { 
            return cantante.buscarDisco(codigo);
        }
        return null;
    }

    @Override
    public void updateDisco(Cantante cantante, int codigo, String nombre, int anioDeLanzamiento) {
        if (listaCantante.contains(cantante)) {
            cantante.actualizarDisco(new Disco(codigo, nombre, anioDeLanzamiento));
            this.update(cantante);
        }
    }

    @Override
    public void deleteDisco(Cantante cantante, int codigo) {
        if (listaCantante.contains(cantante)) {
            cantante.eliminarDisco(new Disco(codigo));
            this.update(cantante);
        }
    }

    @Override
    public List<Disco> findAllDisco(Cantante cantante) {
        return null;
    }
    
}
