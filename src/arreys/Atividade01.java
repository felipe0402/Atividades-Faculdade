package arreys;

import java.util.Scanner;

public class Atividade01 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int[] arreys01 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    int soma = 0;

    for (int i = 0; i < arreys01.length; i++) {
      soma = soma + arreys01[i];
      System.out.println(soma);

    }
  }

}
