/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import ec.edu.ups.practica5joaquinzavala.dao.CompositorDAO;
import ec.edu.ups.practica5joaquinzavala.modelo.Cantante;
import ec.edu.ups.practica5joaquinzavala.modelo.Compositor;
import ec.edu.ups.practica5joaquinzavala.modelo.GeneroMusical;
import ec.edu.ups.practica5joaquinzavala.modelo.Nacionalidad;
import java.util.List;



/**
 *
 * @author estem
 */
public class Main {
    public static void main(String[] args) {
        
        CompositorDAO compositorDAO = new CompositorDAO();
        compositorDAO.create(new Compositor(1, 1, "Paul", "Naspud1", 123, 123.25, Nacionalidad.CANADA));
        compositorDAO.create(new Compositor(5, 2, "Paul", "Naspud1", 123, 123.25, Nacionalidad.CANADA));
        compositorDAO.create(new Compositor(2, 3, "Paul", "Naspud1", 123, 123.25, Nacionalidad.CANADA));
        compositorDAO.create(new Compositor(87, 4, "Paul", "Naspud1", 123, 123.25, Nacionalidad.CANADA));

        Compositor compositor = compositorDAO.read(1);
        compositorDAO.createCilente(compositor,new Cantante("Nuevo cliente", GeneroMusical.ROCK, 19, 20, 33, "Wario", "SIIIM", 19, 4, Nacionalidad.ECUADOR));
        compositor = compositorDAO.read(1);
        compositorDAO.createCilente(compositor,new Cantante("Nuevo cliente2", GeneroMusical.ROCK_METAL, 20, 21, 3, "Wario2", "SIIIM", 19, 3, Nacionalidad.ESPANIA));
        compositor = compositorDAO.read(1);
        compositorDAO.createCilente(compositor,new Cantante("Nuevo cliente3", GeneroMusical.REGUETON, 121, 2002, 3, "Wario3", "SIIIM", 20, 2, Nacionalidad.COLOMBIA));
        compositor = compositorDAO.read(1);
        compositorDAO.createCancion(compositor, 1, "Mi cancion", "aaaaaaaa", 20.2);
        compositor = compositorDAO.read(1);
        compositorDAO.createCancion(compositor, 2, "Mi cancion2", "bbbbbbb", 19.5);
        compositor = compositorDAO.read(1);
        compositorDAO.createCancion(compositor, 3, "Mi cancion3", "cccccccc", 18.2);
        compositor = compositorDAO.read(1);
        compositorDAO.createCancion(compositor, 4, "Mi cancion4", "dddddddd", 17.2);
    }
}
