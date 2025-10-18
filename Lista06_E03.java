import java.util.Scanner;

public class Lista06_E03 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int[] notas = new int[4];
        int soma=0;
        double media;

        System.out.println("Digite 4 notas:");
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Nota %d: ", i + 1);
            notas[i] = scanner.nextInt();
        }

        System.out.println("Notas informados: ");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota "+ (i+1) +": " + notas[i] + ". ");
            soma += notas[i];

        }
        media = (double) soma / notas.length;
        System.out.printf("Média das notas: %.2f\n", media);


        scanner.close();
    }
}