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
    
    //atributo lista cantante
    private RandomAccessFile listaCantanteRAF;

    //contructor
    public CantanteDAO() {
        this.listaCantanteRAF = this.instanciarListaCantanteRAF();
        
    }
    
    
    private RandomAccessFile instanciarListaCantanteRAF(){
        try{
            return new RandomAccessFile("src/main/resources/ec/edu/ups/practicasiete/fileraf/cantante.paul", "rw");
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
    
    private long length(){
        try {
            return listaCantanteRAF.length();
        } catch(IOException iOException){
            return 0;
        }
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
        long cont = 0;
        while (cont < this.length()) {
            try {
                listaCantanteRAF.seek(cont);

                int codigoLista = listaCantanteRAF.readInt();
                if (codigoLista == codigo) {

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

                    listaCantanteRAF.seek(cont + 136);
                    int numeroDeConciertos = listaCantanteRAF.readInt();

                    listaCantanteRAF.seek(cont + 140);
                    int numeroDeGiras = listaCantanteRAF.readInt();

                    //numero de sensillos se calcula en base de la lista
                    Cantante cantante = new Cantante(nombreArtistico, generoMusical, numeroDeConciertos, numeroDeGiras, codigo, nombre, apellido, edad, salario, nacionalidad);

                    long conDisco = cont + 148;

                    while (conDisco < (cont + 350)) {
                        listaCantanteRAF.seek(conDisco);
                        try {
                            int codigoDisco = listaCantanteRAF.readInt();
                            listaCantanteRAF.seek(conDisco + 4);
                            String nombreDisco = listaCantanteRAF.readUTF();
                            listaCantanteRAF.seek(conDisco + 31);
                            int anioDeLanzamiento = listaCantanteRAF.readInt();
                            cantante.agregarDisco(new Disco(codigoDisco, nombreDisco, anioDeLanzamiento));
                            conDisco += 35;

                        } catch (IOException iOException) {
                        }finally{
                            conDisco += 35;
                        }
                    }
                    
                    return cantante;
                            
                }
            } catch (IOException iOException) {
                System.out.println("Error: " + iOException);
            }
            finally{
                cont += 498;
            }
        }

        return null;

    }

    
    //sobre escritura del metodo para buscar cantante por nombre de disco
    @Override
    public Cantante buscarPorNombreDeDisco(String valor) {
        return null; // si no exite, return null
    }

    @Override
    public void update(Cantante obj) {
        long cont = 0;
        while (cont < this.length()) {
            try {
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
            } catch (IOException iOException) {
                System.out.println("Error: " + iOException);
            } finally {
                cont += 498;
            }
        }
    }

    @Override
    public void delete(Cantante obj) {
        
        long cont = 0;
        while (cont < this.length()) {
            try {
                listaCantanteRAF.seek(cont);

                int codigoLista = listaCantanteRAF.readInt();
                if (codigoLista == obj.getCodigo()) {
                    listaCantanteRAF.seek(cont);
                    listaCantanteRAF.writeUTF(this.rellenarBite("", 496));
                    return;
                }
            } catch (IOException iOException) {

            } finally {
                cont += 498;
            }
        }
        
    }

    @Override
    public List<Cantante> findAll() {
        List<Cantante> listaCantanteFindAll = new ArrayList<>();
        long cont = 0;
        
        while (cont < this.length()) {
            try {
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
            } catch (IOException iOException) {
                System.out.println("Error ioe: " + iOException);
            } catch (Exception exception) {
                System.out.println("Error general: " +exception);
            } 
            cont += 498;
            
        }

        return listaCantanteFindAll;
    }
    
     @Override
    public void createDisco(Cantante cantante, int codigo, String nombre, int anioDeLanzamiento) {
        long cont = 0;
        while (cont < this.length()) {
             try {
                 listaCantanteRAF.seek(cont);

                 if (listaCantanteRAF.readInt() == cantante.getCodigo()) {
                     
                     if (cantante.getNumeroDeSensillos() == 10) {
                         return;
                     }

                     long posicionDisco = cont + 148 + (cantante.getNumeroDeSensillos() * 35);
                     listaCantanteRAF.seek(posicionDisco);

                     // Código del disco (4 bytes) en posición 148
                     listaCantanteRAF.writeInt(codigo);

                     // Nombre del disco (25 bytes) en posición 152
                     listaCantanteRAF.writeUTF(rellenarBite(nombre, 25));

                     // Año de lanzamiento del disco (4 bytes) en posición 179
                     listaCantanteRAF.writeInt(anioDeLanzamiento);

                     return;
                 }
             } catch (IOException iOException) {

             } finally {
                 cont += 498;
             }
         }
         
    }

    @Override
    public Disco readDisco(Cantante cantante, int codigo) {
      
        long cont = 0;
        while (cont < this.length()) {
            try {
                listaCantanteRAF.seek(cont);

                if (listaCantanteRAF.readInt() == cantante.getCodigo()) {
                    long conDisco = cont + 148;

                    while (conDisco < (cont + 350)) {

                        try {
                            listaCantanteRAF.seek(conDisco);
                            int codigoDos = listaCantanteRAF.readInt();
                            if (codigoDos == codigo) {
                                listaCantanteRAF.seek(conDisco + 4);
                                String nombre = listaCantanteRAF.readUTF();
                                listaCantanteRAF.seek(conDisco + 31);
                                int anioDeLanzamiento = listaCantanteRAF.readInt();
                                return new Disco(codigoDos, nombre, anioDeLanzamiento);
                            }
                        } catch (IOException iOException) {
                        } finally {
                            conDisco += 35;
                        }

                    }
                }
            } catch (IOException iOException) {

            } finally {
                cont += 498;
            }
        }
        return null;
    }

    @Override
    public void updateDisco(Cantante cantante, int codigo, String nombre, int anioDeLanzamiento) {
        long cont = 0;
        while (cont < this.length()) {
            try {
                listaCantanteRAF.seek(cont);

                if (listaCantanteRAF.readInt() == cantante.getCodigo()) {
                    long conDisco = cont + 148;
                    while (conDisco < (cont + 350)) {

                        try {
                            listaCantanteRAF.seek(conDisco);
                            int codigoDos = listaCantanteRAF.readInt();
                            if (codigoDos == codigo) {
                                
                                listaCantanteRAF.writeUTF(rellenarBite(nombre, 25));
                                // Año de lanzamiento del disco (4 bytes) en posición 179
                                listaCantanteRAF.writeInt(anioDeLanzamiento);
                            }
                        } catch (IOException iOException) {
                        } finally {
                            conDisco += 35;
                        }

                    }
                }
            } catch (IOException iOException) {

            } finally {
                cont += 498;
            }
        }
    }

    @Override
    public void deleteDisco(Cantante cantante, int codigo) {
        long cont = 0;
        while (cont < this.length()) {
            try {
                listaCantanteRAF.seek(cont);

                if (listaCantanteRAF.readInt() == cantante.getCodigo()) {
                    long conDisco = cont + 148;

                    while (conDisco < (cont + 350)) {

                        try {
                            listaCantanteRAF.seek(conDisco);
                            int codigoDos = listaCantanteRAF.readInt();
                            if (codigoDos == codigo) {
                                listaCantanteRAF.seek(conDisco);
                                listaCantanteRAF.writeUTF(this.rellenarBite("", 33));
                                return;
                            }
                        } catch (IOException iOException) {
                        } finally {
                            conDisco += 35;
                        }

                    }
                }
            } catch (IOException iOException) {

            } finally {
                cont += 498;
            }
        }
    }

    @Override
    public List<Disco> findAllDisco(Cantante cantante) {
        List<Disco> listaDisco = new ArrayList<>();

        long cont = 0;
        while (cont < this.length()) {
            try{
            listaCantanteRAF.seek(cont);

            if (listaCantanteRAF.readInt() == cantante.getCodigo()) {
                long cont2 = cont + 148;
                while (cont2 < (cont + 350)) {
                    try{
                    listaCantanteRAF.seek(cont2);
                    int codigo = listaCantanteRAF.readInt();
                    listaCantanteRAF.seek(cont2 + 4);
                    String nombre = listaCantanteRAF.readUTF().strip();
                    listaCantanteRAF.seek(cont + 31);
                    int anioDeLanzamiento = listaCantanteRAF.readInt();
                    listaDisco.add(new Disco(codigo, nombre, anioDeLanzamiento));
                    }catch(IOException iOException){
                    }finally{
                        cont2 += 35;
                    }
                }
                return listaDisco;
            }
            }catch(IOException iOException){}
             finally{
                cont += 498;
            }
        }return listaDisco;
    }
    
}
