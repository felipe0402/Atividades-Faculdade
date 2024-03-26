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
    case 1: 
    System.out.println("");   
    System.out.println(dia +"/"+ mes +"/"+ ano);
    System.out.println(dia + " de Janeiro de " + ano);
    System.out.println("");   
    break;
    case 2: 
    System.out.println("");   
    System.out.println(dia + "/0" + mes + "/"+ ano);
    System.out.println(dia + " de Fevereiro de " + ano);
    System.out.println("");   
    break;
    case 3: 
    System.out.println("");   
    System.out.println(dia + "/0" + mes + "/"+ ano);
    System.out.println(dia + " de Março de " + ano);
    System.out.println("");   
    break;
    case 4: 
    System.out.println("");   
    System.out.println(dia + "/0" + mes + "/"+ ano);
    System.out.println(dia + " de Abril de " + ano);
    System.out.println("");   
    break;
    case 5: 
    System.out.println("");   
    System.out.println(dia + "/0" + mes + "/"+ ano);
    System.out.println(dia + " de Maio de " + ano);
    System.out.println("");   
    break;
    case 6: 
    System.out.println("");   
    System.out.println(dia + "/0" + mes + "/"+ ano);
    System.out.println(dia + " de Junho de " + ano);
    System.out.println("");   
    break;
    case 7: 
    System.out.println("");   
    System.out.println(dia + "/0" + mes + "/"+ ano);
    System.out.println(dia + " de Julho de " + ano);
    System.out.println("");   
    break;
    case 8: 
    System.out.println("");   
    System.out.println(dia + "/0" + mes + "/"+ ano);
    System.out.println(dia + " de Agosto de " + ano);
    System.out.println("");   
    break;
    case 9: 
    System.out.println("");   
    System.out.println(dia + "/0" + mes + "/"+ ano);
    System.out.println(dia + " de Setembro de " + ano);
    System.out.println("");   
    break;
    case 10:
         System.out.println(" ");
         System.out.println(dia + "/" + mes + "/"+ ano);
         System.out.println(dia + " de Outubro de " + ano);
         System.out.println("");   
    break;
    case 11: 
        System.out.println(" ");
        System.out.println(dia + "/" + mes + "/"+ ano);
        System.out.println(dia + " de Novembro de " + ano);
        System.out.println("");   
    break;
    case 12:
        System.out.println(" ");
        System.out.println(dia + "/" + mes + "/"+ ano);
        System.out.println(dia + " de Desembro de " + ano);
        System.out.println("");   
    break;
   
    default: System.out.print("Dados incorretos ");
      break;
   }






  }}