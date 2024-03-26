import java.util.Scanner;

public class switch_case_ler1_7 {
  public static void main(String[] args) { 
      Scanner s = new Scanner(System.in);

      System.out.println("Didite o dia da semana [EX: DOMINGO SENDO = 1]:");
      int semanaDia = s.nextInt();

      switch (semanaDia) {
        case 1: System.out.println("Domingo");
        break;
        case 2: System.out.println("Segunda-feira");
        break;
        case 3: System.out.println("Terça-feira");
        break;
        case 4: System.out.println("Quarta-feira");
        break;
        case 5: System.out.println("Quinta-feira");
        break;
        case 6: System.out.println("Sexta-feira");
        break;
        case 7: System.out.println("Sabado");
        break;
      
        default:
          break;
      }
     
  }
}
