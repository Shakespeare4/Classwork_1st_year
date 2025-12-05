import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        boolean end = false;
        int comprovar=0;
        int c=0;
        while(end == false){
            String input = sc.next();
            if (input.equals("principi")&&comprovar==0){
                comprovar+=2;
        }else if(input.equals("final")&&comprovar == 1){
            comprovar--;
        }else if (comprovar == 1){
            c++;
        }else{
        }
            if (input.equals("*")){
                end = true;
            };
        }
        if(comprovar==1){
            System.out.println(c);
        }else{
            System.out.println("incorrecte");
        }
        sc.close();
    }
}
