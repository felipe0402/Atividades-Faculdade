
import java.util.Scanner;

public class App{
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o numero 1:");
        int num1= s.nextInt();            
        
        System.out.println("Digite o numero 2:");
        int num2 = s.nextInt();
        
        System.out.println("Digite o numero 3:");
        int num3 = s.nextInt();
                
        System.out.println("A media dos 3 sao:" + (num1*3 + num2*8 + num3*8)/3 );
        

    }
     
    
}
