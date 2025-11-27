import java.util.Scanner;
public class App {

    public static void main(String[] args) throws Exception {
    boolean active = true;


    int c = 0;
    int compare=0;
    boolean correct = false;
    Scanner sc = new Scanner(System.in);
    while (active){
        String input = sc.next();
        
        while (c< input.length()){
        if(input.charAt(c)=='('){
            compare++;
        }else if(input.charAt(c)==')'){
            compare--;
        }
        
        c++;
    }
    if(input.equals(".")){
            active = false;
        }
    }
        if(compare==0){
            correct = true;
        }
    if (correct){
            System.out.println("Si");
        }else{
            System.out.println("No");
        }sc.close();
    }
}
