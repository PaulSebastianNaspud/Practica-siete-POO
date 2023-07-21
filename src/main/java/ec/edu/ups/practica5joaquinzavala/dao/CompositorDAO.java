/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica5joaquinzavala.dao;

import ec.edu.ups.practica5joaquinzavala.idao.ICompositorDAO;
import ec.edu.ups.practica5joaquinzavala.modelo.Cancion;
import ec.edu.ups.practica5joaquinzavala.modelo.Compositor;
import ec.edu.ups.practica5joaquinzavala.modelo.Nacionalidad;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author estem
 */
public class CompositorDAO implements ICompositorDAO {

    //contador estatico para el maximo de elementos de la clase
    private static int cont;
    private final int MAX_OBJECTCS = 10;
    
    private RandomAccessFile listaCompositorRAF;
    
    // atributo lista compositor
    List<Compositor> listaCompositor;

    //constructor
    public CompositorDAO() {
        this.listaCompositor = new ArrayList();
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
        for (Compositor compositor : listaCompositor) {  //for each de la lsita personas
            for (Cancion cancion : compositor.listarCancionesTop100Billaboar()) {
                //comparar Strings hasta que se cumpla la condicion atraves del get
                if (cancion.getTitulo().equals(valor)) {
                    return compositor; //retunr de persona
                }
            }
        }
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
                    return new Compositor(numeroComposiciones, codigo, nombre, apellido, edad, salario, nacionalidad);

                    /*long conDisco = cont + 148;

                    while (conDisco < (cont + 498)) {
                        try {
                            
                            

                        } catch (IOException iOException) {
                        }finally{
                            conDisco += 35;
                        }
                    }
                    
                    return cantante;*/
                            
                }
            } catch (IOException iOException) {
                System.out.println("Error: " + iOException);
            }
            finally{
                cont += 5896;
            }
        }

        return null;
    }

    @Override
    public void update(Compositor obj) {
        for (int i = 0; i < listaCompositor.size(); i++) {
            Compositor compositorsito = listaCompositor.get(i);
            if (compositorsito.getCodigo() == obj.getCodigo()) {
                listaCompositor.set(i, obj);
                break;
            }
        }
    }

    @Override
    public void delete(Compositor obj) {
        Iterator<Compositor> it = listaCompositor.iterator();
        while (it.hasNext()) {
            Compositor c = it.next();
            if (c.getCodigo() == obj.getCodigo()) {
                it.remove();
                break;
            }
        }
    }

    @Override
    public List<Compositor> findAll() {
        return listaCompositor;
    }@Override
    public void createCancion(Compositor compositor, int codigo, String titulo, String letra, double tiempoEnMinutos) {
        if(listaCompositor.contains(compositor)){
            compositor.agregarCancion(new Cancion(codigo, titulo, letra, tiempoEnMinutos));
            this.update(compositor);
        }
    }

    @Override
    public Cancion readCancion(Compositor compositor, int codigo) {
        if(listaCompositor.contains(compositor)){
            return compositor.buscarCancion(codigo);
        }return null;
    }

    @Override
    public void updateCancion(Compositor compositor, int codigo, String titulo, String letra, double tiempoEnMinutos) {
        if(listaCompositor.contains(compositor)){
            compositor.actualizarCancion(new Cancion(codigo, titulo, letra, tiempoEnMinutos));
            this.update(compositor);
        }
        
    }

    @Override
    public void deleteCancion(Compositor compositor, int codigo) {
        if(listaCompositor.contains(compositor)){
            compositor.eliminarCacion(new Cancion(codigo));
            this.update(compositor);
        }
    }

    @Override
    public List<Cancion> findAllCanciones(Compositor compositor) {
        if(listaCompositor.contains(compositor)){
            return compositor.listarCancionesTop100Billaboar();
        }return null;
    }
    
}
