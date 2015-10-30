package Clases;

public class Profesor {
    
    private String dni;
    private String apellidos;
    private String nombre;
    private String domicilio;
    private int telefono;
    
    public Profesor(String dni, String apellidos, String nombre, String domicilio, int telefono){
        this.dni = dni;
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }
    
    public Profesor(){
        dni = "";
        apellidos = "";
        nombre = "";
        domicilio = "";
        telefono = 0;
    }

    public String getDni() {
        return dni;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    public String toString(){
        return dni + " - " + nombre + " " + apellidos + "\n" + telefono + ", " + domicilio;
    }
}