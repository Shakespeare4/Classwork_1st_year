package es.cide.programacio;

import java.util.Scanner;

public class cinco {
    public static void main(String[] args) {
        //iniciamos scanner
        Scanner sc = new Scanner(System.in);

        // pedimos el numero
        System.out.print("Declara la letra: ");
        char letra = sc.next().charAt(0);

        // Comprobar si es positivo o negativo
    if (letra == 'a' || letra == 'e'|| letra== 'i' || letra=='o'|| letra == 'u') {
            System.out.println("Vocal");
        } else
        System.out.println("Consonant");

        sc.close();
    }
}
