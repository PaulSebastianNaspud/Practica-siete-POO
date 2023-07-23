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
        
        CompositorDAO compositorDAO = new CompositorDAO();
        compositorDAO.create(new Compositor(1, 1, "Paul", "Naspud1", 123, 123.25, Nacionalidad.CANADA));
        new CantanteDAO().create(new Cantante("PaulCantante", GeneroMusical.ROCK, 19, 20, 21, "Luigi", "Apellifo", 19, 22, Nacionalidad.CANADA));
        
        
        
    }
}
