/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica5joaquinzavala.dao;

import ec.edu.ups.practica5joaquinzavala.idao.ICompositorDAO;
import ec.edu.ups.practica5joaquinzavala.modelo.Cancion;
import ec.edu.ups.practica5joaquinzavala.modelo.Cantante;
import ec.edu.ups.practica5joaquinzavala.modelo.Compositor;
import ec.edu.ups.practica5joaquinzavala.modelo.GeneroMusical;
import ec.edu.ups.practica5joaquinzavala.modelo.Nacionalidad;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author estem
 */
public class CompositorDAO implements ICompositorDAO {

    //contador estatico para el maximo de elementos de la clase
    
    private RandomAccessFile listaCompositorRAF;

    //constructor
    public CompositorDAO() {
        this.listaCompositorRAF = this.instanciarListaCompositorRAF();
    }
    
    private RandomAccessFile instanciarListaCompositorRAF(){
        try{
            return new RandomAccessFile("src/main/resources/ec/edu/ups/practicasiete/fileraf/compositor.comp", "rw");
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
            return listaCompositorRAF.length();
        } catch(IOException iOException){
            return 0;
        }
    }
    

    //metodo sobrescrito para buscar un compositor por un titulo de la cancion
    @Override
    public Compositor buscarPorTituloDeCancion(String valor) {
        return null; // si no existe, return null
    }

    //metodos sobreescritos ICompositor
    @Override
    public void create(Compositor obj) {
        try{
            listaCompositorRAF.seek(listaCompositorRAF.length());
            
            //codigo 4 byte pos 0
            listaCompositorRAF.writeInt(obj.getCodigo());
            
            //nombre 27 byte pos 4
            listaCompositorRAF.writeUTF(this.rellenarBite(obj.getNombre(), 25));
            
            //apeliido 27 byte pos 31
            listaCompositorRAF.writeUTF(this.rellenarBite(obj.getApellido(), 25));
            
            //edad 4 bity pos 58
            listaCompositorRAF.writeInt(obj.getEdad());
            
            //salario 8 byte pos 62
            listaCompositorRAF.writeDouble(obj.getSalario());

            //nacionalidada 22 byte pos 70
            listaCompositorRAF.writeUTF(this.rellenarBite(String.valueOf(obj.getNacionalidad()), 20));
            
            //numero de composiciones 4 byte pos 92            
            listaCompositorRAF.writeInt(obj.getNumeroDeComposiciones());
            
            //peso del compositor sin agregaciones 96

            //composicion de la lista cancion (4 , 20, 50, 8) 82 10 max => 820 || pos 96
            listaCompositorRAF.writeUTF(this.rellenarBite("", 818));
            
            //agregacion de cantante, 498 10 max => 4980 pos 916
            listaCompositorRAF.writeUTF(this.rellenarBite("", 4978));
            
            //peso final del compositor 5896
            
        }catch(IOException iOException){
            
        }
    }

    @Override
    public Compositor read(int codigo) {
        long cont = 0;
        while (cont < this.length()) {
            try {
                listaCompositorRAF.seek(cont);

                int codigoLista = listaCompositorRAF.readInt();
                if (codigoLista == codigo) {
                    
                    String nombre = listaCompositorRAF.readUTF().trim();

                    String apellido = listaCompositorRAF.readUTF().trim();

                    int edad = listaCompositorRAF.readInt();

                    double salario = listaCompositorRAF.readDouble();

                    Nacionalidad nacionalidad = Nacionalidad.valueOf((listaCompositorRAF.readUTF().replaceAll("\\s", "")));
                    
                    int numeroComposiciones = listaCompositorRAF.readInt();
                    
                    //numero de sensillos se calcula en base de la lista
                    Compositor compositor = new Compositor(numeroComposiciones, codigoLista, nombre, apellido, edad, salario, nacionalidad);
                    long conDisco = cont + 96;

                    while (conDisco < (cont + 916)) {
                        try {
                            listaCompositorRAF.seek(conDisco);
                            int codigoDisco = listaCompositorRAF.readInt();
                            String tirulo = listaCompositorRAF.readUTF();
                            String letra = listaCompositorRAF.readUTF();
                            double duracionEnMinutos = listaCompositorRAF.readDouble();
                            compositor.agregarCancion(new Cancion(codigoDisco, tirulo, letra, duracionEnMinutos));
                        } catch (IOException iOException) {
                        }finally{
                            conDisco += 82;
                        }
                    }
                    
                    long conCliente = (cont + 916);
                    while (conCliente < (cont + 5896)) {
                        try {
                            listaCompositorRAF.seek(conCliente);
                            
                            int codigoCliente = listaCompositorRAF.readInt();
                            
                            String nombreCliente = listaCompositorRAF.readUTF().trim();

                            String apellidoCliente = listaCompositorRAF.readUTF().trim();

                            int edadCliente = listaCompositorRAF.readInt();

                            double salarioCliente = listaCompositorRAF.readDouble();

                            Nacionalidad nacionalidadCliiente = Nacionalidad.valueOf((listaCompositorRAF.readUTF().replaceAll("\\s", "")));

                            String nombreArtistico = listaCompositorRAF.readUTF().trim();

                            GeneroMusical generoMusical = GeneroMusical.valueOf(listaCompositorRAF.readUTF().trim().replaceAll("\\s", ""));

                            int numeroDeConciertos = listaCompositorRAF.readInt();

                            int numeroDeGiras = listaCompositorRAF.readInt();
                            
                            compositor.agregarCliente(new Cantante(nombreArtistico, generoMusical, numeroDeConciertos, numeroDeGiras, codigoCliente, nombreCliente, apellidoCliente, edadCliente, salarioCliente, nacionalidadCliiente));
                        
                        } catch (IOException iOException) {
                        }finally{
                            conCliente += 498;
                        }
                    }
                    
                    return compositor;
                            
                }
            } catch (IOException iOException) {
                
            }
            finally{
                cont += 5896;
            }
        }

        return null;
    }

