package es.cide.programacion;

import java.util.Scanner;

public class siete {
    public static void main(String[] args) {
        //iniciamos scanner
        Scanner sc = new Scanner(System.in);

        // pedimos el numero
        System.out.print("Declara la nota: ");
        int num = sc.nextInt();

        // Comprobar si es positivo o negativo
        if (num < 5) {
            System.out.println("Suspenso");
        } else if (num >= 5 && num<= 6 ) {
            System.out.println("Aprobado");
        } else if (num>=7 && num<=8){
            System.out.println("Notable");
        } else if (num>=9 && num<=10){
            System.out.println("Sobresaliente");
        } else
        System.out.println("Error");

        sc.close();
    }
}
