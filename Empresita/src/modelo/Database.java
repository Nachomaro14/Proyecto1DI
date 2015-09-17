package modelo;
import java.sql.*;

public class Database {
    
    private String db = "dam26_dbtest";
    private String user = "dam26";
    private String password = "Mazuecos14";
    private String url = "jdbc:mysql://192.168.48.2:3306/"+db;
    private Connection conn = null;

    public Database(){
        this.url = "jdbc:mysql://192.168.48.2:3306/"+this.db;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection( this.url, this.user , this.password );         
        }catch(SQLException e){
            System.err.println( e.getMessage() );
        }catch(ClassNotFoundException e){
            System.err.println( e.getMessage() );
        }
    }

   public Connection getConexion()
   {
    return this.conn;
   }
}