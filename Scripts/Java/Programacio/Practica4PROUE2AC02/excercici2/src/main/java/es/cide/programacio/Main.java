package es.cide.programacio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] notes = new int[6];
        int i = 0;
        System.out.println("Introdueix les notes (0-10) de 6 alumnes:");
        
        while (i < notes.length) {
            int nota = sc.nextInt();
            if (nota >= 0 && nota <= 10) {
                notes[i] = nota;
                i++;
            } else {
                System.out.println("Nota no vàlida. Torna a introduir:");
            }
        }
        int aprovats = 0;
        int suspesos = 0;
        i = 0;
        while (i < notes.length) {
            if (notes[i] >= 5) {
                aprovats++;
            } else {
                suspesos++;
            }
            i++;
        }
        System.out.println("Alumnes aprovats: " + aprovats);
        System.out.println("Alumnes suspesos: " + suspesos);
        sc.close();
    }
}
