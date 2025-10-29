package es.cide.programacio;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum=0;
        int c = 1;
        n = sc.nextInt();
        if (n>0){
            while(c<n){
                if(n%c==0){
                sum= sum + c;
                }
            c++;
            }
            if(sum == n){
                System.out.println(n+" és perfecte");
            }else{
                System.out.println(n+" no és perfecte");
            }

        }sc.close();
    }
}