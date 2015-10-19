package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class database {
    
    private String bd;
    private Connection con;
    private java.sql.Statement sql;
    private PreparedStatement pst;
    private ResultSet reader;
    
    private void conexionBD(){
        try{
            String controlados = "org.sqlite.JDBC";//Definir
            Class.forName(controlados).newInstance();
            System.out.println("Conexión realizada con éxito");
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException e){
            JOptionPane.showMessageDialog(null,"Error al carga el controlador.");
        }
    }
}