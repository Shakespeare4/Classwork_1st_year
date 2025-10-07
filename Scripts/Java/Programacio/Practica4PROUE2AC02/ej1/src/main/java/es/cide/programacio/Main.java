package es.cide.programacio;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //creamos uevo scanner
        Scanner sc = new Scanner(System.in);
        //declaramos las variables
        int i = 1;
        int n = sc.nextInt();
        int m = 0;
        //mientras i sea menor o igual que n 
        while (i <= n) {
            //incrementa la i en uno
            i++;
            //si i es par
            if (i % 2 == 0) {
                //suma m y i
                m = m + i;
                //incrementa i
                i++;
            //de lo contrario incrementa la i
            }else {i++;};
            
        }
        //imprimimos el resultado
        System.out.print(m);
        //cerramos el scanner
        sc.close();
    }
}