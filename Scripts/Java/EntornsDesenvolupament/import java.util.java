import java.util.Scanner;
public class Main {
    boolean active = true;
    int open = 0;
    int closed = 0;
    int c = 0;
    boolean correct;
    Scanner sc = new Scanner(System.in);
    while (active){
        String input = sc.next();
        if(input.equals(".")){
            active = false;
        }
        if(input.charAt(c)=="("){
            open++;
        }else if(input.charAt(c)=="("&& open>0){
            closed++;
        }
        if(open==closed){
            correct = true;
        }
        if (active = true){
            System.out.println("Si");
        }else{
            System.out.println("No");
        }
    }sc.close();

}
