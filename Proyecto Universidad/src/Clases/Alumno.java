package Clases;

public class Alumno {
    
    private String dni;
    private String apellidos;
    private String nombre;
    private String domicilio;
    private int telefono;
    private String acceso;
    
    public Alumno(String dni, String apellidos, String nombre, String domicilio, int telefono, String acceso){
        this.dni = dni;
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.acceso = acceso;
    }
    
    public Alumno(){
        dni = "";
        apellidos = "";
        nombre = "";
        domicilio = "";
        telefono = 0;
        acceso = "";
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

    public String getAcceso() {
        return acceso;
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

    public void setAcceso(String acceso) {
        this.acceso = acceso;
    }
    
    public String toString(){
        return dni + " - " + nombre + " " + apellidos + "\n" + telefono + ", " + domicilio + "\n<" + acceso + ">";
    }
}