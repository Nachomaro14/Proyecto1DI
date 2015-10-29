
import java.util.Scanner;

public class Suma {
    
    public static void main(String[] args){
        int n1 = 0;
        int n2 = 0;
        int sum;
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduzca un numero");
        try{
            n1 = s.nextInt();
        }catch(Exception e){
            System.out.println("Introduca un numero valido");
        }
        
        System.out.println("Introduzca otro numero");
        try{
            n2 = s.nextInt();
        }catch(Exception e){
            System.out.println("Introduca un numero valido");
        }
        
        sum = n1 + n2;
        
        System.out.println("La suma de los numeros introducidos es:\n"
                + n1 + " + " + n2 + " = " + sum);
    }
}