import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class DobleHilo extends Applet implements ActionListener{
    
    private Thread h1, h2;
    public long contador1, contador2;
    private boolean parar1, parar2;
    private Font fuente;
    private Button b1, b2;

    class HiloContador extends Thread{
        
        public void start(){
            
        }
        
        public void init(){
            setBackground(Color.yellow);
        }
        
        public void run(){
            
        }
    }
    
    public void actionPerformed(ActionEvent e) {
        
    }
    
    
}