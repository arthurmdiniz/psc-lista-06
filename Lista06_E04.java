import java.util.Scanner;

public class Lista06_E04 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        char[] caracteres = new char[10];
        int contadorConsoantes = 0;
        char c;


        System.out.println("Digite 10 caracteres (letras):");
        for (int i = 0; i < caracteres.length; i++) {
            System.out.print("Caractere " + (i + 1) + ": ");
            caracteres[i] = scanner.nextLine().charAt(0);
        }

        System.out.print("Consoantes digitadas: ");
        for (int i = 0; i < caracteres.length; i++) {
            c = caracteres[i];
            if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')) {
                System.out.print(c + " ");
                contadorConsoantes++;
            }
        }
        System.out.println("\nTotal de consoantes: " + contadorConsoantes);


        scanner.close();
    }
}