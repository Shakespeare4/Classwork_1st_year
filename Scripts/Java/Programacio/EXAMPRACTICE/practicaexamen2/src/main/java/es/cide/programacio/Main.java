package es.cide.programacio;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[10];
        int c = 0;
        int choice;
        int sum;
        int res = 0;
        int ans=0;
        while (c<num.length){
            num[c] = sc.nextInt();
            c++;
        }
        System.out.println("break");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                for (int i = 0;i<num.length;i++){
                res= res+num[i];
                //System.out.println(res);
                }
                res= res/10;
                System.out.println(res);
                break;
            case 2:
                for (int i=0;i<num.length;i++ ){
                    if (res<num[i]){
                        res = num[i];
                    }
                    
                }System.out.println(res + " " +ans);
            default:
                break;
        }
            
        }
    }
