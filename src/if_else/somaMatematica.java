package if_else;
import java.util.Scanner;

public class somaMatematica{
    public static void main(String[] args){
        
      //Atividade-1 e 2
Scanner s = new Scanner(System.in);       //<--- Ativa o Teclado

        System.out.println("Digite o numero 1:");  //<-- Solicitar dados
        int num1= s.nextInt();              // <-- Variavel que amazenara os dado    
        
        System.out.println("Digite o numero 2:");   // <-- Solicitar dados
        int num2 = s.nextInt();              //<-- Variavel que amazenara os dado    
        
        System.out.println("Digite o numero 3:"); // <-- Solicitar dados
        int num3 = s.nextInt();                    //  <-- Variavel que amazenara os dado    
                
        System.out.println("A media dos 3 sao:" + (num1*3 + num2*8 + num3*8)/3);
    }}


        // Atividade 03

        /* System.out.println("Digite o numero  do lado do quadrado:");
        int Quadrado= s.nextInt();

        System.out.println("A área do quadrado é:" + Quadrado * Quadrado ); */


        // Atividade 04

        /*System.out.println("Digite o raio do círculo:");
        int Raio= s.nextInt();

        System.out.println("A área do circulo é:" + Math.PI * Math.pow(Raio, 2) ); 

        
        // Atividade 05

        System.out.println("Digite seu peso:");
        int Peso= s.nextInt();

        System.out.println("Digite sua altura:");
        int altura= .nextInt();

        System.out.println("Seu IMC e:" + ((altura * altura) / Peso ));
    }
     
    
}
*/