package es.cide.programacio;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();
        int randnum;
        int choice;
        int c = 0;
        boolean correcto = false;
        randnum = ra.nextInt(1,50);
        while (c != 6 && !correcto){
        choice = sc.nextInt();
        if (choice == randnum){
            System.out.println("Correcte");
            correcto = true;

        } else if (choice < randnum){
            System.out.println("Menor");

        }else if (choice > randnum){
            System.out.println("Mayor");
        } else {System.out.println("Error");}
        c++;
    }
    }
}