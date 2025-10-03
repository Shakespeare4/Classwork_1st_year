package es.cide.programacion;

import java.util.Scanner;

public class ocho {
    public static void main(String[] args) {
        //iniciamos scanner
        Scanner sc = new Scanner(System.in);

        // pedimos el numero
        System.out.print("Declara el numero: ");
        int num = sc.nextInt();

        // Comprobar si es positivo o negativo
        if (num >= 18) {
            System.out.println("Puede votar");
        } else
        System.out.println("No puede votar");

        sc.close();
    }
}
