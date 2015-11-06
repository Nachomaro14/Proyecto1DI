package ModeloCiencias;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSQLite{
    
    Connection conn;
    
    public ConexionSQLite(){
        try{
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:ProyectoUniversidad.db3");
            System.out.println("Conexion SQLite realizada con exito.");
        }catch(SQLException ex){
            System.out.println("Conexion NO realizada con exito por error de SQL.");
            System.err.println(ex.getMessage());
        }catch(ClassNotFoundException e){
            System.out.println("Conexion NO realizada con exito por error de Class.");
            System.err.println(e.getMessage());
        }
    }
    
    public Connection getConexion(){
        return this.conn;
    }
}