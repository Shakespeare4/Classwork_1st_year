import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        while(sc.hasNextInt()){
            int input = sc.nextInt();
            if (input%3==0){
                total += input;
            }
            if(input%5==0){
                total -= input;
            }
        }sc.close();
        System.out.println(total);
    }
}
