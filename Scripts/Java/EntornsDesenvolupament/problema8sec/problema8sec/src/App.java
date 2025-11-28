import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean esPar = false;
        boolean on = true;
        int input = sc.nextInt();
        if (input%2==0){
            esPar= true;
        }else{
            esPar = false;
        }
        while(on&&sc.hasNextInt()){
            input = sc.nextInt();
            if (input%2==0&& esPar == false){
            esPar= true;
        }else if (input%2!=0&&esPar == true){
            esPar = false;
        }else{
            on = false;
        }
        }
        if (on == true){
            System.out.println("SI");
        }else{
            System.out.println("NO");
        }
        sc.close();
        }
}
