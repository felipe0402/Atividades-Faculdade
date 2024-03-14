import java.util.Scanner;

public class validaSenha {

  public static void main (String[] args){
  //Ativando teclado 
    Scanner s = new Scanner(System.in);
    
  //Solicitando email e senha do usuario
    System.out.println("\nEmail: ");
    String email = s.nextLine();
    System.out.println("Senha:");
    String senha = s.nextLine();

  // Usuario cadastrado 
    String user_email = "movidoAcafe@gmail.com";
    String user_senha = "movidoAcafe";

  //Verificando email e senha
  if (senha.equals(user_senha) && email.equals(user_email)) {
    System.out.println("\nAcesso liberado\n");
  }else{
    System.out.print("\nAcesso negado \nEmail ou Senha nao cadastrado\n\n");
  }


  }
  
}