    @Override
    public void update(Compositor obj) {
        long cont = 0;
        while (cont < this.length()) {
            try {
                listaCompositorRAF.seek(cont);

                int codigoLista = listaCompositorRAF.readInt();
                if (codigoLista == obj.getCodigo()) {

                    //nombre 27 byte pos 4
                    listaCompositorRAF.writeUTF(this.rellenarBite(obj.getNombre(), 25));

                    //apeliido 27 byte pos 31
                    listaCompositorRAF.writeUTF(this.rellenarBite(obj.getApellido(), 25));

                    //edad 4 bity pos 58
                    listaCompositorRAF.writeInt(obj.getEdad());

                    //salario 8 byte pos 62
                    listaCompositorRAF.writeDouble(obj.getSalario());

                    //nacionalidada 22 byte pos 70
                    listaCompositorRAF.writeUTF(this.rellenarBite(String.valueOf(obj.getNacionalidad()), 20));

                    //numero de composiciones 4 byte pos 92            
                    listaCompositorRAF.writeInt(obj.getNumeroDeComposiciones());
                    return;
                    
                }
            } catch (IOException iOException) {
            } finally {
                cont += 5896;
            }
        }
    }

    @Override
    public void delete(Compositor obj) {
        long cont = 0;
        while (cont < this.length()) {
            try {
                listaCompositorRAF.seek(cont);

                int codigoLista = listaCompositorRAF.readInt();
                if (codigoLista == obj.getCodigo()) {
                    listaCompositorRAF.seek(cont);
                    listaCompositorRAF.writeUTF(this.rellenarBite("", 5894));
                    return;
                }
            } catch (IOException iOException) {

            } finally {
                cont += 5896;
            }
        }
    }

    @Override
    public List<Compositor> findAll() {
        List<Compositor> listaCompositorFindAll = new ArrayList<>();
        long cont = 0;
        
        while (cont < this.length()) {
            try {
                listaCompositorRAF.seek(cont);

                int codigo = listaCompositorRAF.readInt();

                String nombre = listaCompositorRAF.readUTF().trim();

                String apellido = listaCompositorRAF.readUTF().trim();

                int edad = listaCompositorRAF.readInt();

                double salario = listaCompositorRAF.readDouble();

                Nacionalidad nacionalidad = Nacionalidad.valueOf((listaCompositorRAF.readUTF().replaceAll("\\s", "")));
                
                int numeroDeComposiciones = listaCompositorRAF.readInt();
                
                //falta el while de canciones
                
                //falta el while de compositores
                
                listaCompositorFindAll.add(new Compositor(numeroDeComposiciones, codigo, nombre, apellido, edad, salario, nacionalidad));
                
                
            } catch (IOException iOException) {}
              catch (Exception exception) {
            } finally {
                cont += 5896;
            }
        }

        return listaCompositorFindAll;
    }
    
