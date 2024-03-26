package if_else;
import java.util.Scanner;

public class pesoXmarte {

public static void main(String[] args){
Scanner s = new Scanner(System.in);

System.out.println("");
System.out.println("1 Marte ");
System.out.println("2 Lua ");
System.out.println("Opçao: ");

int opcao = s.nextInt();

if (opcao == 1) {
  System.out.println("Digite seu peso:  ");
  double peso = s.nextDouble();
  System.out.println("Seu peso  em Marte sera: " + (peso / 9.81) * 3.6);
} 
else if(opcao == 2){
System.out.println("Digite seu peso:  ");
double peso = s.nextDouble();
System.out.println("Seu peso  em Marte sera: " + (peso / 9.81) * 1.6);
}else{
  System.out.println("ERROR tente novamente");
}

}
}
