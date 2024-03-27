package loops;
import java.util.Scanner;

public class AtividadeFor {
public static void main(String[] args){
  Scanner s = new Scanner(System.in);

/*for(int i =0; i < 13; ++i){
 System.out.print("Eu gosto de fazer execicios de programaçao");
};*/

/*int nunber = 0;
for(int i = 1; i<14; ++i){
  nunber += i;
  System.out.println(nunber);
}*/

/*System.out.println("Digite seu nome: ");
String nome = s.nextLine();
System.out.println("Digite um numero: ");
int nuber = s.nextInt();

for(int i = 0; i < nuber; ++i){
  System.out.println(nome);
}
*/

/*int idade = 0;
for(int i = 1; i<6; ++i){
  System.out.println("Digite a idade da pessoa" + i + ":");
  idade += s.nextInt();
}
System.out.println("A media da idade: " + (idade / 5));*/


/*int idade = 0;
int idademaior= 0;
for(int i = 1; i<6; ++i){
  System.out.println("Digite a idade da pessoa" + i + ":");
  idade = s.nextInt();

if( idade >= 18){
  idademaior++;
  System.out.println(idademaior + " Pessoas maiore de idade");
}
}*/

/*System.out.println("Digite um nmero: ");
int numero = s.nextInt();
for(int i = 0; i < 10 ; ++i){
  System.out.println(numero + " X " + i +  " = " + (numero * i));
}*/


/*int contar = 0;
for(int i = 1; i < 6 ; ++i){
System.out.println("Digite um nomero " + i + ":");
int numero = s.nextInt();   

if(numero >= 0 && numero <=50){
contar++;
}
}  
System.out.println("Os numeros que estao entre 0 e 50 sao: " + contar);*/


/*System.out.println("Digite o um nome: ");
String  nome = s.nextLine();   

for(int i = 0; i < nome.length(); ++i){
  System.out.println(nome.charAt(i));
}*/

/*int soma = 0;
for(int i = 1; i < 9999; ++i ){
  System.out.println("Digite um nomero:"  );
  int numero = s.nextInt();   

  if( numero < 0){
    break;
  } 
  soma += numero;
}
System.out.println(soma);*/

for(int i = 0; i < 21; ++i ){
  if (i % 2 == 0) {
    System.out.println("O numero "+ i + " é par");   
  }else{
    System.out.println("O numero "+ i + " é impar");

  }

}
}}
