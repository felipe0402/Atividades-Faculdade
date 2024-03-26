package switch_case;

import java.util.Scanner;

public class calculadora {
  public static void main(String[] args) { 
      Scanner s = new Scanner(System.in);

      System.out.println("Digite o primeiro numero: ");
      Double num1 = s.nextDouble();
      System.out.println("Digite o segundo numero: ");
      Double num2 = s.nextDouble();
      
      System.out.println("ESCOLHA A OPERAÇAO MATEMATICA");
      System.out.println("1\t Adiçao ");
      System.out.println("2\t Subtraçao");
      System.out.println("3\t Multiplicaçao");
      System.out.println("4\t Divisão");
      int modoSoma = s.nextInt();


     switch (modoSoma) {
      case 1 : System.out.println( "A soma e ingual: " + (num1 + num2));
      break;
      case 2 : System.out.println( "A Subtraçao é ingual: " + (num1 - num2));
      break;
      case 3 : System.out.println( "A Multiplicaçao é ingual:: " + (num1 * num2));
      break;
      case 4 : System.out.println( "A Divisão é ingual:: " + (num1 / num2));
      break;
    
      default: System.out.println("Dados nao suportados");
        break;
     }
    
    
    
    }
  
}
