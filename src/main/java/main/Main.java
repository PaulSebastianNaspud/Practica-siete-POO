/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import ec.edu.ups.practica5joaquinzavala.dao.CantanteDAO;
import ec.edu.ups.practica5joaquinzavala.dao.CompositorDAO;
import ec.edu.ups.practica5joaquinzavala.modelo.Cantante;
import ec.edu.ups.practica5joaquinzavala.modelo.Compositor;
import ec.edu.ups.practica5joaquinzavala.modelo.GeneroMusical;
import ec.edu.ups.practica5joaquinzavala.modelo.Nacionalidad;



/**
 *
 * @author estem
 */
public class Main {
    public static void main(String[] args) {
        
//        CompositorDAO compositorDAO = new CompositorDAO();
//        compositorDAO.create(new Compositor(10, 1, "Paul", "Naspud1", 123, 123.25, Nacionalidad.CANADA));
//        compositorDAO.create(new Compositor(10, 2, "Paul2", "Vivar2", 456, 456.25, Nacionalidad.BRAZIL));
//        compositorDAO.create(new Compositor(10, 3, "Paul3", "Sebastian3", 19, 60, Nacionalidad.ESTADOS_UNIDOS));
//        Compositor compositor = compositorDAO.read(3);
//        System.out.println(compositor);
//        compositor = compositorDAO.read(1);
//        System.out.println(compositor);
//        compositor = compositorDAO.read(2);
//        System.out.println(compositor);

          CantanteDAO cantanteDAO = new CantanteDAO();
          cantanteDAO.create(new Cantante("Paul", GeneroMusical.ROCK, 1, 2, 3, "PaulNas", "Naspud", 4, 5, Nacionalidad.CANADA));
          cantanteDAO.create(new Cantante("Sebastian", GeneroMusical.ROCK, 5, 4, 2, "SebastianNaspud", "Vivar", 25, 18, Nacionalidad.ESTADOS_UNIDOS));
          cantanteDAO.create(new Cantante("Naspud", GeneroMusical.ROCK, 1, 22, 12, "PaulNas", "Naspud", 11, 10, Nacionalidad.BRAZIL));
          Cantante cantante = cantanteDAO.read(12);
          System.out.println(cantante);
          cantante = cantanteDAO.read(3);
          cantanteDAO.createDisco(cantante, 12, "Nuevo disco", 2019);
          cantante = cantanteDAO.read(3);
          cantanteDAO.createDisco(cantante, 0, "Nuevo disco dos", 2022);
          cantante = cantanteDAO.read(3);
          System.out.println(cantante);
          

        
    }
}
