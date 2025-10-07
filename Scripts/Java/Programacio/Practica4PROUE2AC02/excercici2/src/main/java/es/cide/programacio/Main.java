package es.cide.programacio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] notes = new int[6];
        int i = 0;
        while (i < notes.length) {
            notes[i] = sc.nextInt();
            i++;
        }
        System.out.println();
    }
}
