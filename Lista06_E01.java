import java.util.Scanner;

public class Lista06_E01 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int[] vetor = new int[5];

        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Número %d: ", i + 1);
            vetor[i] = scanner.nextInt();
        }

        System.out.print("Números informados: ");
        for (int num : vetor) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}