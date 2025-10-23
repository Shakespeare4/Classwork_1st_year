/*Mateo WIlliam Carter Shakespeare
20/10/2025
NIE: Y1723089N*/
package es.cide.programacio;

import java.util.Scanner;//Importamos el scanner
import java.util.InputMismatchException;//Importamos la excepcion de input mismatch, al parecer no es necesario pero no he encontrado otra solución debido a que el scanner es de util y devuelve este error 
import java.util.Random;//Importamos el random

public class Main {

    public static void main(String[] args) {
        //Inicializamos variables
        
        Scanner sc = new Scanner(System.in);//Inicializamos el scanner

        Random ra = new Random();//Inicializamos el random

        int score = 0;// Creamos una variable para guardar la puntuación del jugador

        int rounds = 0;// Creamos una variable para guardar el numero de rondas jugadas

        int roundrequest = 0;// Creamos una variable para guardar el numero de rondas que quiere jugar el usuario

        int correctAnswerIndex;// Creamos una variable para guardar la respuesta correcta
        
        boolean alreadyUsed;// Creamos una variable para guardar si esa respuesta ya se ha usado

        int count;// Creamos una variable de contador

        int randIndex;// Creamos una variable para guardar la posicion aleatoria

        int insultIndex;// Creamos una variable para la posicion del insulto usado

        int swapIndex;// Creamos una variable para guardar la posicion temporal de una respuesta para poder intercambiarla de sitio 

        int temp;//Creamos otra variable para guardar el valor temporalmente durante el intercambio

        int answer = 0;// Creamos una variable para guardar la respuesta del jugador

        boolean validInput;// Creamos una variable para validar la entrada del usuario

        int chosenIndex;// Creamos una variable para guardar la posicion de la respuesta elegida por el jugador

        boolean validRound; // Creamos una variable para asegurar que el numero de rondas sea valido

        boolean playing = true;

        //inicializamos los arrays

        String[] insults = {// Creamos un array con los insultos
            "¡Eres tan repulsivo como un mono en lencería!",
            "¡Luchas como un granjero!",
            "¡He hablado con simios más educados que tú!",
            "¡Cada enemigo con el que he luchado ha sido aniquilado!",
            "¡Mi espada es conocida por todo el caribe!",
            "¡Tenía un perro más inteligente que tu!",
            "¿Ya has dejado de llevar pañales?",
            "No hay palabras para lo aqueroso que eres.",
            "¡Me haces querer vomitar!"
        };

        String[] comebacks = {// Creamos un array con las respuestas
            "¿Tanto me parezco a tu prometida?",
            "¡Suerte que tú peleas como una vaca!",
            "¡Me alegra que fueras a tu reunión familiar!",
            "Con un aliento como ese, ¡Se habran ahogado!",
            "¡Una pena que nadie haya oído hablar de tí!",
            "¡Te debió enseñar todo lo que sabes!",
            "¿Por que, quieres que te preste uno?",
            "Si las hay, solo que nunca las aprendiste.",
            "¡Tu me haces pensar que alguien ya lo hizo!"
        };
        boolean[] insultUsed = new boolean[insults.length];// Creamos un array que permita guardar los insultos usados

        int[] options = new int[3];// Creamos un array para guardar las 3 posiciones de las respuestas

        // Empieza el juego

        System.out.println("¡Prepara tu espada y tu lengua, grumete! ¡Empieza la batalla de insultos pirata!");// Imprimimos un mensaje de inicio

        System.out.println("Comprueba tu astucia diciendo la respuesta correcta.");

        validRound = false;// Establecemos el valor predeterminado de la variable validRound

        while (!validRound){// Mientras validRound sea "false"

        try{// usamos el try para probar el codigo


            System.out.println("¿Cuantas rondas estas dispuesto a perder? (3 o 5)");// Preguntamos al usuario cuantas rondas quiere jugar

            roundrequest = sc.nextInt();// Guardamos la respuesta en la variable

            if (roundrequest == 3 || roundrequest == 5){// Comprobamos que el numero de rondas sea 3 o 5

                validRound = true;// si lo son, validRound es "true"
            } else {// De lo contrario

                System.out.println();// Imprimimos una linea en blanco

                System.out.println("Ese numero no me suena, prueba otro >>(3 o 5)<<");// Imprimimos un mensaje de error

                System.out.println();// Imprimimos una linea en blanco
            }

        } catch (ClassCastException e) {// Si el usuario introduce in valor que no sea entero (int)

            System.out.println();// Imprimimos una linea en blanco

            System.out.println("¡Eso no es un número, grumete! ¿Es que no sabes contar?");// Imprimimos mensaje de error

            System.out.println();// Imprimimos una linea en blanco

            sc.nextLine(); 
        }
    }

        
        

        while (rounds < roundrequest&& playing) {//Creamos un bucle que dure el numero de rondas que hemos puesto, en este caso 3
            
            
            do {// Elegimos un insulto aleatorio que no se haya usado, usamos do while para asegurarnos de que se cumple la condicion y queremos que el insulto se elija aleatoriamente

                insultIndex = ra.nextInt(insults.length);// Le damos el valor de una posicion aleatoria de array
            } while (insultUsed[insultIndex]);

            insultUsed[insultIndex] = true;  // Marcamos esta respuesta como usada

            correctAnswerIndex = insultIndex;// preparamos la respuesta correcta


            options[0] = correctAnswerIndex;// Ponemos la respuesta correcta en la primera posicion del array "options"

            count = 1;// Le damos valor 1 al contador porque ya tenemos una opcion en el array

            
            
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

            System.out.println();// Imprimimos una linea en blanco

            System.out.println(">> " + insults[insultIndex]);// Mostramos el insulto

            System.out.println();// Imprimimos una linea en blanco


            for (int i = 0; i < options.length; i++) {// Mostramos las opciones de respuesta

                System.out.println((i + 1) + ") " + comebacks[options[i]]);

                System.out.println();// Imprimimos una linea en blanco
            }

            System.out.println();// Imprimimos una linea en blanco

            validInput = false;// Reiniciamos la variable de validacion

        while (!validInput) {// Validamos el input del usuario 

                System.out.print("Elige tu respuesta (1-3): ");// Pedimos la respuesta al usuario

                System.out.println();// Imprimimos una linea en blanco

                answer = sc.nextInt();// Guardamos la respuesta en la variable

                if (answer >= 1 && answer <= 3) {// Comprobamos que la respuesta este entre 1 y 3

                validInput = true;//establecemos la variable como true para detener el while

        }else if (answer == Character.getNumericValue('n') ){
            playing = false;
        }
        
        
        else {

            System.out.println(); // Imprimimos una linea en blanco

            System.out.println("¡Ese numero no existe! Los piratas solo contamos del 1 al 3.");// Imprimimos mensaje de error

            System.out.println();// Imprimimos una linea en blanco

        }
    
}

            chosenIndex = options[answer - 1];// Guardamos la posicion de la respuesta elegida por el jugador

            if (chosenIndex == correctAnswerIndex) {// Comprobamos si la respuesta elegida es la correcta

                System.out.println();// Imprimimos una linea en blanco

                System.out.println("¡ARGH!, Parece que esta ronda es tuya...");// Si es correcta, imprimimos un mensaje de victoria

                System.out.println();// Imprimimos una linea en blanco

                score++;// Sumamos un punto al jugador

            } else {//De lo contrario

                System.out.println();// Imprimimos una linea en blanco

                System.out.println("¿Acaso te ha enseñado a ahablar un percebe? Esta ronda la has perdido");// Si es correcta, imprimimos un mensaje de victoria

                System.out.println();// Imprimimos una linea en blanco

                score--;


            }if (score == -1){
                System.out.print("¡Has muerto, seras comida de gaviota! Lo quieres volver a intentar?");
                
                System.out.println("1- Si      2-No");

                answer = sc.nextInt();
                if (answer == 1){
                    playing = true;
                }else if (answer ==2){
                    playing = false;
                }else {
                    System.out.println("Elige un numero valido");
                }
            
            

            }
            
            rounds++;// Sumamos una ronda jugada

            
        }

        System.out.println();// Imprimimos una linea en blanco
    
        System.out.println("¡La batalla ha terminado, grumete!");// Imprimimos un mensaje de fin de batalla
        
        System.out.println();// Imprimimos una linea en blanco

        if (score == roundrequest) {

            System.out.println();// Imprimimos una linea en blanco

            System.out.println("¡Eres el rei de los piratas!");// Si el jugador tiene más puntos, imprimimos un mensaje de victoria
        
            System.out.println();// Imprimimos una linea en blanco

        } else if ( score > roundrequest/2){

            System.out.println();// Imprimimos una linea en blanco

            System.out.println("Te has defendido como un buen marinero");
        
            System.out.println();// Imprimimos una linea en blanco

        } else if (score <= roundrequest/2) {

            System.out.println();// Imprimimos una linea en blanco

            System.out.println("¡Los loros se rien de ti!");

            System.out.println();// Imprimimos una linea en blanco

        }
        System.out.println("|Puntuacion|");// Mostramos los jugadores

        System.out.println("|   "+score + "     |");// Mostramos la puntuación final

                
        sc.close();// Cerramos el scanner
    }
}