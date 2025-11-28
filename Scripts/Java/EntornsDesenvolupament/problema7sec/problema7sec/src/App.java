import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int input;
        int total = 0;
        while(sc.hasNextInt()){
            input = sc.nextInt();
            if(input%2==0){
                total = total +input;
            }else{
                total = total-input;
            }
        }
        sc.close();
        System.out.println(total);

    }
}
