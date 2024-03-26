import java.util.Scanner;

public class switch_case_atvd_01 { 
  public static void main(String[] args) { 
      Scanner s = new Scanner(System.in);

      System.out.println("Didite o Dia:");
      int dia = s.nextInt();
      System.out.println("Didite o Mes:");
      int mes = s.nextInt();
      System.out.println("Didite o Ano:");
      int ano = s.nextInt();


   switch (mes) {
    case 1: System.out.println(dia + " Janeiro " + ano);
    break;
    case 2: System.out.println(dia + " Fevereiro " + ano);
    break;
    case 3: System.out.println(dia + " Março " + ano);
    break;
    case 4: System.out.println(dia + " Abril  " + ano);
    break;
    case 5: System.out.println(dia + " Maio " + ano);
    break;
    case 6: System.out.println(dia + " Junho " + ano);
    break;
    case 7: System.out.println(dia + " Julho " + ano);
    break;
    case 8: System.out.println(dia + " Agosto " + ano);
    break;
    case 9: System.out.println(dia + " Setembro " + ano);
    break;
    case 10: System.out.println(dia + " Outubro " + ano);
    break;
    case 11: System.out.println(dia + " Novembro " + ano);
    break;
    case 12: System.out.println(dia + " Desembro " + ano);
    break;
   
    default: System.out.println("Dados incorretos ");
      break;
   }






  }}