    @Override
    public void createCancion(Compositor compositor, int codigo, String titulo, String letra, double tiempoEnMinutos) {
        long cont = 0;
        while (cont < this.length()) {
             try {
                 listaCompositorRAF.seek(cont);

                 if (listaCompositorRAF.readInt() == compositor.getCodigo()) {
                     
                     if (compositor.sizeCancionesTop100Billaboar() == 10) {
                         return;
                     }

                     long posicionCancion = cont + 96 + (compositor.sizeCancionesTop100Billaboar() * 82);
                     listaCompositorRAF.seek(posicionCancion);

                     // Código del disco (4 bytes) en posición 96
                     listaCompositorRAF.writeInt(codigo);

                     // titulo de la cancion (20 bytes) en posición 100
                     listaCompositorRAF.writeUTF(rellenarBite(titulo, 18));
                     
                     //letra de la cancion (50 bytes) posicion 120
                     listaCompositorRAF.writeUTF(rellenarBite(letra, 48));

                     // tiempo en minutos (8  bytes) poscicion 170
                     listaCompositorRAF.writeDouble(tiempoEnMinutos);
                     
                     return;
                 }
             } catch (IOException iOException) {

             } finally {
                 cont += 5896;
             }
         }
    }

    @Override
    public Cancion readCancion(Compositor compositor, int codigo) {
        long cont = 0;
        while (cont < this.length()) {
            try {
                listaCompositorRAF.seek(cont);
                if (listaCompositorRAF.readInt() == compositor.getCodigo()) {
                    long conDisco = cont + 96;

                    while (conDisco < (cont + 916)) {

                        try {
                            listaCompositorRAF.seek(conDisco);
                            int codigoDis = listaCompositorRAF.readInt();
                            
                            if (codigoDis == codigo) {
                                String titulo = listaCompositorRAF.readUTF();
                                
                                String letra = listaCompositorRAF.readUTF();
                                
                                double tiempoEnMinutos = listaCompositorRAF.readDouble();
                                return new Cancion(codigoDis, titulo, letra, tiempoEnMinutos);
                            }
                        } catch (IOException iOException) {
                        } finally {
                            conDisco += 82;
                        }

                    }
                }
            } catch (IOException iOException) {

            } finally {
                cont += 5896;
            }
        }
        return null;
    }

    @Override
    public void updateCancion(Compositor compositor, int codigo, String titulo, String letra, double tiempoEnMinutos) {
        long cont = 0;
        while (cont < this.length()) {
            try {
                listaCompositorRAF.seek(cont);
                
                if (listaCompositorRAF.readInt() == compositor.getCodigo()) {
                    long conDisco = cont + 96;

                    while (conDisco < (cont + 916)) {

                        try {
                            listaCompositorRAF.seek(conDisco);
                            int codigoDis = listaCompositorRAF.readInt();

                            if (codigoDis == codigo) {
                                
                                listaCompositorRAF.writeUTF(rellenarBite(titulo, 18));

                                //letra de la cancion (50 bytes) posicion 120
                                listaCompositorRAF.writeUTF(rellenarBite(letra, 48));

                                // tiempo en minutos (8  bytes) poscicion 170
                                listaCompositorRAF.writeDouble(tiempoEnMinutos);
                            }
                        } catch (IOException iOException) {
                        } finally {
                            conDisco += 82;
                        }

                    }
                }
            } catch (IOException iOException) {

            } finally {
                cont += 5896;
            }
        }
    }

    @Override
    public void deleteCancion(Compositor compositor, int codigo) {
        long cont = 0;
        while (cont < this.length()) {
            try {
                listaCompositorRAF.seek(cont);

                if (listaCompositorRAF.readInt() == compositor.getCodigo()) {
                    long conDisco = cont + 96;

                    while (conDisco < (cont + 916)) {

                        try {
                            listaCompositorRAF.seek(conDisco);
                            int codigoDos = listaCompositorRAF.readInt();
                            if (codigoDos == codigo) {
                                listaCompositorRAF.seek(conDisco);
                                listaCompositorRAF.writeUTF(this.rellenarBite("", 80));
                                return;
                            }
                        } catch (IOException iOException) {
                        } finally {
                            conDisco += 82;
                        }

                    }
                }
            } catch (IOException iOException) {

            } finally {
                cont += 5896;
            }
        }
    }

