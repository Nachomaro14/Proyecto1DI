public class TIC extends Thread{
    
    int infinito = 1;
    
    public void run(){
        while(infinito == 1){
            System.out.println("TIC");
            try{
                Thread.sleep(2000);
            }catch(InterruptedException ie){
                System.out.println(ie.getMessage());
            }
        }
    }
}