package if_else;
import java.util.Scanner;

public class impa_par {
    public static void main(String[] args) { 
        Scanner s = new Scanner(System.in);

        System.out.println("Digite qualquer numero: ");
        int numero = s.nextInt();


        if (numero % 2 == 0) {
          System.out.println("O numero "+ numero + " é par");   
        }else{
          System.out.println("O numero "+ numero + " é impar");

        }
    }  
}
