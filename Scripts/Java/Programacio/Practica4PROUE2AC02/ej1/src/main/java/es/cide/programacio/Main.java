package es.cide.programacio;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int i = 0;
        int n = sc.nextInt();
        int m = 0;
        while (i <= n) {
            m = m + i;
        if (m % 2 == 0) {
            m = m + i;
        }else{

        
        System.out.print(m);}
        sc.close();
    
    }
}}