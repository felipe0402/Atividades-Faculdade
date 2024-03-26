import java.util.Scanner;

public class dsconProduto {

  public static void main (String[] args){
    Scanner s = new Scanner(System.in);

    System.out.println("Nome do produto:");
    String produto = s.nextLine();
    System.out.println("Preço do " + produto +": R$");
    int valor = s.nextInt();

     double desconto1 = valor * 0.05;
     double desconto2 = valor * 0.06;
     double desconto3 = valor * 0.07;
     double desconto4 = valor * 0.08;


    if (valor >= 5 && valor < 200) {
      System.out.print
      ("------------------------------[ SYSTEM DESCONTO + ]----------------------------------- \n \n");
      System.out.print
      ("Produto: " + produto + " | Valor: R$" + valor +",00" + " | Valor com desconto: R$" + (valor - desconto1) );
      
       System.out.print
      ("\n \n-------------------------------------------------------------------------------------- \n \n");
    }
    
    else if(valor >=200 && valor < 500){
      System.out.print
      ("------------------------------[ SYSTEM DESCONTO + ]----------------------------------- \n \n");
      System.out.print
      ("Produto: " + produto + " | Valor: R$" + valor +",00" + " | Valor com desconto: R$" + (valor - desconto2) );
       System.out.print
      ("\n \n-------------------------------------------------------------------------------------- \n \n");
    }
    
    else if(valor >= 500 && valor < 1000){
      System.out.print
      ("------------------------------[ SYSTEM DESCONTO + ]----------------------------------- \n \n");
      System.out.print
      ("Produto: " + produto + " | Valor: R$" + valor +",00" + " | Valor com desconto: R$" + (valor - desconto3) );
       System.out.print
      ("\n \n-------------------------------------------------------------------------------------- \n \n");
    }
    
    else if(valor >= 1000){
      System.out.print
      ("------------------------------[ SYSTEM DESCONTO + ]----------------------------------- \n \n");
      System.out.print
      ("Produto: " + produto + " | Valor: R$" + valor +",00"  + " | Valor com desconto: R$" + (valor - desconto4) );
       System.out.print
      ("\n \n-------------------------------------------------------------------------------------- \n \n");
    }
    
    else if(valor >= 0 ){
      System.out.println("Valor invalido");
    };
  }  
}
