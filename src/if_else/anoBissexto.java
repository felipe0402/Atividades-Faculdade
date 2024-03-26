package if_else;
import java.time.Year;
import java.util.Scanner;

public class anoBissexto {


  public static void main(String[] args){
    Scanner  s = new Scanner(System.in);
    System.out.println(" ");

  System.out.println("Verificador de ano bissexto");
  System.out.println(" ");
  System.out.println("Isira o ano que deseja verificar: ");
  int ano = s.nextInt();
  System.out.println(" ");

  if (ano % 400 == 0) {
    System.out.println(ano + " é bissexto ");
  }else if(ano % 4 == 0 && ano % 100 != 0){
    System.out.println(ano + " é bissexto ");
  }else{
    System.out.println(ano + " Nao é bissexto ");
  } 
  
  System.out.println(" ");






  }  
}