    @Override
    public List<Cancion> findAllCanciones(Compositor compositor) {
        List<Cancion> listaCancion = new ArrayList<>();

        long cont = 0;
        while (cont < this.length()) {
            try{
            listaCompositorRAF.seek(cont);

            if (listaCompositorRAF.readInt() == compositor.getCodigo()) {
                long cont2 = cont + 96;
                while (cont2 < (cont + 916)) {
                    try {
                        listaCompositorRAF.seek(cont2);
                        int codigo = listaCompositorRAF.readInt();
                        String titulo = listaCompositorRAF.readUTF();
                        String letra = listaCompositorRAF.readUTF();
                        double tiempoEnMinutos = listaCompositorRAF.readDouble();
                        listaCancion.add(new Cancion(codigo, titulo, letra, tiempoEnMinutos));
                        
                    } catch (IOException iOException) {
                    } finally {
                        cont2 += 82;
                    }
                }
                return listaCancion;
            }
            }catch(IOException iOException){}
             finally{
                cont += 5896;
            }
        }return listaCancion;
    }

    @Override
    public void createCilente(Compositor compositor, Cantante obj) {
        long cont = 0;
        while (cont < this.length()) {
             try {
                 listaCompositorRAF.seek(cont);

                 if (listaCompositorRAF.readInt() == compositor.getCodigo()) {
                     
                     if (compositor.sizeCliente() == 10) {
                         return;
                     }

                     long posicionCancion = cont + 916 + (compositor.sizeCliente() * 498);
                     
                     listaCompositorRAF.seek(posicionCancion);
                     
                     listaCompositorRAF.writeInt(obj.getCodigo());

                     listaCompositorRAF.writeUTF(this.rellenarBite(obj.getNombre(), 25));

                     listaCompositorRAF.writeUTF(this.rellenarBite(obj.getApellido(), 25));

                     listaCompositorRAF.writeInt(obj.getEdad());

                     listaCompositorRAF.writeDouble(obj.getSalario());

                     listaCompositorRAF.writeUTF(this.rellenarBite(String.valueOf(obj.getNacionalidad()), 20));

                     listaCompositorRAF.writeUTF(rellenarBite(obj.getNombreArtistico(), 25));

                     listaCompositorRAF.writeUTF(this.rellenarBite(String.valueOf(obj.getGeneroMusical()), 15));

                     listaCompositorRAF.writeInt(obj.getNumeroDeConciertos());

                     listaCompositorRAF.writeInt(obj.getNumeroDeGiras());

                     listaCompositorRAF.writeInt(obj.getNumeroDeSensillos());
                     
                     listaCompositorRAF.writeUTF(rellenarBite("", 348));
                     
                     // Falta agregarlos discos, son nescesarios para calcular el numero de sensillos, no me devo olvidar
                     
                     return;
                 }
             } catch (IOException iOException) {

             } finally {
                 cont += 5896;
             }
         }
    }

    @Override
    public Cantante readCliente(Compositor compositor, int codigo) {
        long cont = 0;
        while (cont < this.length()) {
            try {
                listaCompositorRAF.seek(cont);
                if (listaCompositorRAF.readInt() == compositor.getCodigo()) {
                    long conCliente = cont + 916;

                    while (conCliente < (cont + 5896)) {

                        try {
                            listaCompositorRAF.seek(conCliente);

                            int codigoLista = listaCompositorRAF.readInt();
                            if (codigoLista == codigo) {

                                String nombre = listaCompositorRAF.readUTF().trim();

                                String apellido = listaCompositorRAF.readUTF().trim();

                                int edad = listaCompositorRAF.readInt();

                                double salario = listaCompositorRAF.readDouble();

                                Nacionalidad nacionalidad = Nacionalidad.valueOf((listaCompositorRAF.readUTF().replaceAll("\\s", "")));

                                String nombreArtistico = listaCompositorRAF.readUTF().trim();

                                GeneroMusical generoMusical = GeneroMusical.valueOf(listaCompositorRAF.readUTF().trim().replaceAll("\\s", ""));

                                int numeroDeConciertos = listaCompositorRAF.readInt();

                                int numeroDeGiras = listaCompositorRAF.readInt();

                                //numero de sensillos se calcula en base de la lista
                                return new Cantante(nombreArtistico, generoMusical, numeroDeConciertos, numeroDeGiras, codigoLista, nombre, apellido, edad, salario, nacionalidad);

                            }

                        } catch (IOException iOException) {
                            System.out.println("EXCEPCION DOS");
                        } finally {
                            conCliente += 498;
                        }

                    }
                }
            } catch (IOException iOException) {
                System.out.println("EXCEPCION UNO");
            } finally {
                cont += 5896;
            }
        }
        return null;
    }

