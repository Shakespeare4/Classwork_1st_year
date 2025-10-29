/*Mateo WIlliam Carter Shakespeare
24/10/2025
NIE: Y1723089N*/
package es.cide.programacio;

import java.util.Scanner;//Importamos el scanner 
import java.util.Random;//Importamos el random


public class Main {

    public static void main(String[] args) {
        //Inicializamos variables
        
        Scanner sc = new Scanner(System.in);//Inicializamos el scanner

        Random ra = new Random();//Inicializamos el random

        int score = 0;// Creamos una variable para guardar la puntuación del jugador

        int rounds = 0;// Creamos una variable para guardar el numero de rondas jugadas

        char roundRequest;// Creamos una variable para guardar el numero de rondas que quiere jugar el usuario

        int intRoundRequest = 0;// Creamos una variable para guardar el valor numerico del numero de rondas

        int correctAnswer;// Creamos una variable para guardar la respuesta correcta
        
        boolean alreadyUsed;// Creamos una variable para guardar si esa respuesta ya se ha usado

        int count;// Creamos una variable de contador

        int randomPos;// Creamos una variable para guardar la posicion aleatoria

        int insultPos;// Creamos una variable para la posicion del insulto usado

        int swapPos;// Creamos una variable para guardar la posicion temporal de una respuesta para poder intercambiarla de sitio 

        int temp;//Creamos otra variable para guardar el valor temporalmente durante el intercambio

        char answer = 0;// Creamos una variable para guardar la respuesta del jugador

        int intAnswer=0;// Creamos una variable para guardar el valor numerico de la respuesta

        boolean validInput;// Creamos una variable para validar la entrada del usuario

        int chosenPos;// Creamos una variable para guardar la posicion de la respuesta elegida por el jugador

        boolean validRound; // Creamos una variable para asegurar que el numero de rondas sea valido

        boolean playing = true;// Creamos una variable para controlar si el jugador quiere seguir jugando

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

        System.out.println("Comprueba tu astucia diciendo la respuesta correcta, elige bien y ganaras un punto, pero si pierdes demasiado, se acabo.");

        validRound = false;// Establecemos el valor predeterminado de la variable validRound

        while (!validRound){// Mientras validRound sea "false"

            System.out.println("¿Cuantas rondas estas dispuesto a perder? (3, 5, 7 o 9)");// Preguntamos al usuario cuantas rondas quiere jugar

        try{// capturamos que haya un numero valido

            roundRequest = sc.next().charAt(0);// Guardamos la respuesta en la variable char

            intRoundRequest = Character.getNumericValue(roundRequest);// Guardamos el valor numerico de nuestro char en un avariable int

            if (roundRequest == 'n'){// Si roundRequest es 'n' salimos del juego
                playing = false;
                validRound =true;

            }

            else if (intRoundRequest == 3 || intRoundRequest == 5|| intRoundRequest == 7|| intRoundRequest == 9){// Comprobamos que el numero de rondas sea 3 o 5

                validRound = true;// si lo son, validRound es "true"

            } else {// De lo contrario

                System.out.println();// Imprimimos una linea en blanco

                System.out.println("Ese numero no me suena, prueba otro >>(3, 5, 7 o 9)<<");// Imprimimos un mensaje de error

                System.out.println();// Imprimimos una linea en blanco
                validRound = false;
            }
        }catch(IndexOutOfBoundsException e){
            validRound = false;

        }
        

        
        

        while (rounds < intRoundRequest&& playing) {//Creamos un bucle que dure el numero de rondas que ha introducido el usuario ademas de una condicion booleana de que este activo
            
            
            do {// Elegimos un insulto aleatorio que no se haya usado, usamos do while para asegurarnos de que se cumple la condicion y queremos que el insulto se elija aleatoriamente

                insultPos = ra.nextInt(insults.length);// Le damos el valor de una posicion aleatoria de array

            } while (insultUsed[insultPos]);

            insultUsed[insultPos] = true;  // Marcamos esta respuesta como usada

            correctAnswer = insultPos;// preparamos la respuesta correcta


            options[0] = correctAnswer;// Ponemos la respuesta correcta en la primera posicion del array "options"

            count = 1;// Le damos valor 1 al contador porque ya tenemos una opcion en el array

            
            
            while (count < 3) {// Llenamos el array "options" con 2 respuestas incorrectas diferentes

                randomPos = ra.nextInt(comebacks.length);

                alreadyUsed = false;

                for (int j = 0; j < count && !alreadyUsed; j++) {// Comprobamos que la respuesta no se haya usado ya

                if (options[j] == randomPos) {

                        alreadyUsed = true;
                }
            }

                if (!alreadyUsed) {// Si no se ha usado, la añadimos al array

                    options[count] = randomPos;

                    count++;
                }
            }


            for (int i = 0; i < options.length; i++) {// Mezclamos las opciones para que la respuesta correcta no esté siempre en la misma posición

                swapPos = ra.nextInt(options.length);// Guardamos una posicion aleatoria en swapPos

                temp = options[i];// Guardamos la posicion "i" en temp

                options[i] = options[swapPos];// Cambiamos la posicion de "i" por la de swapPos

                options[swapPos] = temp;// Cambiamos la posicion de swapPos por la de temp
            }

            
            System.out.println("Ronda " + (rounds + 1));// Mostramos el numero de ronda

            System.out.println();// Imprimimos una linea en blanco

            System.out.println(">> " + insults[insultPos]);// Mostramos el insulto

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
                try{

                answer = sc.next().charAt(0);// Guardamos la respuesta en la variable char

                if (answer=='n'){// si el character introducido es 'n', salimos del bucle

                    playing = false;

                    validInput = true;

                    }else{//de lo contrario 

                    intAnswer = Character.getNumericValue(answer);// guardamos el valor numerico del character

                    if (intAnswer >= 1 && intAnswer <= 3) {// Comprobamos que la respuesta este entre 1 y 3

                        validInput = true;//establecemos la variable como true para detener el while

                    }else {// de lo contrario

                        System.out.println(); // Imprimimos una linea en blanco

                        System.out.println("¡Ese numero no existe! Los piratas solo contamos del 1 al 3.");// Imprimimos mensaje de error

                        System.out.println();// Imprimimos una linea en blanco

                    }
                
            chosenPos = options[intAnswer-1];// Guardamos la posicion de la respuesta elegida por el jugador
                
            if (chosenPos == correctAnswer) {// Comprobamos si la respuesta elegida es la correcta

                System.out.println();// Imprimimos una linea en blanco

                System.out.println("¡ARGH!, Parece que esta ronda es tuya...");// Si es correcta, imprimimos un mensaje de victoria

                System.out.println();// Imprimimos una linea en blanco

                score++;// Sumamos un punto al jugador

            } else {//De lo contrario

                System.out.println();// Imprimimos una linea en blanco

                System.out.println("¿Acaso te ha enseñado a ahablar un percebe? Esta ronda la has perdido");// Si es correcta, imprimimos un mensaje de victoria

                System.out.println();// Imprimimos una linea en blanco

                score--;// restamos un punto al jugador
            }
            
                
            }
            }catch (IndexOutOfBoundsException e){
                validInput = false;
            }
            }if (score == -1){// si la puntuacion del jugador llega a -1 le indicamos que ha perdido y le pedimos si quiere volver a intentarlo
                System.out.print("¡Has muerto, seras comida de gaviota! Lo quieres volver a intentar?");
                
                System.out.println("1- Si      2-No");

                intAnswer = sc.nextInt();// sobreescribimos intAnswer con el siguiente input

                if (intAnswer == 1){// si es igual a 1

                    playing = true;// se repite el bucle
                    rounds = -1;//bajamos el numero de rondas a -1 para que cuando se sume la siguiente vuelve a la primera

                }else if (intAnswer ==2){// si es igual a 2
                    
                    playing = false;// sale del bucle
                    

                }else {// de lo contrario

                    System.out.println("Elige un numero valido");// imprimimos un mensaje de error
                }
            
            

            }
            
            rounds++;// Sumamos una ronda jugada

            
        }

        if (score == intRoundRequest) {// si la puntuacion es igual a las rondas jugadas (puntuacion maxima)

            System.out.println();// Imprimimos una linea en blanco

            System.out.println("¡Eres el rei de los piratas!");// imprimimos un mensaje de enhorabuena
        
            System.out.println();// Imprimimos una linea en blanco

        } else if ( score > intRoundRequest/2){//de lo contrario, si es mayor a la mitad de las rondas 

            System.out.println();// Imprimimos una linea en blanco

            System.out.println("Te has defendido como un buen marinero");// imprimimos un mensaje menos entusiasmado
        
            System.out.println();// Imprimimos una linea en blanco

        } else if (score <= intRoundRequest/2) {// de lo contrario si es menor a la mitad de rondas jugadas

            System.out.println();// Imprimimos una linea en blanco

            System.out.println("¡Los loros se rien de ti!");// imprimimos un mensaje de desprecio

            System.out.println();// Imprimimos una linea en blanco

        }
        System.out.println("|Puntuacion|");// Mostramos los jugadores

        System.out.println("|   "+score + "     |");// Mostramos la puntuación final

    }sc.close();// Cerramos el scanner
    }
}