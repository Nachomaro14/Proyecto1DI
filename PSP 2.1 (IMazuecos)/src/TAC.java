public class TAC extends Thread{
    
    int infinito = 1;
    
    public void run(){
        while(infinito == 1){
            try{
                Thread.sleep(1000);
                System.out.println("TAC");
                Thread.sleep(1000);
            }catch(InterruptedException ie){
                System.out.println(ie.getMessage());
            }
        }
    }
}