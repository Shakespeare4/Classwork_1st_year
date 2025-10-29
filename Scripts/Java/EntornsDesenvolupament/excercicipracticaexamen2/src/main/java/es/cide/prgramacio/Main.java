package es.cide.prgramacio;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        int n;
        while (true) {
            System.out.print("Introdueix un nombre natural (o * per acabar): ");
            input = sc.next();

            if (input.equals("*")) {
                System.out.println("Programa finalitzat.");
                break;
            }

            try {
                n = Integer.parseInt(input);

                if (n <= 0) {
                    System.out.println("Has d'introduir un nombre natural (major que 0).");
                } else if (n % 10 == 0) {
                    System.out.println(n + " és múltiple de 10.");
                } else {
                    System.out.println(n + " no és múltiple de 10.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada no vàlida. Introdueix un nombre natural o * per acabar.");
            }
        }

        sc.close();
    }
}
