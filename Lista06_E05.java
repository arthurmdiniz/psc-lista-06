import java.util.Scanner;

public class Lista06_E05 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int[] numeros = new int[20];
        int[] pares = new int[20];
        int[] impares = new int[20];

        System.out.println("Digite 20 números inteiros:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            if (numeros[i] % 2 == 0) {
                pares[i] = numeros[i];
            } else {
                impares[i] = numeros[i];
            }
        }

        System.out.println("\nNúmeros digitados:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println("\nNúmeros pares:");
        for (int num : pares) {
            if (num != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println("\nNúmeros ímpares:");
        for (int num : impares) {
            if (num != 0) {
                System.out.print(num + " ");
            }
        }
        
        scanner.close();
    }
}