package es.cide.programacio;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Inicializamos el scanner
        Random ra = new Random();//Inicializamos el random
        int score = 0;// Creamos una variable para guardar la puntuación del jugador
        int enscore = 0;//Creamos una variable para guardar la puntuanción del rival
        int rounds = 0;// Creamos una variable para guardar el numero de rondas jugadas
        int correctAnswerIndex;// Creamos una variable para guardar la respuesta correcta
        int[] options = new int[3];// Creamos un array para guardar las 3 posiciones de las respuestas
        boolean alreadyUsed;// Creamos una variable para guardar si esa respuesta ya se ha usado
        
        int count;// Creamos una variable de contador
        int randIndex;// Creamos una variable para guardar la posicion aleatoria
        int insultIndex;// Creamos una variable para la posicion del insulto usado
        int swapIndex;// Creamos una variable para guardar la posicion en la que guradamos un valor para despues intercambiarlo 
        int temp;//Creamos otra variable para guardar el valor temporalmente durante el intercambio
        int answer;// Creamos una variable para guardar la respuesta del jugador
        String[] insults = {
            "Eres tan repulsivo como un mono en lencería",
            "Luchas como un granjero",
            "He hablado con simios más educados que tú"
        };

        String[] comebacks = {
            "No sabía que me parecía tanto a tu amada",
            "Qué suerte que tú peleas como una vaca",
            "Al menos ellos me escuchan, a diferencia de ti"
        };
        boolean[] insultUsed = new boolean[insults.length];// Creamos un array que permita guardar los insultos usados

        System.out.println("¡Prepara tu espada y tu lengua, grumete! ¡Empieza la batalla de insultos pirata!");

        while (rounds < 3) {//Creamos un bucle que dure el numero de rondas que hemos puesto, en este caso 3
            
            
            do {// Elegimos un insulto aleatorio que no se haya usado, usamos do while para asegurarnos de que se cumple la condicion
                insultIndex = ra.nextInt(insults.length);
            } while (insultUsed[insultIndex]);

            insultUsed[insultIndex] = true;  // Marcamos esta respuesta como usada

            correctAnswerIndex = insultIndex;// preparamos la respuesta correcta


            options[0] = correctAnswerIndex;// Ponemos la respuesta correcta en la primera posicion del array "options"
            count = 1;// Le damos valor 1 al contador porque ya tenemos una opcion en el array

            // Fill the rest with different (incorrect) options
            
            while (count < 3) {// Llenamos el array "options" con 2 respuestas incorrectas diferentes
                randIndex = ra.nextInt(comebacks.length);
                alreadyUsed = false;

                for (int j = 0; j < count && !alreadyUsed; j++) {// Comprobamos que la respuesta no se haya usado ya
                if (options[j] == randIndex) {
                        alreadyUsed = true;
                }
            }

                if (!alreadyUsed) {// Si no se ha usado, la añadimos al array
                    options[count] = randIndex;
                    count++;
                }
            }


            for (int i = 0; i < options.length; i++) {// Mezclamos las opciones para que la respuesta correcta no esté siempre en la misma posición
                swapIndex = ra.nextInt(options.length);// Guardamos una posicion aleatoria en swapIndex
                temp = options[i];// Guardamos la posicion de i en temp
                options[i] = options[swapIndex];// Cambiamos la posicion de i por la de swapIndex
                options[swapIndex] = temp;// Cambiamos la posicion de swapIndex por la de temp
            }

            
            System.out.println("Ronda " + (rounds + 1));// Mostramos el numero de ronda
            System.out.println(">> " + insults[insultIndex]);// Mostramos el insulto


            for (int i = 0; i < options.length; i++) {// Mostramos las opciones de respuesta
                System.out.println((i + 1) + ") " + comebacks[options[i]]);
            }

            System.out.print("Elige tu respuesta (1-3): ");// Pedimos al jugador que elija una respuesta
            answer = sc.nextInt();// Guardamos la respuesta en la variabl "answer"

            // Validate input
            while (answer < 1 || answer > 3) {// Comprobamos que la respuesta esté entre 1 y 3
            System.out.print("¡Eso no es una opción válida! Prueba otra vez (1-3): ");//imprimimos un error
            answer = sc.nextInt(); // Volvemos a pedir la respuesta
            }

            int chosenIndex = options[answer - 1];// Guardamos la posicion de la respuesta elegida por el jugador

            if (chosenIndex == correctAnswerIndex) {// Comprobamos si la respuesta elegida es la correcta
                System.out.println("¡ARGH, parece que esta ronda es tuya!");// Si es correcta, imprimimos un mensaje de victoria
                score++;// Sumamos un punto al jugador
            } else {//De lo contrario
                System.out.println("¿Acaso te enseñó a hablar una sanguijuela? ¡Esta es mía!");// Imprimimos un mensaje de derrota
                enscore++;// Sumamos un punto al rival
            }rounds++;// Sumamos una ronda jugada

            
        }

        
    
        System.out.println("¡La batalla ha terminado, grumete!");// Imprimimos un mensaje de fin de batalla
        if (score > enscore) {
            System.out.println("¡Me rindo! No te gano en espada ni en palabras. ¡Volveremos a vernos las caras!");// Si el jugador tiene más puntos, imprimimos un mensaje de victoria
        } else if (enscore > score){
            System.out.println("¿Eso es todo? ¡He visto sardinas con mayor habilidad!");// Si el rival tiene más puntos, imprimimos un mensaje de derrota
        } else {
            System.out.println("¿Igualados? ¡Parece que te has ganado mi respeto!");// Si hay empate, imprimimos un mensaje de empate
        }
        System.out.println("Jugador"+"               "+"Rival");
        System.out.println(score + "                "+ enscore);// Mostramos la puntuación final

                
                
        sc.close();// Cerramos el scanner
    }
}