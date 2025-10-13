package es.cide.programacio;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quina taula de multiplcar vols?");
        int taula = sc.nextInt();
        for (int i = 0; i<= 10; i++){
            int resultat = taula*i;
            System.out.println(taula +"* "+ i+ "= " +resultat);
        }sc.close();
    }
}