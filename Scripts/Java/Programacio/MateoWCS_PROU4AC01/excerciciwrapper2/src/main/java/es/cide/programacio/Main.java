package es.cide.programacio;

public class Main {
    public static void main(String[] args) {
        byte byte1 = 1;
        short short1 = 2;
        int int1 = 3;
        long long1 = 4;
        float float1 = 5;
        double double1 = 6.1;
        char char1 = 'A';
        boolean boolean1 = true;

        String byte2 = Byte.toString(byte1);//convierte de byte a string
        String short2 = Short.toString(short1);//convierte de short a string
        String int2 = Integer.toString(int1);//convierte de int a string 
        String long2 = Long.toString(long1);//convierte de long a string
        String float2 = Float.toString(float1);//convierte de float a string
        String double2 = Double.toHexString(double1);//convierte de double a string
        int char2 = Character.getNumericValue(char1);//convierte de char a int guardando el valor numerico
        String boolean2 = Boolean.toString(boolean1);//convierte de boolean a string
        System.out.println("Originals: "+byte1+" "+short1+ " "+int1 +" "+ long1+""+float1+""+double1+""+char1+""+boolean1);
        System.out.println("Wrapper: "+byte2+" "+short2+ " "+int2 + " "+long2+""+float2+""+double2+""+char2+""+boolean2);
    }
}