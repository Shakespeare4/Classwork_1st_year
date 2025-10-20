package es.cide.programacio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Inicialitzam el scanner
        Scanner sc = new Scanner(System.in);
        //Declaram el array
        int[] notes = new int[6];
        //Cream un comptador
        int i = 0;
        //Demanam les dades
        System.out.println("Introdueix les notes (0-10) de 6 alumnes:");
        //Quan i sigui menor a la longitud de l'array
        while (i < notes.length) {
            //Cream una variable que reb cada variable 
            int nota = sc.nextInt();
            //comprovam si la nota es valida
            if (nota >= 0 && nota <= 10) {
                //la variable es igual a la posició de l'array que equival a i
                notes[i] = nota;
                //incrementam i
                i++;
                //si no es valida imprimeix missatge d'error
            } else {
                System.out.println("Nota no vàlida. Torna a introduir:");
            }
        }
        //cream dos comptadors que segueixen els aprovats i els suspesos a més de un nou comptador
        int aprovats = 0;
        int suspesos = 0;
        int j = 0;
        //Quan el comptador es menor a la longitud de l'array
        while (j < notes.length) {
            // si es major de 5
            if (notes[j] >= 5) {
                //incrementam approvats
                aprovats++;
                //si no
            } else {
                //incrementam suspesos
                suspesos++;
            }
            //incrementam j
            j++;
        }//imprimeix els dos resultats
        System.out.println("Alumnes aprovats: " + aprovats);
        System.out.println("Alumnes suspesos: " + suspesos);
        //tanca el scanner
        sc.close();
    }
}
