package Clases;

public class Aula {
    
    private String nombreEdificio;
    private int numeroAula;
    
    public Aula(String nombreEdificio, int numeroAula){
        this.nombreEdificio = nombreEdificio;
        this.numeroAula = numeroAula;
    }
    
    public Aula(){
        nombreEdificio = "";
        numeroAula = 0;
    }

    public String getNombreEdificio() {
        return nombreEdificio;
    }

    public int getNumeroAula() {
        return numeroAula;
    }

    public void setNombreEdificio(String nombreEdificio) {
        this.nombreEdificio = nombreEdificio;
    }

    public void setNumeroAula(int numeroAula) {
        this.numeroAula = numeroAula;
    }
    
    public String toString(){
        return numeroAula + " (" + nombreEdificio + ")";
    }
}