package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class modelo extends database{
    
    public modelo(){
    
    }
    
    public class ModeloTablaNoEditable extends DefaultTableModel {

        public boolean isCellEditable(int row, int column){  
            return false;  
        }
    }
    
    public DefaultTableModel getTablaLibros(){
        DefaultTableModel tablemodel = new ModeloTablaNoEditable();
        int registros = 0;
        String[] columNames = {"Código","Título","Ejemplares","Editorial", "Páginas", "Año de Edicion"};
      
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(Codigo) as total FROM Libros");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){
            System.err.println("Error al contar tuplas\n" + e.getMessage());
        }
        Object[][] data = new String[registros][6];
        try{
          
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT * FROM Libros");
            ResultSet res = pstm.executeQuery();
            int i=0;
            while(res.next()){
                data[i][0] = res.getString("Codigo");
                data[i][1] = res.getString("Titulo");
                data[i][2] = res.getString("Ejemplares");
                data[i][3] = res.getString("Editorial");
                data[i][4] = res.getString("Paginas");
                data[i][5] = res.getString("AnyoEdicion");
            i++;
            }
            res.close();
            tablemodel.setDataVector(data, columNames);
        }catch(SQLException e){
            System.err.println("Error al obtener datos\n" + e.getMessage());
        }
        return tablemodel;
    }
    
    public DefaultTableModel getTablaSocios(){
        DefaultTableModel tablemodel = new ModeloTablaNoEditable();
        int registros = 0;
        String[] columNames = {"Código","Nombre","Apellidos","Edad", "Dirección", "Teléfono"};
      
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(Codigo) as total FROM Socios");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){
            System.err.println("Error al contar tuplas\n" + e.getMessage());
        }
        Object[][] data = new String[registros][6];
        try{
          
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT * FROM Socios");
            ResultSet res = pstm.executeQuery();
            int i=0;
            while(res.next()){
                data[i][0] = res.getString("Codigo");
                data[i][1] = res.getString("Nombre");
                data[i][2] = res.getString("Apellidos");
                data[i][3] = res.getString("Edad");
                data[i][4] = res.getString("Direccion");
                data[i][5] = res.getString("Telefono");
            i++;
            }
            res.close();
            tablemodel.setDataVector(data, columNames);
        }catch(SQLException e){
            System.err.println("Error al obtener datos\n" + e.getMessage());
        }
        return tablemodel;
    }
    
    public DefaultTableModel getTablaPrestamos(){
        DefaultTableModel tablemodel = new ModeloTablaNoEditable();
        int registros = 0;
        String[] columNames = {"Código","Código de Libro","Título","Código de Socio", "Nombre"};
      
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(Codigo) as total FROM Prestamos");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){
            System.err.println("Error al contar tuplas\n" + e.getMessage());
        }
        Object[][] data = new String[registros][5];
        try{
          
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT * FROM Prestamos");
            ResultSet res = pstm.executeQuery();
            int i=0;
            while(res.next()){
                data[i][0] = res.getString("Codigo");
                data[i][1] = res.getString("CodigoLibro");
                data[i][2] = res.getString("Titulo");
                data[i][3] = res.getString("CodigoSocio");
                data[i][4] = res.getString("Nombre");
            i++;
            }
            res.close();
            tablemodel.setDataVector(data, columNames);
        }catch(SQLException e){
            System.err.println("Error al obtener datos\n" + e.getMessage());
        }
        return tablemodel;
    }
}