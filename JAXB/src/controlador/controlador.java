package controlador;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import modelo.modelo;
import vista.interfaz;

public class controlador {
    
    interfaz vista ;
    modelo modelo = new modelo();    
    
    public enum AccionMVC{
        
    }
    
    public controlador(interfaz vista){
        this.vista = vista;
    }
    
    public void iniciar(){
        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(vista);
            vista.setLocationRelativeTo(null);
            vista.setVisible(true);
        }catch (UnsupportedLookAndFeelException ex){}
        catch (ClassNotFoundException ex){}
        catch (InstantiationException ex){}
        catch (IllegalAccessException ex){}
    }
}