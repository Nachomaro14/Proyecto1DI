package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class database{
    
    Connection connect;
    
    public database(){
        try{
            Class.forName("org.sqlite.JDBC");
            connect = DriverManager.getConnection("jdbc:sqlite:ProyectoSQLite.db3");
            System.out.println("Conectado con éxito");
        }catch(SQLException ex){
            System.err.println("No se ha podido conectar a la base de datos\n" + ex.getMessage());
        }catch(ClassNotFoundException e){
            System.err.println("No se encuentra la clase\n" + e.getMessage());
        }
    }
    
    public Connection getConexion(){
        return this.connect;
    }
}