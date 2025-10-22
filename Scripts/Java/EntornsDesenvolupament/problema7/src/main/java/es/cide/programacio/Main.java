package es.cide.programacio;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text;
        boolean active = true;
        int c;
        int a = 0;
        while(active){
            text = sc.nextLine();
            c = text.length();
            for (int i=0; i<c;i++){
                if (text.charAt(i)== 'a'){
                    a++;
                }else if (text.charAt(i)== 'A'){
                    a++;
                }else if (text.charAt(i)== '.'){
                    active = false;
            }
        }
    }
        System.out.println(a);
        sc.close();
    }
}
