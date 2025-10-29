package es.cide.programacio;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c;
        boolean playing = true;
        int x = 0, y = 0;
        while(playing){
            System.out.println("Indica direcciones cardinales usando 'n','s','e','w', terminando con un punto('.')" );
            String input = sc.nextLine();
            c = input.length();
            for (int i = 0;i<c;i++){
                if (input.charAt(i) == 'n'){
                    y--;
                }else if (input.charAt(i)=='s'){
                    y++;
                }else if (input.charAt(i)=='e'){
                    x++;
                }else if (input.charAt(i)=='w'){
                    x--;
                }else if (input.charAt(i)== '.'){
                    playing = false;
                }else {
                    System.out.println("Contiene un character invalido");
                }
            } 
        }System.out.println("("+x+","+y+")");
        sc.close();
    }
}