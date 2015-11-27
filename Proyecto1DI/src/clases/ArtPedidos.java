/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Jairo
 */
public class ArtPedidos {

    private int CodigoArticulo, CodigoPedido, Cantidad;
    private double Precio;
    private String Nombre;

    public int getCodigoArticulo() {
        return CodigoArticulo;
    }

    public int getCodigoPedido() {
        return CodigoPedido;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public double getPrecio() {
        return Precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setCodigoArticulo(int CodigoArticulo) {
        this.CodigoArticulo = CodigoArticulo;
    }

    public void setCodigoPedido(int CodigoPedido) {
        this.CodigoPedido = CodigoPedido;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

}
