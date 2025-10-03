package es.cide.programacio;

import java.util.Scanner;

public class seis {
    public static void main(String[] args) {
        //iniciamos scanner
        Scanner sc = new Scanner(System.in);

        // pedimos los numeros
        System.out.print("Declara el primer numero: ");
        int num1 = sc.nextInt();
        System.out.print("Declara el segundo numero: ");
        int num2 = sc.nextInt();
        System.out.print("Declara el operador: ");
        char operador = sc.next().charAt(0);
        // Comprobar si es un dia de la semana
        switch (operador) {
            case '+':
                System.out.println(num1 + num2);
                
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("Operador no valido");
                break;
        };

        sc.close();
    }
}
