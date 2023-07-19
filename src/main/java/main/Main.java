/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import ec.edu.ups.practica5joaquinzavala.dao.CantanteDAO;
import ec.edu.ups.practica5joaquinzavala.modelo.Cantante;
import ec.edu.ups.practica5joaquinzavala.modelo.GeneroMusical;
import ec.edu.ups.practica5joaquinzavala.modelo.Nacionalidad;



/**
 *
 * @author estem
 */
public class Main {
    public static void main(String[] args) {
        //432 123
        CantanteDAO cantanteDAO = new CantanteDAO();
        cantanteDAO.create(new Cantante("Paul", GeneroMusical.ROCK_METAL, 25, 2, 1, "Paul1", "Naspud1", 19, 0.25, Nacionalidad.CANADA));
        cantanteDAO.create(new Cantante("Sebastian", GeneroMusical.ROCK, 25, 2, 2, "Paul2", "Naspud2", 19, 58.25, Nacionalidad.CANADA));
        cantanteDAO.create(new Cantante("Naspud", GeneroMusical.ROCK_METAL, 25, 2, 3, "Paul3", "Naspud3", 19, 45.25, Nacionalidad.CANADA));
        cantanteDAO.create(new Cantante("Vivar", GeneroMusical.ROCK, 25, 2, 4, "Paul4", "Naspud4", 19, 65.5, Nacionalidad.CANADA));
        
        
    }
}
