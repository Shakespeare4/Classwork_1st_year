package es.cide.programacio;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = 2;
        Boolean ts = (n !=1 );
        ts = false;
        while (n > b ){
        if (n%b != 0){
            ts = true;
        } else {
            ts = false;
        break;}
        b++;
        
        } 
        if (ts == true){
            System.out.println("Es primo");
        }else {
            System.out.println("No es primo");
        }
        sc.close();
    }
}