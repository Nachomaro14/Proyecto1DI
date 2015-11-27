package modelo;

// @author jairo
import clases.ArtPedidos;
import clases.ArtPresupuestos;
import clases.Clientes;
import clases.Empresa;
import clases.Pedidos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModeloPdf extends Database {

    Database con = new Database();
    Statement stm;
    ResultSet rst;

    public ArrayList<Clientes> recogeClientes() {
        ArrayList<Clientes> clientex = new ArrayList<>();
        try {

            stm = con.getConexion().createStatement();
            rst = stm.executeQuery("select * from Clientes");
            while (rst.next()) {
                Clientes c = new Clientes();
                c.setNif(rst.getString("Nif"));
                c.setNombre(rst.getString("Nombre"));
                c.setApellido(rst.getString("Apellidos"));
                c.setDireccion(rst.getString("Direccion"));
                c.setTelefono(rst.getString("Telefono"));
                c.setCorreo(rst.getString("Correo"));
                clientex.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloPdf.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clientex;
    }

    public ArrayList<Empresa> recogeEmpresa() {
        ArrayList<Empresa> empresax = new ArrayList<>();
        try {

            stm = con.getConexion().createStatement();
            rst = stm.executeQuery("select * from Empresas");
            while (rst.next()) {
                Empresa e = new Empresa();
                e.setCif(rst.getString("Cif"));
                e.setNombre(rst.getString("Nombre"));
                e.setDireccion(rst.getString("Direccion"));
                e.setTelefono(rst.getString("Telefono"));
                e.setCorreo(rst.getString("Correo"));
                e.setCorreo(rst.getString("Web"));
                empresax.add(e);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloPdf.class.getName()).log(Level.SEVERE, null, ex);
        }
        return empresax;
    }

    public ArrayList<Pedidos> recogePedidos() {
        ArrayList<Pedidos> pedidosx = new ArrayList<>();
        try {
            stm = con.getConexion().createStatement();
            rst = stm.executeQuery("select * from Pedidos");
            while (rst.next()) {
                Pedidos p = new Pedidos();
                p.setCodigo(rst.getInt("Codigo"));
                p.setCliente(rst.getString("Cliente"));
                p.setFecha(rst.getString("Fecha"));
                p.setPrecio(rst.getDouble("Precio"));
                p.setBeneficio(rst.getDouble("Beneficio"));
                pedidosx.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloPdf.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pedidosx;

    }

    public ArrayList<ArtPedidos> recogerArtiPedidos() {
        ArrayList<ArtPedidos> artiPedix = new ArrayList<>();

        try {
            stm = con.getConexion().createStatement();
            rst = stm.executeQuery("select * from ArtPedidos");
            while (rst.next()) {
                ArtPedidos aped = new ArtPedidos();
                aped.setCodigoArticulo(rst.getInt("CodigoArt"));
                aped.setCodigoPedido(rst.getInt("CodigoPed"));
                aped.setPrecio(rst.getDouble("Precio"));
                aped.setNombre(rst.getString("Nombre"));
                aped.setCantidad(rst.getInt("Cantidad"));
                artiPedix.add(aped);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloPdf.class.getName()).log(Level.SEVERE, null, ex);
        }

        return artiPedix;
    }

    public ArrayList<ArtPresupuestos> recogerArtiPresupuesto() {
        ArrayList<ArtPresupuestos> artiPresux = new ArrayList<>();
        try {
            stm = con.getConexion().createStatement();
            rst = stm.executeQuery("select * from ArtPresupuestos");
            while (rst.next()) {
                ArtPresupuestos apre = new ArtPresupuestos();
                apre.setCodigoArticulo(rst.getInt("CodigoArt"));
                apre.setCodigoPresupuesto(rst.getInt("CodigoPre"));
                apre.setPrecio(rst.getDouble("Precio"));
                apre.setNombre(rst.getString("Nombre"));
                apre.setCantidad(rst.getInt("Cantidad"));
                artiPresux.add(apre);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModeloPdf.class.getName()).log(Level.SEVERE, null, ex);
        }
        return artiPresux;
    }

}
