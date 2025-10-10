package es.cide.programacio;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String operacion;
        double num1;
        double num2;
        System.out.println("Inserte su operacion");
        while (sc.hasNext()){
            
            operacion = sc.next();
            if (operacion.equals("suma")){
                System.out.println("Elija el primer numero");
                    num1 = sc.nextDouble();
                System.out.println("Elija el segundo numero");
                    num2 = sc.nextDouble();
                System.out.println("Resultado: " + (num1+num2));
            } else if (operacion.equals("resta")){
                System.out.println("Elija el primer numero");
                    num1 = sc.nextDouble();
                System.out.println("Elija el segundo numero");
                    num2 = sc.nextDouble();
                System.out.println("Resultado: " + (num1-num2));
            }else if (operacion.equals("inversion")){
                System.out.println("Elija el primer numero");
                    num1 = sc.nextDouble();

                System.out.println("Resultado: " + (-num1));
            } else if (operacion.equals("aturar")){
                System.out.println("Adios!");
                break;
            };
            System.out.println("Inserte su operacion");
            }sc.close(); 

        }
    }
