package es.cide.programacio;

import java.util.Scanner;

public class uno {
    public static void main(String[] args) {
        //iniciamos scanner
        Scanner sc = new Scanner(System.in);

        // pedimos el numero
        System.out.print("Declara el primer numero: ");
        int num1 = sc.nextInt();
        System.out.print("Declara el segundonumero: ");
        int num2 = sc.nextInt();

        // Comprobar si es positivo o negativo
        if (num1 < num2) {
            System.out.println("b es menor");
        } else if (num1 > num2) {
            System.out.println("a es mayor");
        } else
        System.out.println("son iguales");

        sc.close();
    }
}
