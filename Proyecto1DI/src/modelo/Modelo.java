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
}