public class HilosPrioridades extends Thread{
    HilosPrioridades(String nom){
        this.setName(nom);
    }
    
    public void run(){
        System.out.println("Ejecutando [" + getName() + "]");
        for(int i = 1; i <= 5; i++){
            System.out.println("\t(" + getName() + ": " + i + ")");
        }
    }
    
    public static void main(String[] args){
        HilosPrioridades h1 = new HilosPrioridades("Uno");
        HilosPrioridades h2 = new HilosPrioridades("Dos");
        HilosPrioridades h3 = new HilosPrioridades("Tres");
        HilosPrioridades h4 = new HilosPrioridades("Cuatro");
        HilosPrioridades h5 = new HilosPrioridades("Cinco");
        
        h1.setPriority(Thread.NORM_PRIORITY);
        h2.setPriority(Thread.MIN_PRIORITY);
        h3.setPriority(3);
        h4.setPriority(Thread.MAX_PRIORITY);
        h5.setPriority(7);
        
        h3.start();
        h1.start();
        h5.start();
        h2.start();
        h4.start();
        
    }
}