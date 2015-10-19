package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class database{
    
    private String bd;
    private Connection con;
    private java.sql.Statement sql;
    private PreparedStatement pst;
    private ResultSet reader;
    
    private void conexionBD(){
        try{
            String controlador = "org.sqlite.JDBC";
            Class.forName(controlador).newInstance();
            System.out.println("Conexión realizada con éxito");
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException e){
            JOptionPane.showMessageDialog(null,"Error al cargar el controlador.");
        }
    }
    
    private void cargarbd(){
        try{
            bd = "jdbc:sqlite:---------------------"; //Aquí he de introducir la ruta de la base de datos local
            con = DriverManager.getConnection(bd,null,null);
            System.out.println("BD cargada con éxito.");

        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error al cargar la BD.");
        }
    }
}