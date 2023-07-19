/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import ec.edu.ups.practica5joaquinzavala.dao.CantanteDAO;
import ec.edu.ups.practica5joaquinzavala.modelo.Cantante;
import ec.edu.ups.practica5joaquinzavala.modelo.Disco;
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
        cantanteDAO.create(new Cantante("mat", GeneroMusical.ROCK_METAL, 25, 2, 2, "Paul", "Naspud", 19, 0.25, Nacionalidad.CANADA));
        Cantante cantante = cantanteDAO.read(2);
        System.out.println(cantante);
        cantanteDAO.createDisco(cantante, 123, "disss", 2023);
        Disco disco = cantanteDAO.readDisco(cantante, 432);
        System.out.println(disco);
        cantante = cantanteDAO.read(4);
        System.out.println(cantante);
        
    }
}
