import java.util.Scanner;
public class DesafioControleFluxo {
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);    
       System.out.println("Digite um numero: ");
       int numero1 = scanner.nextInt();
         
         System.out.println("Digite outro numero: ");
       int numero2 = scanner.nextInt();
      
       for( int  = numero ; numero2 > numero1; numero1++){
           if (numero1 % 2 == 0) {
               System.out.println(numero1 + " é par.");
           } else {
               System.out.println(numero1 + " é ímpar.");
           }
        }
    }
    

