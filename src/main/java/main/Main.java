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
        CantanteDAO cantanteDAO = new CantanteDAO();
        cantanteDAO.create(new Cantante("SuperPul", GeneroMusical.ROCK, 25, 2, 1, "Paul", "Naspud", 19, 0.25, Nacionalidad.CANADA));
        Cantante cantante = cantanteDAO.read(12);
        System.out.println(cantante);
        
    }
}
