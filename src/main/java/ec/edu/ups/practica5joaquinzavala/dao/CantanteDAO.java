package ec.edu.ups.practica5joaquinzavala.dao;

import ec.edu.ups.practica5joaquinzavala.idao.ICantanteDAO;
import ec.edu.ups.practica5joaquinzavala.modelo.Cantante;
import ec.edu.ups.practica5joaquinzavala.modelo.Disco;
import ec.edu.ups.practica5joaquinzavala.modelo.GeneroMusical;
import ec.edu.ups.practica5joaquinzavala.modelo.Nacionalidad;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
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
            return new RandomAccessFile("src\\main\\resources\\ec\\edu\\ups\\fileraf\\cantante.datcan", "rw");
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
            //numero de conciertos 4 bity pos 136
            listaCantanteRAF.writeInt(obj.getNumeroDeConciertos());
            //numero de giras 4 byte pos 140
            listaCantanteRAF.writeInt(obj.getNumeroDeGiras());
            //numero de sensillos 4 byte pos 144
            listaCantanteRAF.writeInt(obj.getNumeroDeSensillos());
            
            // cantante byte sin discos 148

            //rellenar archivos (55 Disco) * 10
            listaCantanteRAF.writeUTF(rellenarBite("", 348));
            //cantante peso 
            
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

                    listaCantanteRAF.seek(cont + 136);
                    int numeroDeConciertos = listaCantanteRAF.readInt();
                    
                    listaCantanteRAF.seek(cont + 140);
                    int numeroDeGiras = listaCantanteRAF.readInt();
                    
                    //numero de sensillos se calcula en base de la lista
                    
                    return new Cantante(nombreArtistico, generoMusical, numeroDeConciertos, numeroDeGiras, codigo, nombre, apellido, edad, salario, nacionalidad);
                }
                cont += 498;
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
        try {
            long cont = 0;
            while (cont < listaCantanteRAF.length()) {
                listaCantanteRAF.seek(cont);
                
                int codigoLista = listaCantanteRAF.readInt();
                if (codigoLista == obj.getCodigo()) {
                    
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
                    
                }
                cont += 498;
            }
        }catch (IOException iOException) {
            System.out.println("Error: "  +  iOException);
        }
    }

    @Override
    public void delete(Cantante obj) {
        try {
            long cont = 0;
            while (cont < listaCantanteRAF.length()) {
                listaCantanteRAF.seek(cont);
                
                int codigoLista = listaCantanteRAF.readInt();
                if (codigoLista == obj.getCodigo()) {
                    listaCantanteRAF.writeUTF(this.rellenarBite("", 496));
                    return;
                }
                cont += 498;
            }
        }catch (IOException iOException) {
            System.out.println("Error: "  +  iOException);
        }
    }

    @Override
    public List<Cantante> findAll() {
        List<Cantante> listaCantanteFindAll = new ArrayList<>();
        try {
            long cont = 0;
            while (cont < listaCantanteRAF.length()) {
                listaCantanteRAF.seek(cont);

                int codigoLista = listaCantanteRAF.readInt();

                listaCantanteRAF.seek(cont + 4);
                String nombre = listaCantanteRAF.readUTF().trim();

                listaCantanteRAF.seek(cont + 31);
                String apellido = listaCantanteRAF.readUTF().trim();

                listaCantanteRAF.seek(cont + 58);
                int edad = listaCantanteRAF.readInt();

                listaCantanteRAF.seek(cont + 62);
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
                
                listaCantanteFindAll.add(new Cantante(nombreArtistico, generoMusical, numeroDeConciertos, numeroDeGiras, codigoLista, nombre, apellido, edad, salario, nacionalidad));
                
                cont += 498;
            }
        }catch (IOException iOException) {
            System.out.println("Erro: "  +  iOException);
        }catch(Exception exception){}
        
        return listaCantanteFindAll;
    }
    
     @Override
    public void createDisco(Cantante cantante, int codigo, String nombre, int anioDeLanzamiento) {
        try {
            long cont = 0;
            while (cont < listaCantanteRAF.length()) {
                listaCantanteRAF.seek(cont);
                
                if (listaCantanteRAF.readInt() == cantante.getCodigo() ) {
                    listaCantanteRAF.seek(cont + 148);
                    // codigo 4 byte (ContDis) pos 148
                    listaCantanteRAF.writeInt(codigo);
                    // nombre 2 byte (ContDisc) pos 152
                    listaCantanteRAF.writeUTF(this.rellenarBite(nombre, 25));
                    // anio de lanzamiento 27 byte pos 179
                    listaCantanteRAF.writeInt(anioDeLanzamiento);
                    // pos del disco 183
                }
                cont += 498;
            }
        }catch (IOException iOException) {
            System.out.println("Erro: "  +  iOException);
        }
    }

    @Override
    public Disco readDisco(Cantante cantante, int codigo) {
        try {
            long cont = 0;
            while (cont < listaCantanteRAF.length()) {
                listaCantanteRAF.seek(cont);
                
                if (listaCantanteRAF.readInt() == cantante.getCodigo() ) {
                    long conDisco = cont;
                    while(conDisco < (cont + 350)){
                        listaCantanteRAF.seek(contDisco);
                        if( listaCantanteRAF.readInt() == codigo){
                            listaCantanteRAF.seek(contDisco + 4);
                            String nombre = listaCantanteRAF.readUTF();
                            listaCantanteRAF.seek(contDisco + 31);
                            int anioDeLanzamiento = listaCantanteRAF.readInt();
                            return new Disco(codigo, nombre, anioDeLanzamiento);
                        }
                       conDisco += 35;
                    }
                }
                cont += 498;
            }
        }catch (IOException iOException) {
            System.out.println("Erro: "  +  iOException);
        }return null;
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
        List<Disco> listaDisco = new ArrayList<>();
        try {
            long cont = 0;
            while (cont < listaCantanteRAF.length()) {
                listaCantanteRAF.seek(cont);
                
                if (listaCantanteRAF.readInt() == cantante.getCodigo() ) {
                    long cont2 = cont;
                    while(cont2 < (cont + 350)){
                        listaCantanteRAF.seek(cont2);
                        int codigo = listaCantanteRAF.readInt();
                        listaCantanteRAF.seek(cont2 + 4);
                        String nombre = listaCantanteRAF.readUTF().strip();
                        listaCantanteRAF.seek(cont + 31);
                        int anioDeLanzamiento = listaCantanteRAF.readInt();
                        listaDisco.add(new Disco(codigo, nombre, anioDeLanzamiento));
                        cont2 += 35;
                    }return listaDisco;
                    
                }
                cont += 498;
            }
        }catch (IOException iOException) {
            System.out.println("Erro: "  +  iOException);
        }return listaDisco;
    }
    
}
