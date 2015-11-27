package clases;

/**
 * @author Jairo
 */
public class Pedidos {

    private int Codigo;
    private String Fecha;
    private double Precio;
    private String Cliente;
    private double Beneficio;

    public int getCodigo() {
        return Codigo;
    }

    public String getFecha() {
        return Fecha;
    }

    public double getPrecio() {
        return Precio;
    }

    public String getCliente() {
        return Cliente;
    }

    public double getBeneficio() {
        return Beneficio;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public void setBeneficio(double Beneficio) {
        this.Beneficio = Beneficio;
    }

}
