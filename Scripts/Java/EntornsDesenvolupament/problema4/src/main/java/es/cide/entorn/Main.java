package es.cide.entorn;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = 1;
        int c = 0;
        while (n >= d){
            d *= 10;
            c++;
        }
        System.out.println(c);
        
        
        sc.close();
    }
}