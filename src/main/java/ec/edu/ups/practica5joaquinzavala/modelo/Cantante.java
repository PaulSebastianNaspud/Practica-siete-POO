package ec.edu.ups.practica5joaquinzavala.modelo;

import java.util.ArrayList;
import java.util.List;

public class Cantante extends Persona {

    //atributos private de la clase y encapsulamiento
    private String nombreArtistico;
    private GeneroMusical generoMusical;
    private int numeroDeSensillos;
    private int numeroDeConciertos;
    private int numeroDeGiras;
    //atributo private de relacion con la clase disco
    private List<Disco> discografia;

    //contructores nescesarios
    public Cantante() {
        this.discografia = new ArrayList();
    }

    public Cantante(int codigo) {
        super(codigo);
        this.discografia = new ArrayList();
    }

    public Cantante(String nombreArtistico, GeneroMusical generoMusical,int numeroDeConciertos, int numeroDeGiras, int codigo, String nombre, String apellido, int edad, double salario, Nacionalidad nacionalidad) {
        super(codigo, nombre, apellido, edad, salario, nacionalidad);
        this.nombreArtistico = nombreArtistico;
        this.generoMusical = generoMusical;
        this.numeroDeConciertos = numeroDeConciertos;
        this.numeroDeGiras = numeroDeGiras;
        this.discografia = new ArrayList();
    }

    //get and set
    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    public GeneroMusical getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(GeneroMusical generoMusical) {
        this.generoMusical = generoMusical;
    }
    
    public int getNumeroDeSensillos() {
        return discografia.size();
    }

    public void setNumeroDeSensillos(int numeroDeSensillos) {
        this.numeroDeSensillos = numeroDeSensillos;
    }

    public int getNumeroDeConciertos() {
        return numeroDeConciertos;
    }

    public void setNumeroDeConciertos(int numeroDeConciertos) {
        this.numeroDeConciertos = numeroDeConciertos;
    }

    public int getNumeroDeGiras() {
        return numeroDeGiras;
    }

    public void setNumeroDeGiras(int numeroDeGiras) {
        this.numeroDeGiras = numeroDeGiras;
    }

    //metodos de la discografia
    public void agregarDisco(Disco disco) {
        discografia.add(disco);
    }

    public void actualizarDisco(Disco disco) {
        if (discografia.contains(disco)) {
            int index = discografia.indexOf(disco);
            discografia.set(index, disco);
        }
    }

    public void eliminarDisco(Disco disco) {
        if (discografia.contains(disco)) {
            int index = discografia.indexOf(disco);
            discografia.remove(index);
        }
    }

    public List<Disco> listarDiscografia() {
        return discografia;
    }

    public Disco buscarDisco(int codigo) {
        for (int i = 0; i < discografia.size(); i++) {
            if (discografia.get(i).getCodigo() == codigo) {
                return discografia.get(i);
            }
        }
        return null;
    }
    
    //metodos de la clase abstract persona
    @Override
    public double calularSalario() {
        double salarioExtra = super.getSalario();
        if (numeroDeSensillos > 10 && numeroDeGiras > 3) {
            salarioExtra = salarioExtra + (super.getSalario() + 1000);
        }
        if (numeroDeSensillos >= 1 && numeroDeSensillos <= 10 ) {
            salarioExtra = salarioExtra + (super.getSalario() * 0.05);
        }
        if (numeroDeGiras >= 1 && numeroDeGiras <= 3) {
            salarioExtra = salarioExtra + (super.getSalario() * 0.03);
        }
        if (discografia.size() >= 5) {
            salarioExtra = salarioExtra + (super.getSalario() + 2000);
        }
        return salarioExtra;
    }

    // hashCode y equals de codigo de la clase padre
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + super.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cantante other = (Cantante) obj;
        return super.hashCode() == other.getCodigo();
    }

    //toString
    @Override
    public String toString() {
        return "Cantante{" + super.toString() + "nombreArtistico=" + nombreArtistico + ", generoMusical=" + generoMusical + ", numeroDeSensillos=" + numeroDeSensillos + ", numeroDeConciertos=" + numeroDeConciertos + ", numeroDeGiras=" + numeroDeGiras + '}' + "\n discografia=" + discografia;
    }

}
