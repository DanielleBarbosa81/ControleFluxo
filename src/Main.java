import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero1 = scan.nextInt();

        System.out.println("Digite outro número inteiro: ");
        int numero2 = scan.nextInt();

        try {
            contar(numero1, numero2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("o segundo número deve ser maior que o primeiro.");
        }

        scan.close();
    }

    static void contar(int numero1, int numero2) throws ParametrosInvalidosException {
        if (numero1 > numero2) {
            throw new ParametrosInvalidosException();
        }

        int contagem = numero2 - numero1;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número :  " + i);
        }
    }
}
