import java.util.Scanner;

public class Lista06_E07 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int[] numeros = new int[5];
        int soma = 0, multiplicacao = 1;
        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
            multiplicacao *= numeros[i];
        }

        System.out.println("\nResultados:");
        System.out.println("Soma: " + soma);
        System.out.println("Multiplicação: " + multiplicacao);
        System.err.print("Números digitados:");
        for (int num : numeros) {
            System.err.print(num+ " ");
        }

        scanner.close();
    }
}