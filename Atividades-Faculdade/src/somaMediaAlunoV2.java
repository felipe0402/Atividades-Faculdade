import java.util.Scanner;


public class atividade2 {
  public static void main(String[] args){
  Scanner s = new Scanner(System.in);

  System.out.print("DIGITE A SUA NOTA DE 1-10");

  System.out.println("Digite a norta 1:");
  double nota1=s.nextDouble();

  System.out.println("Digite a norta 2:");
  double nota2=s.nextDouble();

  System.out.println("Digite a norta 3:");
  double nota3=s.nextDouble();

  double result = nota1 + nota2 + nota3;

  if (result <= 7) {
    System.out.print("Parabens, aluno aprovado!" );
  }
   else if(result > 6.9 ){
    System.out.print("Parabens, aluno aprovado!" );
     if (result < 6 ) {
       System.out.print("Parabens, aluno aprovado!" );  
    }
    else if(result > 6){
      System.out.print("Parabens, voce foi reprovado!");
     };
   };
  };
}
