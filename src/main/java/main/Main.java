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
        Compositor compositor = compositorDAO.read(1);
        compositorDAO.createCilente(compositor ,new Cantante("PaulArtisico", GeneroMusical.ROCK, 22, 19, 97, "Sebastian", "VivarBunny", 19, 2000, Nacionalidad.CANADA));
        compositor = compositorDAO.read(1);
        compositorDAO.createCilente(compositor ,new Cantante("DosPaul", GeneroMusical.ROCK_METAL, 12, 21, 2, "Seboso", "BUNNYBAS", 21, 1000, Nacionalidad.ECUADOR));
        compositor = compositorDAO.read(1);
        compositorDAO.createCilente(compositor ,new Cantante("DosPaul", GeneroMusical.ROCK_METAL, 12, 21, 2, "Seboso", "BUNNYBAS", 21, 1000, Nacionalidad.ECUADOR));
        compositor = compositorDAO.read(1);
        compositorDAO.createCilente(compositor ,new Cantante("DosPaul", GeneroMusical.ROCK_METAL, 12, 21, 2, "Seboso", "BUNNYBAS", 21, 1000, Nacionalidad.ECUADOR));
        compositor = compositorDAO.read(1);
        compositorDAO.createCilente(compositor ,new Cantante("DosPaul", GeneroMusical.ROCK_METAL, 12, 21, 2, "Seboso", "BUNNYBAS", 21, 1000, Nacionalidad.ECUADOR));
        compositor = compositorDAO.read(1);
        compositorDAO.createCilente(compositor ,new Cantante("DosPaul", GeneroMusical.ROCK_METAL, 12, 21, 2, "Seboso", "BUNNYBAS", 21, 1000, Nacionalidad.ECUADOR));
        compositor = compositorDAO.read(1);
        compositorDAO.createCilente(compositor ,new Cantante("DosPaul", GeneroMusical.ROCK_METAL, 12, 21, 2, "Seboso", "BUNNYBAS", 21, 1000, Nacionalidad.ECUADOR));
        compositor = compositorDAO.read(1);
        compositorDAO.createCilente(compositor ,new Cantante("DosPaul", GeneroMusical.ROCK_METAL, 12, 21, 2, "Seboso", "BUNNYBAS", 21, 1000, Nacionalidad.ECUADOR));
        compositor = compositorDAO.read(1);
        compositorDAO.createCilente(compositor ,new Cantante("DosPaul", GeneroMusical.ROCK_METAL, 12, 21, 2, "Seboso", "BUNNYBAS", 21, 1000, Nacionalidad.ECUADOR));
        compositor = compositorDAO.read(1);
        compositorDAO.createCilente(compositor ,new Cantante("DosPaul", GeneroMusical.ROCK_METAL, 12, 21, 2, "Seboso", "BUNNYBAS", 21, 1000, Nacionalidad.ECUADOR));
        compositor = compositorDAO.read(1);
        compositorDAO.createCilente(compositor ,new Cantante("DosPaul", GeneroMusical.ROCK_METAL, 12, 21, 2, "Seboso", "BUNNYBAS", 21, 1000, Nacionalidad.ECUADOR));
        compositor = compositorDAO.read(1);
        compositorDAO.createCilente(compositor ,new Cantante("DosPaul", GeneroMusical.ROCK_METAL, 12, 21, 2, "Seboso", "BUNNYBAS", 21, 1000, Nacionalidad.ECUADOR));
        compositor = compositorDAO.read(1);
        compositorDAO.createCilente(compositor ,new Cantante("DosPaul", GeneroMusical.ROCK_METAL, 12, 21, 2, "Seboso", "BUNNYBAS", 21, 1000, Nacionalidad.ECUADOR));
        compositor = compositorDAO.read(1);
        compositorDAO.createCilente(compositor ,new Cantante("DosPaul", GeneroMusical.ROCK_METAL, 12, 21, 2, "Seboso", "BUNNYBAS", 21, 1000, Nacionalidad.ECUADOR));
        compositor = compositorDAO.read(1);
        compositorDAO.createCilente(compositor ,new Cantante("DosPaul", GeneroMusical.ROCK_METAL, 12, 21, 2, "Seboso", "BUNNYBAS", 21, 1000, Nacionalidad.ECUADOR));
        compositor = compositorDAO.read(1);
        compositorDAO.createCilente(compositor ,new Cantante("DosPaul", GeneroMusical.ROCK_METAL, 12, 21, 2, "Seboso", "BUNNYBAS", 21, 1000, Nacionalidad.ECUADOR));
        compositor = compositorDAO.read(1);
        compositorDAO.createCilente(compositor ,new Cantante("DosPaul", GeneroMusical.ROCK_METAL, 12, 21, 2, "Seboso", "BUNNYBAS", 21, 1000, Nacionalidad.ECUADOR));
        compositor = compositorDAO.read(1);
        System.out.println(compositor.sizeCliente());
        
        
        
    }
}
