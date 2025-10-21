/*MAteo William Carter Shakespeare 
NIE: Y1723089N
*/

package es.cide.programacio;
import java.util.Scanner;
public class Main {// idea: convertimos el input en un arrray de characteres para que podamos comparar cada uno individualmente 
                    // problema: no tengo ni idea de como dividir un string en caracteres (el split? el trim?)
                    //soy consciente a la hora de entregar que este codigo no funciona, solo quiero mostrar mi logica
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c= 0;
        String input = sc.nextLine();
        input.split("");
        String chars[] = new String[input.length()];
        int length = input.length();
        input.split("", 1);
        int a=0, e=0, i=0, o= 0, u = 0;
        for (int j = 0; i< input.length();i++){// asignamos cada posicion de chars a su equivalente en input
            chars[j] = input[j];// no me deja encontrar la posicion dentro del array creado
        }
        while(c < chars.length){// creamos un bucle que comprueba las letras
            if (chars[c]== "a"|| chars[c] == "A"){
                a++;
            }else if (chars[c]== "e"|| chars[c] == "E"){
                e++;
            }else if (chars[c] == "i"|| chars[c] == "I"){
                i++;
            }else if (chars[c] == "o"|| chars[c]== "O"){
                o++;
            }else if (chars[c] == "u"|| chars[c] == "U"){
                u++;
            }c++;

        }System.out.println("Numero de a: "+a);// imprimimos los resultados
        System.out.println("Numero de a: "+e);
        System.out.println("Numero de a: "+i);
        System.out.println("Numero de a: "+o);
        System.out.println("Numero de a: "+u);
        if (a>e&& a>i&& a>o&&a>u){// comprobamos la cantidad mayor de vocales
            System.out.println("Hay mas a total: "+a);
        }else if (e>a&&e>i&&e>o&&e>u){
            System.out.println("Hay mas e total: "+e);
        }else if (i>a&&i>e&&i>o&&i>u){
            System.out.println("Hay mas i total: "+i);
        }else if (o>a&&o>e&&o>i&&o>u){
            System.out.println("Hay mas o total: "+o);
        }else if (u>a&&u>e&&u>i&&u>o){
            System.out.println("Hay mas u total: "+u);
        }else {
            System.out.println("Hay el mismo numero de cada vocal");
        }
    }
}