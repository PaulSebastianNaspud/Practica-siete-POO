/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica5joaquinzavala.controlador;

import ec.edu.ups.practica5joaquinzavala.idao.ICantanteDAO;
import ec.edu.ups.practica5joaquinzavala.idao.ICompositorDAO;
import ec.edu.ups.practica5joaquinzavala.modelo.Cancion;
import ec.edu.ups.practica5joaquinzavala.modelo.Cantante;
import ec.edu.ups.practica5joaquinzavala.modelo.Compositor;
import java.util.List;

/**
 *
 * @author estem
 */
public class ControladorCompositor {
    private Compositor compositor;
    private Cantante cantante;

    private ICompositorDAO compositorDAO;
    private ICantanteDAO cantanteDAO;

    public ControladorCompositor(ICompositorDAO compositorDAO, ICantanteDAO cantanteDAO) {
        this.compositorDAO = compositorDAO;
        this.cantanteDAO = cantanteDAO;
    }

    public void agregarCompositor(Compositor compositor) {
        compositorDAO.create(compositor);
    }

    public Compositor buscarCompositor(int codigo) {
        return compositorDAO.read(codigo);
    }

    public Compositor buscarCompositorPorCancion(String tituloDeLaCancion) {
        return compositorDAO.buscarPorTituloDeCancion(tituloDeLaCancion);
    }

    public void actualizarCompositor(Compositor compositor) {
        this.compositor = this.buscarCompositor(compositor.getCodigo());
        if (this.compositor != null) {
            compositorDAO.update(compositor);
        }
    }

    public void eliminarCompositor(Compositor compositor) {
        this.compositor = this.buscarCompositor(compositor.getCodigo());
        if (this.compositor != null) {
            compositorDAO.delete(compositor);
        } 

    }

    public List<Compositor> listarCompositores() {
        return compositorDAO.findAll();
    }

    //metodo para cantante
    public void agregarCliente(Compositor compositor, Cantante cantante) {
        this.compositor = compositor;
        this.cantante = cantante;
        compositorDAO.createCilente(this.compositor, this.cantante);
        
    }

    public void eliminarCliente(Compositor compositor, Cantante cantante) {
        this.compositor = compositor;
        this.cantante = cantante;
        this.compositorDAO.deleteCliente(this.compositor, this.cantante.getCodigo());
    }

    public List<Cantante> listarClientes(Compositor compositor) {
        return compositorDAO.findAllCliente(compositor);
    }

    public void actualizarCliente(Compositor compositor, Cantante obj) {
        this.compositor = compositor;
        this.compositorDAO.updateCliente(this.compositor, obj);
    }

    public Cantante buscarCliente(Compositor compositor, int codigo) {
        return compositorDAO.readCliente(compositor, codigo);
    }

    //metodos para canciones
    public void agregarCancion(Compositor compositor, int codigo, String titulo, String letra, double tiempoEnMinutos) {
        this.compositor = compositor;
        compositorDAO.createCancion(this.compositor, codigo, titulo, letra, tiempoEnMinutos);
        
    }

    public Cancion buscarCancion(Compositor compositor, int codigo) {
        this.compositor = compositor;
        return compositorDAO.readCancion(this.compositor, codigo);
    }

    public void eliminarCancion(Compositor compositor, int codigo) {
        this.compositor = compositor;
        Cancion cancion = this.buscarCancion(this.compositor, codigo);
        if (cancion != null) {
            compositorDAO.deleteCancion(this.compositor, codigo);
        } 

    }

    public void actualizarCancion(Compositor compositor, int codigo, String titulo, String letra, double tiempoEnMinutos) {
        this.compositor = compositor;
        Cancion cancion = this.buscarCancion(compositor, codigo);
        if (cancion != null) {
            compositorDAO.updateCancion(this.compositor, codigo, titulo, letra, tiempoEnMinutos);
        }
    }

    public List<Cancion> listarCanciones(Compositor compositor) {
        this.compositor = compositor;
        return compositorDAO.findAllCanciones(this.compositor);
    }
}
