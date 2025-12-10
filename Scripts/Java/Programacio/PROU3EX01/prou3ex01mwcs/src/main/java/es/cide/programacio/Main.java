//Nom: MAteo WIlliam Carter Shakespeare
//NIE: Y1723089N
//Data entrega: 21/11/2025
package es.cide.programacio;

import java.util.Scanner;//importamos la clase Scanner

public class Main {
    public static void main(String[] args) {
        //creamos los atributos
        Scanner sc = new Scanner(System.in);
        Illa carib = new Illa();// creamos la isla
        boolean esCorrecte;
        Pirata pirataRonda;
        int input, illaLongitud;
        Heroi h = null;
        //Introduccion del juego
        System.out.println("Elija el heroe de nuestra historia: ");
        System.out.println("1- Guybrush Threepwood");
        System.out.println("2- Elaine Marlen");
        input = sc.nextInt();
        if(input == 1){
            h = new Guybrush("Guybrush Threepwood", 10);
        }else if (input == 2){
            h = new Elaine("Elaine Marlen", 10);
        }else{
            System.out.println("Ese no es un heroe valido");
        }
        h.sayHello();
        illaLongitud = carib.getLongitudIlla();
        System.out.println(h.getNomHeroi()+" se adentra en la isla "+carib.getnomIlla()+"...");
        System.out.println();
        
        //Comienza el juego
        while (h.getestatheroi() && illaLongitud > 0) {// mientras el heroe este vivo y la isla tenga piratas 
            pirataRonda = carib.vullUnPirata(carib.getLongitudIlla() - 1);// pedimos un pirata del final del array de illa
            pirataRonda.sayHello();
            // Comienza la ronda
            while (h.getestatheroi() && pirataRonda.getestatpirata()) {// mientras el heroe y el pirata de la ronda esten vivos
                pirataRonda.insultar();// el pirata insulta
                h.defensar();// el heroe responde
                esCorrecte = pirataRonda.replica(h.getRespostaHeroi());// comprobamos si la respuesta es correcta
                if (esCorrecte) {// si es correcta
                    System.out.println("Agh! Esta ronda... es tuya!");
                    System.out.println();
                    pirataRonda.vida();// restamos vida al pirata
                } else {// si es incorrecta
                    System.out.println("Acaso te ha esneñado a hablar una sanguijuela? Esta es mía!");
                    System.out.println();
                    h.vida();// restamos vida al heroe
                    h.getestatheroi();
                }

                if (!pirataRonda.getestatpirata()) {// si el pirata ha muerto
                    pirataRonda.sayGoodBye();
                    System.out.println();
                } else if (!h.getestatheroi()) {// si el heroe ha muerto
                    h.sayGoodBye();
                    System.out.println();
                }

            }
            illaLongitud--;// restamos uno a la longitud de la isla

        }
        if (h.getestatheroi()) {// si el heroe sigue vivo al final del juego
            System.out.println("¡Enhorabuena "+h.getNomHeroi() + "! ¡Has conquistado la isla"+carib.getnomIlla()+"!");// imprimimos el mensaje de victoria final
            System.out.println("No olvides tu camiseta de 100% algodón complementaria");
        }
        sc.close();// cerramos el scanner
    }
}