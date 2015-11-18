package modelo;

import java.sql.CallableStatement;
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
            JOptionPane.showMessageDialog(null, "Error al contar tuplas\n" + e.getMessage());
        }
        String[] proveedores = new String[registros];
        try{
          
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT CIF FROM Proveedores");
            ResultSet res = pstm.executeQuery();
            int i=0;
            while(res.next()){
                proveedores[i] = res.getString("CIF");
            i++;
            }
            res.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al obtener datos\n" + e.getMessage());
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
            JOptionPane.showMessageDialog(null, "Error al obtener el nombre\n" + e.getMessage());
        }
        return nombre;
    }
}