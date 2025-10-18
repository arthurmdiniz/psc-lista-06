import java.util.Scanner;

public class Lista06_E06 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        double[][] notas = new double[10][4];
        double[] medias = new double[10];
        int countAprovados = 0;
        double somaNotas;

        for (int i = 0; i < 10; i++) {
            somaNotas = 0.0;
            System.out.println("Aluno " + (i + 1) + ":");
            for (int j = 0; j < 4; j++) {
                System.out.print("  Nota " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
                somaNotas += notas[i][j];
            }
            medias[i] = somaNotas / 4.0;
            if (medias[i] >= 7.0) {
                countAprovados++;
            }
        }

        System.out.println("\nNúmero de alunos com média maior ou igual a 7.0: " + countAprovados);

        scanner.close();
    }
}