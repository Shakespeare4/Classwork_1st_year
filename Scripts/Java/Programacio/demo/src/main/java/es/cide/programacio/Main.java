package es.cide.programacio;
public class Main {
    public static void main(String[] args) {
        int num1 ;
        int num2 ;
        try{
        num1=0;
        num2=62/num1;
        System.out.println("Final try");
        
        }catch ( ArithmeticException e){
            e.printStackTrace();
            System.out.println("Error no se puede dividir entre 0");
        }
    finally {System.out.println("Bloc Finally");}
    }
}