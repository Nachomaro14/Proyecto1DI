package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSQLite{
    
    Connection connect;
    
    public ConexionSQLite(){
        try{
            Class.forName("org.sqlite.JDBC");
            connect = DriverManager.getConnection("jdbc:sqlite:ProyectoUniversidad.db3");
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