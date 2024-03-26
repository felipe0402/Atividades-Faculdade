package if_else;
import java.util.Scanner; 
 
public class somaSalario{ 
    public static void main(String[] args){ 
         
 
    Scanner s = new Scanner(System.in); 
    System.out.print("Digite o numero do salario: "); 
    float salario = s.nextFloat(); 
 
    double salario_total = 1412.00; 
    double salario_quanti= (salario_total * salario); 
    double acrecimo = ((10/100) + 1)* salario_quanti; 
     
    System.out.printf("O salario %.2f foi aumnetado 10 cento para  %.2f ", salario_total, acrecimo); 
 

}}