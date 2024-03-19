import java.util.Scanner;

public class and_or {

  public static void main (String[] args){
    Scanner s = new Scanner(System.in);

    System.out.println("Digite a nota do aluno: ");
    int nota = s.nextInt();

    System.out.println("Digite a frequencia do aluno: ");
    int frequencia = s.nextInt();
   

    // Com && = OS 2 TEM QUER SER VERDADEIROS 
    if (nota >=70 && frequencia >=70) {
      System.out.print("Aluno aprovado");
    }else{
      System.out.print("Aluno reprovado");
    };

  // Com || = SE 1 FOR VERDADEIRO ELE JA SERA APROVADO 
   /* if (nota >=70 && frequencia >=70) {
      System.out.print("Aluno aprovado");
    }else{
      System.out.print("Aluno reprovado");
    };*/



  }
  
}
