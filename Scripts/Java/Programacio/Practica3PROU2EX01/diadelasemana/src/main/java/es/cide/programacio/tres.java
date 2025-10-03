package es.cide.programacio;

import java.util.Scanner;

public class tres {
    public static void main(String[] args) {
        //iniciamos scanner
        Scanner sc = new Scanner(System.in);

        // pedimos el numero
        System.out.print("Declara el numero: ");
        int num = sc.nextInt();

        // Comprobar si es un dia de la semana
        switch (num) {
            case 1:
                System.out.println("Lunes");
                
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia no valido");
                break;
        };

        sc.close();
    }
}
