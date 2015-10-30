package Clases;

public class Asignatura {
    
    private String codigo;
    private String titulo;
    private int numeroCreditos;
    
    public Asignatura(String codigo, String titulo, int numeroCreditos){
        this.codigo = codigo;
        this.titulo = titulo;
        this.numeroCreditos = numeroCreditos;
    }
    
    public Asignatura(){
        codigo = "";
        titulo = "";
        int numeroCreditos = 0;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumeroCreditos() {
        return numeroCreditos;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumeroCreditos(int numeroCreditos) {
        this.numeroCreditos = numeroCreditos;
    }
    
    public String toString(){
        return codigo + " - " + titulo + " (" + numeroCreditos + ")";
    }
}