package es.cide.programacio;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String integer = "45";
        String decimal = "3.5";
        String  xor = "true";
        String character = "A";

        int newint = Integer.parseInt(integer);// conierteix String a int
        double newdouble = Double.parseDouble(decimal);// conierteix String a double
        boolean newbool = Boolean.parseBoolean(xor);// conierteix String a boolean
        char newchar = character.charAt(0);// conierteix String a char
        double result1 = newint + newdouble;// suma int + double
        if (newbool == true){// si el boolean es true
            System.out.println("True");// imprimeix True
        }else{// si no
            System.out.println("False");// imprimeix False
        }
        int charvalue = Character.getNumericValue(newchar);// converteix char a int segons la taula ASCII

        System.out.println("Originals: "+integer+" "+decimal+ " "+xor +" "+ character);
        System.out.println("Wrapper: "+newint+" "+newdouble+ " "+newbool + " "+newchar);
        System.out.println("Operacions: "+result1+" "+charvalue);
    }
}