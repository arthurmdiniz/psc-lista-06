import java.util.Scanner;

public class Lista06_E02 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int[] vetor = new int[10];

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Número %d: ", i + 1);
            vetor[i] = scanner.nextInt();
        }

        System.out.print("Números informados: ");
        for (int i = vetor.length -1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }

        scanner.close();
    }
}