    @Override
    public void updateCliente(Compositor compositor, Cantante obj) {
        long cont = 0;
        while (cont < this.length()) {
            try {
                listaCompositorRAF.seek(cont);
                if (listaCompositorRAF.readInt() == compositor.getCodigo()) {
                    long conCliente = cont + 916;

                    while (conCliente < (cont + 5896)) {

                        try {
                            listaCompositorRAF.seek(conCliente);

                            int codigoLista = listaCompositorRAF.readInt();
                            if (codigoLista == obj.getCodigo()) {

                                listaCompositorRAF.writeUTF(this.rellenarBite(obj.getNombre(), 25));

                                listaCompositorRAF.writeUTF(this.rellenarBite(obj.getApellido(), 25));

                                listaCompositorRAF.writeInt(obj.getEdad());

                                listaCompositorRAF.writeDouble(obj.getSalario());

                                listaCompositorRAF.writeUTF(this.rellenarBite(String.valueOf(obj.getNacionalidad()), 20));

                                listaCompositorRAF.writeUTF(rellenarBite(obj.getNombreArtistico(), 25));

                                listaCompositorRAF.writeUTF(this.rellenarBite(String.valueOf(obj.getGeneroMusical()), 15));

                                listaCompositorRAF.writeInt(obj.getNumeroDeConciertos());

                                listaCompositorRAF.writeInt(obj.getNumeroDeGiras());

                                listaCompositorRAF.writeInt(obj.getNumeroDeSensillos());

                            }

                        } catch (IOException iOException) {
                            System.out.println("EXCEPCION DOS");
                        } finally {
                            conCliente += 498;
                        }

                    }
                }
            } catch (IOException iOException) {
            } finally {
                cont += 5896;
            }
        }
        
    }

    @Override
    public void deleteCliente(Compositor compositor, int codigo) {
        long cont = 0;
        while (cont < this.length()) {
            try {
                listaCompositorRAF.seek(cont);
                if (listaCompositorRAF.readInt() == compositor.getCodigo()) {
                    long conCliente = cont + 916;

                    while (conCliente < (cont + 5896)) {

                        try {
                            listaCompositorRAF.seek(conCliente);

                            int codigoLista = listaCompositorRAF.readInt();
                            if (codigoLista == codigo) {
                                listaCompositorRAF.seek(conCliente);
                                listaCompositorRAF.writeUTF(this.rellenarBite("", 496));
                            }

                        } catch (IOException iOException) {
                        } finally {
                            conCliente += 498;
                        }

                    }
                }
            } catch (IOException iOException) {
                System.out.println("EXCEPCION UNO");
            } finally {
                cont += 5896;
            }
        }
    }

    @Override
    public List<Cantante> findAllCliente(Compositor compositor) {
        List<Cantante> listaFindAllCliente = new ArrayList<>();
        long cont = 0;
        while (cont < this.length()) {
            try {
                listaCompositorRAF.seek(cont);
                if (listaCompositorRAF.readInt() == compositor.getCodigo()) {
                    long conCliente = cont + 916;

                    while (conCliente < (cont + 5896)) {

                        try {
                            listaCompositorRAF.seek(conCliente);

                            int codigoLista = listaCompositorRAF.readInt();

                            String nombre = listaCompositorRAF.readUTF().trim();

                            String apellido = listaCompositorRAF.readUTF().trim();

                            int edad = listaCompositorRAF.readInt();

                            double salario = listaCompositorRAF.readDouble();

                            Nacionalidad nacionalidad = Nacionalidad.valueOf((listaCompositorRAF.readUTF().replaceAll("\\s", "")));

                            String nombreArtistico = listaCompositorRAF.readUTF().trim();

                            GeneroMusical generoMusical = GeneroMusical.valueOf(listaCompositorRAF.readUTF().trim().replaceAll("\\s", ""));

                            int numeroDeConciertos = listaCompositorRAF.readInt();

                            int numeroDeGiras = listaCompositorRAF.readInt();
                            
                            listaFindAllCliente.add(new Cantante(nombreArtistico, generoMusical, numeroDeConciertos, numeroDeGiras, codigoLista, nombre, apellido, edad, salario, nacionalidad));


                        } catch (IOException iOException) {
                        } finally {
                            conCliente += 498;
                        }

                    }
                }
            } catch (IOException iOException) {
            } finally {
                cont += 5896;
            }
        }
        return listaFindAllCliente;
    }
    
    
}
