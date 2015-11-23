package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Modelo extends Database{
    
    public class ModeloTablaNoEditable extends DefaultTableModel {

        public boolean isCellEditable(int row, int column){  
            return false;  
        }
    }
    
    //MÉTODOS DE PROVEEDORES
    
    public String[] getProveedores(){
        int registros = 0;
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(CIF) as total FROM Proveedores");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al contar tuplas\n\n" + e.getMessage());
            e.printStackTrace();
        }
        String[] proveedores = new String[registros];
        try{
            String q = "SELECT CIF FROM Proveedores";
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            int i=0;
            while(res.next()){
                proveedores[i] = res.getString("CIF");
            i++;
            }
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener datos\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return proveedores;
    }
    
    public String getNombreProveedor(String cif){
        String nombre = "";
        try{
            String q = "SELECT Nombre FROM Proveedores WHERE CIF = '"+cif+"'";
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            while(res.next()){
                nombre = res.getString("Nombre");
            }
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener el nombre\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return nombre;
    }
    
    public DefaultTableModel tablaProveedores(){
        DefaultTableModel tablemodel = new ModeloTablaNoEditable();
        int registros = 0;
        String[] columNames = {"CIF","Nombre","Dirección","Teléfono","Correo"};
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(CIF) as total FROM Proveedores");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al contar tuplas\n\n" + e.getMessage());
            e.printStackTrace();
        }
        Object[][] data = new String[registros][5];
        try{
            String q = "SELECT CIF, Nombre, Direccion, Telefono, Correo FROM Proveedores";
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            int i=0;
            while(res.next()){
                data[i][0] = res.getString("CIF");
                data[i][1] = res.getString("Nombre");
                data[i][2] = res.getString("Direccion");
                data[i][3] = res.getString("Telefono");
                data[i][4] = res.getString("Correo");
            i++;
            }
            res.close();
            tablemodel.setDataVector(data, columNames);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener datos\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return tablemodel;
    }
    
    public DefaultTableModel tablaProveedoresVacia(){
        DefaultTableModel tablemodel = new ModeloTablaNoEditable();
        int registros = 0;
        String[] columNames = {"CIF","Nombre","Dirección","Teléfono","Correo"};
        Object[][] data = new String[registros][5];
        try{
            tablemodel.setDataVector(data, columNames);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al construir tabla\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return tablemodel;
    }
    
    public boolean comprobarExistenciaProveedor(String cif){
        String q = "SELECT CIF FROM Proveedores WHERE CIF = '"+cif+"'";
        boolean resu = false;
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            res.next();
            if(res.getRow() == 0){
                resu = false;
            }else{
                resu = true;
            }
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al comprobar existencia\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return resu;
    }
    
    public void crearProveedor(String cif, String nombre, String direccion, String telefono, String correo){
        String q = "INSERT INTO Proveedores (CIF, Nombre, Direccion, Telefono, Correo) "
                + "VALUES('"+cif+"','"+nombre+"','"+direccion+"','"+telefono+"','"+correo+"')";
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al introducir nuevo proveedor\n\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void modificarProveedor(String cif, String ncif, String nombre, String direccion, String telefono, String correo){
        String q = "UPDATE Proveedores SET CIF = '"+ncif+"', Nombre = '"+nombre+"', Direccion = '"+direccion
                + "', Telefono = '"+telefono+"', Correo = '"+correo+"' WHERE CIF = '"+cif+"'";
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al modificar el proveedor\n\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void eliminarProveedor(String cif){
        String q = "DELETE FROM Proveedores WHERE CIF = '"+cif+"'";
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al eliminar el proveedor\n\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    //MÉTODOS DE CLIENTES
    
    public String[] getClientes(){
        int registros = 0;
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(DNI) as total FROM Clientes");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al contar tuplas\n\n" + e.getMessage());
            e.printStackTrace();
        }
        String[] clientes = new String[registros];
        try{
            String q = "SELECT DNI FROM Proveedores";
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            int i=0;
            while(res.next()){
                clientes[i] = res.getString("DNI");
            i++;
            }
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener datos\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return clientes;
    }
    
    public String getNombreCliente(String dni){
        String nombre = "";
        String apellidos = "";
        try{
            String q = "SELECT Nombre, Apellidos FROM Clientes WHERE DNI = '"+dni+"'";
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            while(res.next()){
                nombre = res.getString("Nombre");
                apellidos = res.getString("Apellidos");
            }
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener el nombre y los apellidos\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return nombre + " " + apellidos;
    }
    
    public DefaultTableModel tablaClientes(){
        DefaultTableModel tablemodel = new ModeloTablaNoEditable();
        int registros = 0;
        String[] columNames = {"DNI","Nombre","Apellidos","Dirección","Teléfono","Correo"};
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(DNI) as total FROM Clientes");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al contar tuplas\n\n" + e.getMessage());
            e.printStackTrace();
        }
        Object[][] data = new String[registros][6];
        try{
            String q = "SELECT DNI, Nombre, Apellidos, Direccion, Telefono, Correo FROM Clientes";
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            int i=0;
            while(res.next()){
                data[i][0] = res.getString("DNI");
                data[i][1] = res.getString("Nombre");
                data[i][2] = res.getString("Apellidos");
                data[i][3] = res.getString("Direccion");
                data[i][4] = res.getString("Telefono");
                data[i][5] = res.getString("Correo");
            i++;
            }
            res.close();
            tablemodel.setDataVector(data, columNames);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener datos\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return tablemodel;
    }
    
    public DefaultTableModel tablaClientesVacia(){
        DefaultTableModel tablemodel = new ModeloTablaNoEditable();
        int registros = 0;
        String[] columNames = {"DNI","Nombre","Apellidos","Dirección","Teléfono","Correo"};
        Object[][] data = new String[registros][6];
        try{
            tablemodel.setDataVector(data, columNames);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al construir tabla\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return tablemodel;
    }
    
    public boolean comprobarExistenciaCliente(String dni){
        String q = "SELECT DNI FROM Clientes WHERE DNI = '"+dni+"'";
        boolean resu = false;
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            res.next();
            if(res.getRow() == 0){
                resu = false;
            }else{
                resu = true;
            }
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al comprobar existencia\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return resu;
    }
    
    public void crearCliente(String dni, String nombre, String apellidos, String direccion, String telefono, String correo){
        String q = "INSERT INTO Clientes (DNI, Nombre, Apellidos, Direccion, Telefono, Correo) "
                + "VALUES('"+dni+"','"+nombre+"', '"+apellidos+"','"+direccion+"','"+telefono+"','"+correo+"')";
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al introducir nuevo cliente\n\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void modificarCliente(String dni, String ndni, String nombre, String apellidos, String direccion, String telefono, String correo){
        String q = "UPDATE Clientes SET DNI = '"+ndni+"', Nombre = '"+nombre+"', Apellidos = '"+apellidos+"', Direccion = '"+direccion
                + "', Telefono = '"+telefono+"', Correo = '"+correo+"' WHERE DNI = '"+dni+"'";
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al modificar el cliente\n\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void eliminarCliente(String dni){
        String q = "DELETE FROM Clientes WHERE DNI = '"+dni+"'";
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al eliminar el cliente\n\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    //MÉTODOS DE EMPRESAS
    
    public String[] infoEmpresa(){
        String[] empresa = new String[6];
        try{
            String q = "SELECT * FROM Empresas";
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            while(res.next()){
                empresa[0] = res.getString("CIF");
                empresa[1] = res.getString("Nombre");
                empresa[2] = res.getString("Direccion");
                empresa[3] = res.getString("Telefono");
                empresa[4] = res.getString("Correo");
                empresa[5] = res.getString("Web");
            }
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener los datos de la empresa\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return empresa;
    }
    
    //MÉTODOS DE ARTÍCULOS
    
    public DefaultTableModel tablaArticulos(){
        DefaultTableModel tablemodel = new ModeloTablaNoEditable();
        int registros = 0;
        String[] columNames = {"Código","Proveedor","Nombre","PrecioP","PrecioC"};
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(Codigo) as total FROM Articulos");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al contar tuplas\n\n" + e.getMessage());
            e.printStackTrace();
        }
        Object[][] data = new String[registros][5];
        try{
            String q = "SELECT Codigo, Proveedor, Nombre, PrecioP, PrecioC FROM Articulos";
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            int i=0;
            while(res.next()){
                data[i][0] = res.getString("Codigo");
                data[i][1] = res.getString("Proveedor");
                data[i][2] = res.getString("Nombre");
                data[i][3] = res.getDouble("PrecioP");
                data[i][4] = res.getDouble("PrecioC");
            i++;
            }
            res.close();
            tablemodel.setDataVector(data, columNames);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener datos\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return tablemodel;
    }
    
    public String[] getArticulos(){
        int registros = 0;
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(Codigo) as total FROM Articulos");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al contar tuplas\n\n" + e.getMessage());
            e.printStackTrace();
        }
        String[] articulos = new String[registros];
        try{
            String q = "SELECT Codigo FROM Articulos";
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            int i=0;
            while(res.next()){
                articulos[i] = res.getString("Codigo");
            i++;
            }
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener datos\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return articulos;
    }
    
    public DefaultTableModel tablaArticulosVacia(){
        DefaultTableModel tablemodel = new ModeloTablaNoEditable();
        int registros = 0;
        String[] columNames = {"Código","Proveedor","Nombre","PrecioP","PrecioC"};
        Object[][] data = new String[registros][5];
        try{
            tablemodel.setDataVector(data, columNames);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al construir tabla\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return tablemodel;
    }
    
    public boolean comprobarExistenciaArticulo(String codigo){
        String q = "SELECT Codigo FROM Articulos WHERE Codigo = '"+codigo+"'";
        boolean resu = false;
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            res.next();
            if(res.getRow() == 0){
                resu = false;
            }else{
                resu = true;
            }
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al comprobar existencia\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return resu;
    }
    
    public void crearArticulo(String codigo, String proveedor, String nombre, String descripcion, double precioP, double precioC){
        String q = "INSERT INTO Articulos (Codigo, Proveedor, Nombre, Descripcion, PrecioP, PrecioC) "
                + "VALUES('"+codigo+"','"+proveedor+"', '"+nombre+"','"+descripcion+"',"+precioP+","+precioC+")";
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al introducir nuevo artículo\n\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void modificarArticulo(String codigo, String ncodigo, String proveedor, String nombre, String descripcion, double precioP, double precioC){
        String q = "UPDATE Articulos SET Codigo = '"+ncodigo+"', Proveedor = '"+proveedor+"', Nombre = '"+nombre+"', Descripcion = '"+descripcion
                + "', PrecioP = "+precioP+", PrecioC = "+precioC+" WHERE Codigo = '"+codigo+"'";
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al modificar el artículo\n\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void eliminarArticulo(String codigo){
        String q = "DELETE FROM Articulos WHERE Codigo = '"+codigo+"'";
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al eliminar el artículo\n\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public double precioArticuloProveedor(String codigo){
        double precio = 0.0;
        try{
            String q = "SELECT PrecioP FROM Articulos WHERE Codigo = '"+ codigo +"'";
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            while(res.next()){
                precio = res.getDouble("Codigo");
            }
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener datos\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return precio;
    }
    
    public double precioArticuloCliente(String codigo){
        double precio = 0.0;
        try{
            String q = "SELECT PrecioC FROM Articulos WHERE Codigo = '"+ codigo +"'";
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            while(res.next()){
                precio = res.getDouble("Codigo");
            }
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener datos\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return precio;
    }
    
    public int ivaArticulo(String codigo){
        int iva = 0;
        try{
            String q = "SELECT IVA FROM Articulos WHERE Codigo = '"+ codigo +"'";
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            while(res.next()){
                iva = res.getInt("Codigo");
            }
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener datos\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return iva;
    }
    
    //MÉTODOS DE ARTÍCULOS DE PROVEEDORES
    
    public DefaultTableModel tablaArticulosProveedores(String cif){
        DefaultTableModel tablemodel = new ModeloTablaNoEditable();
        int registros = 0;
        String[] columNames = {"Código","Nombre","PrecioP","PrecioC","IVA"};
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(Codigo) as total FROM Articulos WHERE Proveedor = '"+cif+"'");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al contar tuplas\n\n" + e.getMessage());
            e.printStackTrace();
        }
        Object[][] data = new String[registros][5];
        try{
            String q = "SELECT Codigo, Nombre, PrecioP, PrecioC, IVA FROM Articulos WHERE Proveedor = '"+cif+"'";
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            int i=0;
            while(res.next()){
                data[i][0] = res.getString("Codigo");
                data[i][1] = res.getString("Nombre");
                data[i][2] = res.getDouble("PrecioP");
                data[i][3] = res.getDouble("PrecioC");
                data[i][4] = res.getInt("IVA");
            i++;
            }
            res.close();
            tablemodel.setDataVector(data, columNames);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener datos\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return tablemodel;
    } 
    
    //MÉTODOS DE PEDIDOS
    
    public DefaultTableModel tablaPedidos(){
        DefaultTableModel tablemodel = new ModeloTablaNoEditable();
        int registros = 0;
        String[] columNames = {"Código","Cliente","Precio","Fecha","Beneficios"};
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(Codigo) as total FROM Pedidos");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al contar tuplas\n\n" + e.getMessage());
            e.printStackTrace();
        }
        Object[][] data = new String[registros][5];
        try{
            String q = "SELECT Codigo, Cliente, Precio, Fecha, Beneficio FROM Pedidos";
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            int i=0;
            while(res.next()){
                data[i][0] = res.getString("Codigo");
                data[i][1] = res.getString("Cliente");
                data[i][2] = res.getDouble("Precio");
                data[i][3] = res.getString("Fecha");
                data[i][4] = res.getDouble("Beneficio");
            i++;
            }
            res.close();
            tablemodel.setDataVector(data, columNames);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener datos\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return tablemodel;
    }
    
    public String[] getPedidos(){
        int registros = 0;
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(Codigo) as total FROM Pedidos");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al contar tuplas\n\n" + e.getMessage());
            e.printStackTrace();
        }
        String[] pedidos = new String[registros];
        try{
            String q = "SELECT Codigo FROM Pedidos";
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            int i=0;
            while(res.next()){
                pedidos[i] = res.getString("Codigo");
            i++;
            }
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener datos\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return pedidos;
    }
    
    public DefaultTableModel tablaPedidosVacia(){
        DefaultTableModel tablemodel = new ModeloTablaNoEditable();
        int registros = 0;
        String[] columNames = {"Código","Cliente","Precio","Fecha","Beneficios"};
        Object[][] data = new String[registros][4];
        try{
            tablemodel.setDataVector(data, columNames);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al construir tabla\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return tablemodel;
    }
    
    public boolean comprobarExistenciaPedido(String codigo){
        String q = "SELECT Codigo FROM Pedidos WHERE Codigo = '"+codigo+"'";
        boolean resu = false;
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            res.next();
            if(res.getRow() == 0){
                resu = false;
            }else{
                resu = true;
            }
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al comprobar existencia\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return resu;
    }
    
    public void crearPedido(String codigo, String fecha, double precio, String cliente, double beneficio){
        String q = "INSERT INTO Pedidos (Codigo, Fecha, Precio, Cliente, Beneficio) "
                + "VALUES('"+codigo+"','"+fecha+"',"+precio+",'"+cliente+"',"+beneficio+")";
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al introducir nuevo artículo\n\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void eliminarPedido(String codigo){
        String q = "DELETE FROM Pedidos WHERE Codigo = '"+codigo+"'";
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al eliminar el artículo\n\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    //MÉTODOS DE ARTÍCULOS DE PEDIDOS
    
    public DefaultTableModel tablaArticulosPedidos(String pedido){
        DefaultTableModel tablemodel = new ModeloTablaNoEditable();
        int registros = 0;
        String[] columNames = {"Código","Nombre","PrecioC","Cantidad"};
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(CodigoArt) as total FROM ArtPedidos WHERE CodigoPed = '"+pedido+"'");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al contar tuplas\n\n" + e.getMessage());
            e.printStackTrace();
        }
        Object[][] data = new String[registros][4];
        try{
            String q = "SELECT CodigoArt, Nombre, PrecioC, Cantidad FROM ArtPedidos WHERE CodigoPed = '"+pedido+"'";
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            int i=0;
            while(res.next()){
                data[i][0] = res.getString("CodigoArt");
                data[i][1] = res.getString("Nombre");
                data[i][2] = res.getDouble("PrecioC");
                data[i][3] = res.getInt("Cantidad");
            i++;
            }
            res.close();
            tablemodel.setDataVector(data, columNames);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener datos\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return tablemodel;
    }
    
    //MÉTODOS DE PEDIDOS DE CLIENTES
    
    public DefaultTableModel tablaPedidosClientes(String cliente){
        DefaultTableModel tablemodel = new ModeloTablaNoEditable();
        int registros = 0;
        String[] columNames = {"Código","Precio","Fecha"};
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(Codigo) as total FROM Pedidos WHERE Cliente = '"+cliente+"'");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al contar tuplas\n\n" + e.getMessage());
            e.printStackTrace();
        }
        Object[][] data = new String[registros][3];
        try{
            String q = "SELECT Codigo, Precio, Fecha FROM Pedidos WHERE Cliente = '"+cliente+"'";
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            int i=0;
            while(res.next()){
                data[i][0] = res.getString("Codigo");
                data[i][1] = res.getDouble("Precio");
                data[i][2] = res.getString("Fecha");
            i++;
            }
            res.close();
            tablemodel.setDataVector(data, columNames);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener datos\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return tablemodel;
    }
    
    //MÉTODOS DE PRESUPUESTOS
    
    public DefaultTableModel tablaPresupuestos(){
        DefaultTableModel tablemodel = new ModeloTablaNoEditable();
        int registros = 0;
        String[] columNames = {"Código","Precio","Fecha"};
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(Codigo) as total FROM Presupuestos'");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al contar tuplas\n\n" + e.getMessage());
            e.printStackTrace();
        }
        Object[][] data = new String[registros][3];
        try{
            String q = "SELECT Codigo, Precio, Fecha FROM Pedidos'";
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            int i=0;
            while(res.next()){
                data[i][0] = res.getString("Codigo");
                data[i][1] = res.getDouble("Precio");
                data[i][2] = res.getString("Fecha");
            i++;
            }
            res.close();
            tablemodel.setDataVector(data, columNames);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener datos\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return tablemodel;
    }
    
    public String[] getPresupuestos(){
        int registros = 0;
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(Codigo) as total FROM Presupuestos");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al contar tuplas\n\n" + e.getMessage());
            e.printStackTrace();
        }
        String[] pedidos = new String[registros];
        try{
            String q = "SELECT Codigo FROM Presupuestos";
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            int i=0;
            while(res.next()){
                pedidos[i] = res.getString("Codigo");
            i++;
            }
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener datos\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return pedidos;
    }
    
    public DefaultTableModel tablaPresupuestosVacia(){
        DefaultTableModel tablemodel = new ModeloTablaNoEditable();
        int registros = 0;
        String[] columNames = {"Código","Precio","Fecha"};
        Object[][] data = new String[registros][4];
        try{
            tablemodel.setDataVector(data, columNames);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al construir tabla\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return tablemodel;
    }
    
    public boolean comprobarExistenciaPresupuesto(String codigo){
        String q = "SELECT Codigo FROM Presupuestos WHERE Codigo = '"+codigo+"'";
        boolean resu = false;
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            res.next();
            if(res.getRow() == 0){
                resu = false;
            }else{
                resu = true;
            }
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al comprobar existencia\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return resu;
    }
    
    public void crearPresupuesto(String codigo, String fecha, String precio, String cliente){
        String q = "INSERT INTO Presupuestos (Codigo, Fecha, Precio) "
                + "VALUES('"+codigo+"','"+fecha+"',"+precio+")";
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al introducir nuevo artículo\n\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void eliminarPresupuesto(String codigo){
        String q = "DELETE FROM Presupuestos WHERE Codigo = '"+codigo+"'";
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al eliminar el artículo\n\n" + e.getMessage());
            e.printStackTrace();
        }
    }
    
    //MÉTODOS DE ARTÍCULOS DE PRESUPUESTOS
    
    public DefaultTableModel tablaArticulosPresupuestos(String presupuesto){
        DefaultTableModel tablemodel = new ModeloTablaNoEditable();
        int registros = 0;
        String[] columNames = {"Código","Nombre","PrecioC","Cantidad"};
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(CodigoArt) as total FROM ArtPresupuestos WHERE CodigoPre = '"+presupuesto+"'");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al contar tuplas\n\n" + e.getMessage());
            e.printStackTrace();
        }
        Object[][] data = new String[registros][4];
        try{
            String q = "SELECT CodigoArt, Nombre, PrecioC, Cantidad FROM ArtPresupuestos WHERE CodigoPre = '"+presupuesto+"'";
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            int i=0;
            while(res.next()){
                data[i][0] = res.getString("CodigoArt");
                data[i][1] = res.getString("Nombre");
                data[i][2] = res.getDouble("PrecioC");
                data[i][3] = res.getInt("Cantidad");
            i++;
            }
            res.close();
            tablemodel.setDataVector(data, columNames);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener datos\n\n" + e.getMessage());
            e.printStackTrace();
        }
        return tablemodel;
    }
}