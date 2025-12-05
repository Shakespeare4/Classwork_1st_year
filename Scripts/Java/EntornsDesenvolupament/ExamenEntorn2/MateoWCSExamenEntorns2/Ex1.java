import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int pica = 3143;
        int input =  sc.nextInt();
        int anterior =0;
        boolean montanya = false;
        boolean greater = false;
        while (sc.hasNextInt()&& montanya == false){
            anterior = input;
            input = sc.nextInt();
            if (input > anterior){
                greater = true;
            }else if (input<anterior && greater == true){
                montanya = true;
            }else{
                greater = false;
            }
            
            
            
            
        }if (montanya == true && anterior>pica){
        System.out.println("SI");
        }else{
            System.out.println("NO");
    }
    }
}
