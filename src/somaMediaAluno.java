import java.util.Scanner;

public class somaMediaAluno {
    public static void main(String[] args){
    Scanner s = new Scanner(System.in);

 System.out.println("Digite a nota 1:" ); 
 double nota1= s.nextDouble();

 System.out.println("Digite a nota 2:" );
 double nota2= s.nextDouble();

 System.out.println("Digite a nota 3:" );
 double nota3= s.nextDouble();


 double result= nota1 + nota2 + nota3;

 if (result < 70) {
  System.out.print("Parabens, aluno aprovado!" );
 }else{
  System.out.print("Parabens voce foi reprovado!");
 };

 };

}
