/*Mateo William Carter Shakespeare
NIE: Y1723089N
 */
package es.cide.programacio;
import java.util.Scanner;// Importamos el scanner
import java.util.Random;// Importamos el random
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// Inicializamos el scanner
        Random ra = new Random();// Inicializamos el random
        int secret;// creamos una variable para guardar el numero secreto
        int answer;// creamos una variable con la respuetsa del usuario
        int c = 1;// creamos un contador de rondas empezando por 1 (la primera ronda)
        final int temperatura = 50;// creamos una constante para definir si la respuesta esta cerca o no del numero secreto, en mi caso he elegido el 50
        boolean playing = true;// creamos una vaiable booleana que indica si el usuario esta jugando
        int playagain;// creamos una variable para guardar si el usuario quiere volver a jugar
        boolean correct;// creamos una variable para decidir si el numero es correcto
        while (playing){// mientras "playing" sea true (en otras palabras, mientras estemos jugando)
            secret = ra.nextInt(1,200);// usamos el random para dar un valor aleatorio a nuestro numero secreto
            correct = false;// marcamos que el valor de la respuesta es falso a no ser que le digamos lo contrario
            System.out.println("Intenta esdevinar el numero secret! Digues un numero del 1 al 200");// mensaje de bienvenida
            while (!correct){// mientras "correct " sea falso)
                answer = sc.nextInt();// leemos el input del usuario
                if (answer>= 1 && answer <= 200){// si la respuesta esta en el rango que queremos
                if (answer == secret){// si la respuesta es correcta
                    correct = true;// "correct" se vuelve true y salimos de bucle
                }else if (answer < secret){// si no es correcta y es menor
                    System.out.println("Massa petit");// se lo indicamos al usuario
                if (answer + temperatura < secret){// si aun sumandole la constante sigue siendo menor
                    System.out.println("Fred");// que indique al usuario que está lejos
                }else{// de lo contrario
                    System.out.println("Calent");// que le indique al usuario que esta cerca
                }
                }else if (answer> secret){// si no es correcta y es mayor
                    System.out.println("Massa gran");// Se lo indicamos al usuario
                if (answer - temperatura > secret){// si aun sumandole la constante es mayor
                    System.out.println("Fred");//indicamos que el usuario está lejos
                }else{// de lo contrario
                    System.out.println("Calent");// indicams al usuario que esta cerca
                }
                }
                }else {//de lo contrario
                    System.out.println("Introdueix un numero valid per favor!");//imprimimos un mensaje de error
                }
                c++;
            }
            if (c == 1){//si el numero de rondas es uno, en otras palabras, el usuario lo halogrado a la primera
                    System.out.println("Ets un crack!");// Imprimimos un mensaje
                } else if (c >1 || c < 11){//si el numero de rondas es de 2 a 10
                    System.out.println("No esta malament");// imprimimos uno ditsinto
                }else {// si es cualquier otro numero de rondas
                    System.out.println("Es pot millorar");// imprimimos otro mensaje
                }
                System.out.println("Vols jugar una altra vegada?");// le preguntamos al usuario si quiere jugar otra vez
                System.out.println("1-Si         2-No");// le mostramos sus opciones
                playagain = sc.nextInt();// guardamos su respuesta en "playagain"
                if (playagain == 1){// si ha dicho que si
                    playing = true;// playing sigue true y volvemos a empezar el bucle
                }else if (playagain == 2){//si dice que no
                    playing = false;// playing se vuelve false y cerramos el bucle
                }
    } System.out.println("Gracies per jugar");// Imprimimo un mensaje de despedida
sc.close();}
}