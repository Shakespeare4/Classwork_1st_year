package es.cide.programacio;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input2 = "";
        String input = sc.next();
        boolean notGreater=true;
        while(notGreater){
        input2 = sc.next(); 
        if(input2.equals(".")){
            notGreater= false;
        }else if (input2.compareTo(input)>0){
            notGreater= false;
        }
	}
        if (input2.equals(input)){
            System.out.println("SI");
        }else{
            System.out.println("NO");
        }
	sc.close();
        }
    }

