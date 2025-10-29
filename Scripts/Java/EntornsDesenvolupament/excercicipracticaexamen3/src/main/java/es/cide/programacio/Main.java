package es.cide.programacio;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean active = true;

        while (active) {
            System.out.println("Introdueix dos nombres enters separats per un espai (o 'f' per acabar):");
            String input = sc.nextLine().trim();

            
            if (input.equalsIgnoreCase("f")) {
                active = false;
                System.out.println("Programa finalitzat.");
            } else {
                
                String[] parts = input.split("\\s+");

                if (parts.length != 2) {
                    System.out.println("Has d’introduir exactament dos nombres enters.");
                    continue;
                }

                try {
                    int a = Integer.parseInt(parts[0]);
                    int b = Integer.parseInt(parts[1]);
                    System.out.println("La suma és: " + (a + b));
                } catch (NumberFormatException e) {
                    System.out.println("Entrada no vàlida. Si vols sortir, escriu 'f'.");
                }
            }
        }

        sc.close();
    }
}