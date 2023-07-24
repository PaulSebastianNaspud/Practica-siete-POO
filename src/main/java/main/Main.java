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
import java.util.List;



/**
 *
 * @author estem
 */
public class Main {
    public static void main(String[] args) {
        
        CompositorDAO compositorDAO = new CompositorDAO();
        compositorDAO.create(new Compositor(1, 2, "Paul", "Naspud1", 123, 123.25, Nacionalidad.CANADA));
        CantanteDAO cantanteDAO = new CantanteDAO();
        cantanteDAO.create(new Cantante("Paulito", GeneroMusical.ROCK, 0, 0, 3, "adsdas", "adad", 0, 0, Nacionalidad.CANADA));
        Cantante cantante = cantanteDAO.read(3);
        cantanteDAO.createDisco(cantante, 1, "", 2);
        cantante = cantanteDAO.read(3);
        cantanteDAO.createDisco(cantante, 1, "", 2);
        cantante = cantanteDAO.read(1);
        cantanteDAO.createDisco(cantante, 1, "", 2);
        cantante = cantanteDAO.read(3);
        cantanteDAO.createDisco(cantante, 1, "", 2);
        cantante = cantanteDAO.read(3);
        cantanteDAO.createDisco(cantante, 1, "", 2);
        cantante = cantanteDAO.read(3);
        cantanteDAO.createDisco(cantante, 1, "", 2);
        cantante = cantanteDAO.read(1);
        cantanteDAO.createDisco(cantante, 1, "", 2);
        cantante = cantanteDAO.read(3);
        cantanteDAO.createDisco(cantante, 1, "", 2);
        cantante = cantanteDAO.read(3);
        compositorDAO.createCilente(compositorDAO.read(2), cantante);
    }
}
