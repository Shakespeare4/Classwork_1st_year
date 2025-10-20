package es.cide.programacio;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x[] = new int[8];
        int i;
        int c = 0;
        System.out.println("Introduzca 8 numeros enteros");
        x[0] = sc.nextInt();
        x[1] = sc.nextInt();
        x[2] = sc.nextInt();
        x[3] = sc.nextInt();
        x[4] = sc.nextInt();
        x[5] = sc.nextInt();
        x[6] = sc.nextInt();
        x[7] = sc.nextInt();
        System.out.println("Introduzca el numero que quiere buscar");
        i = sc.nextInt();
        while (c<8){
            if (i == x[0]){
                System.out.println("El numero se encuentra en el array");
                c++;
                break;
            } else if ( i == x[1]){
                System.out.println("El numero se encuentra en el array");
                c++;
                break;
            } else if (i == x[2]){
                System.out.println("El numero se encuentra en el array");
                c++;
                break;
            } else if (i == x[3]){
                System.out.println("El numero se encuentra en el array");
                c++;
                break;
            } else if (i == x[4]){
                System.out.println("El numero se encuentra en el array");
                c++;
                break;
            } else if (i == x[4]){
                System.out.println("El numero se encuentra en el array");
                c++;
                break;
            } else if (i == x[5]){
                System.out.println("El numero se encuentra en el array");
                c++;
                break;
            } else if (i == x[6]){
                System.out.println("El numero se encuentra en el array");
                c++;
                break;
            } else if (i == x[7]){
                System.out.println("El numero se encuentra en el array");
                c++;
                break;
            } else {
                System.out.println("El numero no se encuentra en el array");
                break;
            }
        }
        
        sc.close();
    }
}