package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class modelo extends database{
    
    public modelo (){}
    
    public int cuenta(){
        int num = 0;
        String q = "SELECT COUNT(Municipio) AS Cuenta FROM DtesEmpleo WHERE Comunidad_autonoma = 'Andalucía'";
        try {
            PreparedStatement pstm = this.getConexion().prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            while(res.next()){
                num = res.getInt("Cuenta");
            }
            res.close();
        }catch(SQLException e){
            System.out.println("Error al contar.");
        }
        return num;
    }
    
    public String[] nombresMunicipios(int c){
        String[] municipios = new String[c];
        try{
          
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT Municipio FROM DtesEmpleo WHERE Comunidad_autonoma = 'Andalucía'");
            ResultSet res = pstm.executeQuery();
            int i=0;
            while(res.next()){
                municipios[i] = res.getString("Municipio");
            i++;
            }
            res.close();
        }catch(SQLException e){
            System.out.println("Error al obtener nombres.");
        }
        return municipios;
    }
    
    public int[] dtes1(int c){
        int[] demandantes = new int[c];
        try{
          
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT (Dtes_empleo_hombre_edad_menor25 + Dtes_empleo_mujer_edad_menor25) AS Demandantes FROM DtesEmpleo WHERE Comunidad_autonoma = 'Andalucía' AND Codigo_mes IN (201401, 201402, 201403) GROUP BY Municipio");
            ResultSet res = pstm.executeQuery();
            int i=0;
            while(res.next()){
                demandantes[i] = res.getInt("Demandantes");
            i++;
            }
            res.close();
        }catch(SQLException e){
            System.out.println("Error demandantes 1.");
        }
        return demandantes;
    }
    
    public int[] dtes2(int c){
        int[] demandantes = new int[c];
        try{
          
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT (Dtes_empleo_hombre_edad_menor25 + Dtes_empleo_mujer_edad_menor25) AS Demandantes FROM DtesEmpleo WHERE Comunidad_autonoma = 'Andalucía' AND Codigo_mes IN (201404, 201405, 201406) GROUP BY Municipio");
            ResultSet res = pstm.executeQuery();
            int i=0;
            while(res.next()){
                demandantes[i] = res.getInt("Demandantes");
            i++;
            }
            res.close();
        }catch(SQLException e){
            System.out.println("Error demandantes 2.");
        }
        return demandantes;
    }
    
    public int[] dtes3(int c){
        int[] demandantes = new int[c];
        try{
          
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT (Dtes_empleo_hombre_edad_menor25 + Dtes_empleo_mujer_edad_menor25) AS Demandantes FROM DtesEmpleo WHERE Comunidad_autonoma = 'Andalucía' AND Codigo_mes IN (201407, 201408, 201409) GROUP BY Municipio");
            ResultSet res = pstm.executeQuery();
            int i=0;
            while(res.next()){
                demandantes[i] = res.getInt("Demandantes");
            i++;
            }
            res.close();
        }catch(SQLException e){
            System.out.println("Error demandantes 3.");
        }
        return demandantes;
    }
    
    public int[] dtes4(int c){
        int[] demandantes = new int[c];
        try{
          
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT (Dtes_empleo_hombre_edad_menor25 + Dtes_empleo_mujer_edad_menor25) AS Demandantes FROM DtesEmpleo WHERE Comunidad_autonoma = 'Andalucía' AND Codigo_mes IN (201410, 201411, 201412) GROUP BY Municipio");
            ResultSet res = pstm.executeQuery();
            int i=0;
            while(res.next()){
                demandantes[i] = res.getInt("Demandantes");
            i++;
            }
            res.close();
        }catch(SQLException e){
            System.out.println("Error demandantes 4.");
        }
        return demandantes;
    }
    
    public int[] paro1(int c){
        int[] demandantes = new int[c];
        try{
          
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT (Paro_hombre_edad_entre2545 + Paro_hombre_edad_mayorigual45 + Paro_mujer_edad_entre2545 + Paro_mujer_edad_mayorigual45) AS Parados FROM Paro WHERE Comunidad_autonoma = 'Andalucía' AND Codigo_mes IN (201401, 201402, 201403) GROUP BY Municipio");
            ResultSet res = pstm.executeQuery();
            int i=0;
            while(res.next()){
                demandantes[i] = res.getInt("Parados");
            i++;
            }
            res.close();
        }catch(SQLException e){
            System.out.println("Error parados 1.");
            System.err.println(e.getMessage());
        }
        return demandantes;
    }
    
    public int[] paro2(int c){
        int[] demandantes = new int[c];
        try{
          
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT (Paro_hombre_edad_entre2545 + Paro_hombre_edad_mayorigual45 + Paro_mujer_edad_entre2545 + Paro_mujer_edad_mayorigual45) AS Parados FROM Paro WHERE Comunidad_autonoma = 'Andalucía' AND Codigo_mes IN (201404, 201405, 201406) GROUP BY Municipio");
            ResultSet res = pstm.executeQuery();
            int i=0;
            while(res.next()){
                demandantes[i] = res.getInt("Parados");
            i++;
            }
            res.close();
        }catch(SQLException e){
            System.out.println("Error parados 2.");
        }
        return demandantes;
    }
    
    public int[] paro3(int c){
        int[] demandantes = new int[c];
        try{
          
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT (Paro_hombre_edad_entre2545 + Paro_hombre_edad_mayorigual45 + Paro_mujer_edad_entre2545 + Paro_mujer_edad_mayorigual45) AS Parados FROM Paro WHERE Comunidad_autonoma = 'Andalucía' AND Codigo_mes IN (201407, 201408, 201409) GROUP BY Municipio");
            ResultSet res = pstm.executeQuery();
            int i=0;
            while(res.next()){
                demandantes[i] = res.getInt("Parados");
            i++;
            }
            res.close();
        }catch(SQLException e){
            System.out.println("Error parados 3.");
        }
        return demandantes;
    }
    
    public int[] paro4(int c){
        int[] demandantes = new int[c];
        try{
          
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT (Paro_hombre_edad_entre2545 + Paro_hombre_edad_mayorigual45 + Paro_mujer_edad_entre2545 + Paro_mujer_edad_mayorigual45) AS Parados FROM Paro WHERE Comunidad_autonoma = 'Andalucía' AND Codigo_mes IN (201410, 201411, 201412) GROUP BY Municipio");
            ResultSet res = pstm.executeQuery();
            int i=0;
            while(res.next()){
                demandantes[i] = res.getInt("Parados");
            i++;
            }
            res.close();
        }catch(SQLException e){
            System.out.println("Error parados 4.");
        }
        return demandantes;
    }
}