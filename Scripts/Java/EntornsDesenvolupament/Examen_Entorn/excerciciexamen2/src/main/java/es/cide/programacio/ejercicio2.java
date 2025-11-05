package es.cide.programacio;
import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int length = input.length();
        boolean active= true;
        while (length>0&&active){
            System.out.print(input.charAt(length-1));
            length--;
        }sc.close();
    } 
} 