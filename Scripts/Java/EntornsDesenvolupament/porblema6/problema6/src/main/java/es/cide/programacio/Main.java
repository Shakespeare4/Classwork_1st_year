package es.cide.programacio;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, f, c ;
        System.out.println("ELija un numero");
        n = sc.nextInt();
        for (f = 0;f <= n;f++){
            for (c = 0; c <= f; c++){
            System.out.print("*");
            }
            System.out.println();
        }sc.close();
    }
}