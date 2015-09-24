package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import modelo.modelo;
import vista.interfaz;

public class controlador implements ActionListener{
    
    interfaz vista ;
    modelo modelo = new modelo();
    String[] nombreMunicipios;
    int[] demandantes;
    int[] parados;
    int[] diferencia;
    
    public enum AccionMVC{
        
        btnCalcular
    }
    
    public controlador(interfaz vista){
        this.vista = vista;
    }
    
    public void iniciar(){
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(vista);
            vista.pack();
            vista.setVisible(true);
        } catch (UnsupportedLookAndFeelException ex){}
          catch (ClassNotFoundException ex){}
          catch (InstantiationException ex){}
          catch (IllegalAccessException ex){}
        
        this.vista.btnCalcular.setActionCommand("btnCalcular");
        this.vista.btnCalcular.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        switch (AccionMVC.valueOf(e.getActionCommand())){
            case btnCalcular:
                
                int cuenta = this.modelo.cuenta();
                
                int i;
                
                nombreMunicipios = this.modelo.nombresMunicipios(cuenta);
                diferencia = new int[cuenta];
                
                if(this.vista.trimestre.getSelectedIndex() == 0){
                    
                    int mayor = 0;
                    String mun = "";
                    
                    demandantes = this.modelo.dtes1(cuenta);
                    parados = this.modelo.paro1(cuenta);
                    
                    for(i = 0; i <= cuenta - 1; i++){
                        if(parados[i] > demandantes[i]){
                            int d = parados[i] - demandantes[i];
                            diferencia[i] = d;
                        }else{
                            int d = demandantes[i] - parados[i];
                            diferencia[i] = d;
                        }
                    }
                    
                    for(i = 0; i <= cuenta - 1; i++){
                        if (diferencia[i] > mayor){
                            mayor = diferencia[i];
                            mun = nombreMunicipios[i];
                        }
                    }
                    
                    this.vista.municipio.setText(mun);
                    this.vista.diferencia.setText(String.valueOf(mayor));
                    
                }else if(this.vista.trimestre.getSelectedIndex() == 1){
                    
                    int mayor = 0;
                    String mun = "";
                    
                    demandantes = this.modelo.dtes2(cuenta);
                    parados = this.modelo.paro2(cuenta);
                    
                    for(i = 0; i <= cuenta - 1; i++){
                        if(parados[i] > demandantes[i]){
                            int d = parados[i] - demandantes[i];
                            diferencia[i] = d;
                        }else{
                            int d = demandantes[i] - parados[i];
                            diferencia[i] = d;
                        }
                    }
                    
                    for(i = 0; i <= cuenta - 1; i++){
                        if (diferencia[i] > mayor){
                            mayor = diferencia[i];
                            mun = nombreMunicipios[i];
                        }
                    }
                    
                    this.vista.municipio.setText(mun);
                    this.vista.diferencia.setText(String.valueOf(mayor));
                    
                }else if(this.vista.trimestre.getSelectedIndex() == 2){
                    
                    int mayor = 0;
                    String mun = "";
                    
                    demandantes = this.modelo.dtes3(cuenta);
                    parados = this.modelo.paro3(cuenta);
                    
                    for(i = 0; i <= cuenta - 1; i++){
                        if(parados[i] > demandantes[i]){
                            int d = parados[i] - demandantes[i];
                            diferencia[i] = d;
                        }else{
                            int d = demandantes[i] - parados[i];
                            diferencia[i] = d;
                        }
                    }
                    
                    for(i = 0; i <= cuenta - 1; i++){
                        if (diferencia[i] > mayor){
                            mayor = diferencia[i];
                            mun = nombreMunicipios[i];
                        }
                    }
                    
                    this.vista.municipio.setText(mun);
                    this.vista.diferencia.setText(String.valueOf(mayor));
                    
                }else if(this.vista.trimestre.getSelectedIndex() == 3){
                    
                    int mayor = 0;
                    String mun = "";
                    
                    demandantes = this.modelo.dtes4(cuenta);
                    parados = this.modelo.paro4(cuenta);
                    
                    for(i = 0; i <= cuenta - 1; i++){
                        if(parados[i] > demandantes[i]){
                            int d = parados[i] - demandantes[i];
                            diferencia[i] = d;
                        }else{
                            int d = demandantes[i] - parados[i];
                            diferencia[i] = d;
                        }
                    }
                    
                    for(i = 0; i <= cuenta - 1; i++){
                        if (diferencia[i] > mayor){
                            mayor = diferencia[i];
                            mun = nombreMunicipios[i];
                        }
                    }
                    
                    this.vista.municipio.setText(mun);
                    this.vista.diferencia.setText(String.valueOf(mayor));
                    
                }
                break;
        }
    }
}