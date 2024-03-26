package if_else;
import java.util.Scanner;

public class nomeIdade {
     public static void main(String[] args) { 
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o nome da primeira pessoa: ");
        String nome1 = s.nextLine();
        System.out.println("Digite o ano de nacimento " + "da primeira pessoa: ");
        int idade1 = s.nextInt();

        s.nextLine();

        System.out.println("Digite o nome da segunda pessoa: ");
        String nome2 = s.nextLine();
        System.out.println("Digite o ano de nacimento da segunda pessoa: ");
        int idade2 = s.nextInt();

      int idade_1= 2024 - idade1;
      int idade_2= 2024 - idade2;

      if (idade1 > idade2) {
        System.out.println(nome1 + "e mais novo que " + nome2);
        
      }







      
      
      
      





   }
}
