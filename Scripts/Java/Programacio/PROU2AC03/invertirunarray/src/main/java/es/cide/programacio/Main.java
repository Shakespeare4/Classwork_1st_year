package es.cide.programacio;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x[] = new int[6];
        int c = 0;
        int s = 0;
        System.out.println("Introduzca 6 numeros enteros");
        x[0] = sc.nextInt();
        x[1] = sc.nextInt();
        x[2] = sc.nextInt();
        x[3] = sc.nextInt();
        x[4] = sc.nextInt();
        x[5] = sc.nextInt();
        
        while (c != 3){
            s = x[0];
            x[0] = x[5];
            x[5]= s;
            c++;
            s = x[1];
            x[1] = x[4];
            x[4] = s;
            c++;
            s = x[2];
            x[2] = x[3];
            x[3] = s;
            c++;
        }
        System.out.print(x[0]);
        System.out.print(x[1]);
        System.out.print(x[2]);
        System.out.print(x[3]);
        System.out.print(x[4]);
        System.out.print(x[5]);

    }
}