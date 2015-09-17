package modelo;

import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class Modelo extends Database{
    
    public Modelo(){
        
    }
    
    public DefaultTableModel getTablaTrabajadores(){
        DefaultTableModel tablemodel = new DefaultTableModel();
        int registros = 0;
        String[] columNames = {"DNI", "Nombre","Apellidos"};
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(*) as total FROM Trabajadores");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
        Object[][] data = new String[registros][3];
        try{
             PreparedStatement pstm = this.getConexion().prepareStatement("SELECT Dni, Nombre, Apellidos FROM Trabajadores");
            ResultSet res = pstm.executeQuery();
            int i=0;
            while(res.next()){
                data[i][0] = res.getString("Dni");
                data[i][1] = res.getString("Nombre");
                data[i][2] = res.getString("Apellidos");
                i++;
            }
            res.close();
            tablemodel.setDataVector(data, columNames);
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
        return tablemodel;
    }
    
    public DefaultTableModel getTablaClientes(int id){
        DefaultTableModel tablemodel = new DefaultTableModel();
        int registros = 0;
        String[] columNames = {"Nombre", "Apellidos", "DNI", "Servicio", "Precio"};
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(*) as total FROM Clientes WHERE ID_Trabajador = '"+id+"'");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
        Object[][] data = new String[registros][5];
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT Nombre, Apellidos, Dni, Servicio, Precio FROM Clientes WHERE ID_Trabajador = '"+id+"'");
            ResultSet res = pstm.executeQuery();
            int i=0;
            while(res.next()){
                data[i][0] = res.getString("Nombre");
                data[i][1] = res.getString("Apellidos");
                data[i][2] = res.getString("Dni");
                data[i][3] = res.getString("Servicio");
                data[i][4] = res.getString("Precio");
                i++;
            }
            res.close();
            tablemodel.setDataVector(data, columNames);
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
        return tablemodel;
    }
    
    public int idTrabajador(String dni){
        int id = 0;
        String q = "SELECT ID_Trabajador FROM Trabajadores WHERE Dni = '"+dni+"'";
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            id = res.getInt("ID_Trabajador");
            pstm.close();
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
        return id;
    }
    
    public int idCliente(String dni){
        int id = 0;
        String q = "SELECT ID_Cliente FROM Clientes WHERE Dni = '"+dni+"'";
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            id = res.getInt("ID_Cliente");
            pstm.close();
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
        return id;
    }
    
    public boolean nuevoTrabajador(String nombre, String apellidos, String dni, String servicios){
        
        int maxId = 0;
        String q1 = "SELECT max(ID_Trabajador) as ID_Trabajador FROM Trabajadores";
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(q1);
            ResultSet res = pstm.executeQuery();
            maxId = res.getInt("ID_Trabajador");
            pstm.close();
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
        
        maxId++;
        
        String q2 = "INSERT INTO Trabajadores (ID_Trabajador, Nombre, Apellidos, Dni, Servicios) "
                    + "VALUES ("+maxId+", '"+nombre+"', '"+apellidos+"', '"+dni+"', '"+servicios+"')";
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(q2);
            pstm.execute();
            pstm.close();
            return true;
        }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
        return false;
    }
    
    public boolean nuevoCliente(String nombre , String apellidos, String dni, String servicio, double precio, int idT){
        
        int maxId = 0;
        String q1 = "SELECT max(ID_Cliente) as ID_Cliente FROM Clientes";
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(q1);
            ResultSet res = pstm.executeQuery();
            maxId = res.getInt("ID_Cliente");
            pstm.close();
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
        
        maxId++;
        
        String q2 = "INSERT INTO Clientes (ID_Cliente, Nombre, Apellidos, Dni, Servicio, Precio, ID_Trabajador) "
                    + "VALUES ("+maxId+", '"+nombre+"', '"+apellidos+"', '"+dni+"', '"+servicio+"', "+precio+", "+idT+")";
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(q2);
            pstm.execute();
            pstm.close();
            return true;
        }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
        return false;
    }
    
    public boolean eliminarTrabajador(String id){
        boolean res=false;
        String q = "DELETE FROM Trabajadores WHERE ID_Trabajador = "+id;
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();
            res=true;
        }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
        return res;
    }
    
    public boolean eliminarCliente(String id){
        boolean res=false;
        String q = "DELETE FROM Trabajadores WHERE ID_Trabajador = "+id;
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            pstm.execute();
            pstm.close();
            res=true;
        }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
        return res;
    }
    
    public String[] infoTrabajador(String dni){
        String[] info = new String[4];
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT Nombre, Apellidos, Dni, Servicios FROM Trabajadores WHERE Dni = '"+dni+"'");
            ResultSet res = pstm.executeQuery();
            info[0] = res.getString("Nombre");
            info[1] = res.getString("Apellidos");
            info[2] = res.getString("Dni");
            info[3] = res.getString("Servicios");
            res.close();
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
        return info;
    }
}