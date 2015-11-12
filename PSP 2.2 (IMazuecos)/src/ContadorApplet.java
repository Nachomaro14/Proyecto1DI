import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class ContadorApplet extends Applet implements ActionListener, Runnable{

    class HiloContador extends Thread{
        
        private Thread h;
        private boolean parar = false;
        private long contador = 0;
        
        public HiloContador(long contadorInicial){
            contador = contadorInicial;
        }
        
        public long getContador(){
            return contador;
        }

        public void run(){
            parar = false;
            Thread hiloActual = Thread.currentThread();
            while (h == hiloActual && !parar){
                try{
                    Thread.sleep(100);
                    contador++;
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
    
    private HiloContador h1, h2;
    private Font fuente;
    private Button b1, b2;
    
    public void start(){

    }

    public void init(){
        setBackground(Color.yellow);
        add(b1 = new Button("Finalizar Hilo 1"));
        b1.addActionListener(this);
        add(b2 = new Button("Finalizar Hilo 2"));
        b2.addActionListener(this);
        fuente = new Font("Verdana", Font.BOLD, 26);
        h1 = new HiloContador(20);
        h1.start();
        h2 = new HiloContador(0);
        h2.start();
    }

    public void run() {
        h1.run();
        h2.run();
        repaint();
    }

    public void paint(Graphics g){
        g.clearRect(0, 0, 400, 400);
        g.setFont(fuente);
        g.drawString(Long.toString((long) h1.contador), 80, 100);
        g.drawString(Long.toString((long) h2.contador), 80, 100);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1){
            if(h1 != null && h1.isAlive()){
                stopH1();
            }
        }else if(e.getSource() == b2){
            if(h2 != null && h2.isAlive()){
                stopH2();
            }
        }
    }

    public void stopH1(){
        h1 = null;
        h1.parar = true;
    }

    public void stopH2(){
        h2 = null;
        h2.parar = true;
    }
}