package es.cide.programacio;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean valid;
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a<0&&b<0){
            valid = true;
        }else {
            valid = false;
            System.out.println("Error: Ambos numeros deben ser negativos");
        }
        if (valid && a%b==0){
            System.out.println("Es divisor");    
    }else if (valid && a%b!=0){
            System.out.println("No es divisor");
        }
        sc.close();
    }
}