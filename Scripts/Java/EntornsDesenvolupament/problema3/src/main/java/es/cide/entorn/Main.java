package es.cide.entorn;

import java.util.Scanner;

// sumar x todas las veces de y
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        int result = 0;
        if (x < 0 || y < 0) {
            System.out.println("error");
            
        }else{
            while (y!=0) {
            result =+ x;
            y--;
            }

        }
        System.out.println("Resultado: " + result);

        sc.close();
    }
}