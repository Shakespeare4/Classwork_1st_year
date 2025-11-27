package es.cide.programacio;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        boolean active = true;
        String primeraentrada = sc.next();
        String entrada= primeraentrada;
        int c = 0;
        int p = 0;
        while(active){
            entrada = sc.next();
            if (entrada.equals(".")){
                active = false;
            }
        if (entrada.equals(primeraentrada)){
            c++;
        }else{
            c = 0;
        }if(c>p){
            p = c;
        }
        
        } 
        System.out.println(p);
        sc.close();
    }
}