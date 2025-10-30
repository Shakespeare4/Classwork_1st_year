package es.cide.programacio;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Calculadora ca = new Calculadora(5, 10);
        Scanner sc = new Scanner(System.in);
        Double result=0.0;
        int input;
        double op1;
        double op2;
        //result = ca.sumar();                 //practice
        //System.out.println(result);
        //ca.setoperando1(200);
        //ca.setoperando2(150);
        //result = ca.restar();
        //System.out.println(result);
        //ca.setoperando1(5);
        //ca.setoperando2(7);
        //result = ca.multiplicar();
        //System.out.println(result);
        //ca.setoperando1(50);
        //ca.setoperando2(2);
        //result = ca.dividir();
        //System.out.println(result);
        System.out.println("Introduzca el tipo de operacion 1-Sumar 2-Restar 3- Multiplicar 4- Dividir");
        input = sc.nextInt();
        System.out.println("elige tus numeros");
        op1 = sc.nextDouble();
        ca.setoperando1(op1);
        op2 = sc.nextDouble();
        ca.setoperando2(op2);
        switch (input) {
            case 1:
                result = ca.sumar();
                break;
        
            case 2:
                result = ca.restar();
                break;

            case 3:
            result = ca.multiplicar();
            break;

            case 4:
            result = ca.dividir();
            break;
        }
        System.out.println(result);
        sc.close();
    }
}