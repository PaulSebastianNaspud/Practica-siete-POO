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
        cantanteDAO.createDisco(cantante, 123, "DiscoUno", 2023);
        cantante = cantanteDAO.read(2);
        cantanteDAO.createDisco(cantante, 654, "DiscoDos", 2024);
        cantante = cantanteDAO.read(2);
        System.out.println(cantante);
        
    }
}
