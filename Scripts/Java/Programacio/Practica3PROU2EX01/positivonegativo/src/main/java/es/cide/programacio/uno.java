package es.cide.programacio;

import java.util.Scanner;

public class uno {
    public static void main(String[] args) {
        //iniciamos scanner
        Scanner sc = new Scanner(System.in);

        // pedimos el numero
        System.out.print("Declara el numero: ");
        int num = sc.nextInt();

        // Comprobar si es positivo o negativo
        if (num < 0) {
            System.out.println("Numero negativo");
        } else if (num > 0) {
            System.out.println("Numero positivo");
        } else
        System.out.println("Error");

        sc.close();
    }
}
