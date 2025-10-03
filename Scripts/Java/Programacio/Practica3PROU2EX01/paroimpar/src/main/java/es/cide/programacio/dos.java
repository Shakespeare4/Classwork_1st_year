package es.cide.programacio;

import java.util.Scanner;

public class dos {
    public static void main(String[] args) {
        //iniciamos scanner
        Scanner sc = new Scanner(System.in);

        // pedimos el numero
        System.out.print("Declara el numero: ");
        int num = sc.nextInt();

        // Comprobar si es par o impar
        if (num % 2 == 0) {
            System.out.println("Numero par");
        } else 
        System.out.println("Numero impar");
        sc.close();
    }
}
