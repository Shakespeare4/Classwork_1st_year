package es.cide.programacio;

import java.util.Scanner;//importamos la clase Scanner

public class Main {
    public static void main(String[] args) {
        //creamos los atributos
        Scanner sc = new Scanner(System.in);
        Heroi Guybrush;// creamos el heroe
        Illa carib = new Illa();// creamos la isla
        String nomHeroi, nomRonda, nomIlla;
        boolean esCorrecte, heroiViu;
        int illaLongitud;
        Pirata pirataRonda;

        //Introduccion del juego
        System.out.println("Introduzca el nombre del heroe de nuestra historia: ");
        nomHeroi = sc.nextLine();// pedimos el nombre del heroe
        System.out.println();
        Guybrush = new Heroi(nomHeroi);
        Guybrush.setnomheroi(nomHeroi);// le asignamos el nombre
        nomIlla = carib.getnomIlla();// pedimos el nombre de la isla
        illaLongitud = carib.getLongitudIlla();// pedimos la longitud de la isla
        heroiViu = Guybrush.getestatheroi();// pedimos el estado del heroe
        System.out.println(nomHeroi+" se adentra en la isla "+nomIlla+"...");
        System.out.println();
        
        //Comienza el juego
        while (heroiViu && illaLongitud > 0) {// mientras el heroe este vivo y la isla tenga piratas 
            pirataRonda = carib.vullUnPirata(illaLongitud - 1);// pedimos un pirata del final del array de illa
            nomRonda = pirataRonda.getnomPirata();// pedimos el nombre del pirata de la ronda
            System.out.println("El pirata " + nomRonda + " se acerca a tí. En guardia!");
            System.out.println();
            // Comienza la ronda
            while (heroiViu && pirataRonda.getestatpirata()) {// mientras el heroe y el pirata de la ronda esten vivos
                String roundInsult = pirataRonda.insultar();// el pirata insulta
                System.out.println(roundInsult);
                System.out.println();
                System.out.println("¿Cual es tu respuesta?");
                System.out.println();
                String roundComeback = Guybrush.defensar();// el heroe responde
                System.out.println(roundComeback);
                System.out.println();
                esCorrecte = pirataRonda.replica(roundComeback);// comprobamos si la respuesta es correcta
                if (esCorrecte) {// si es correcta
                    System.out.println("Agh! Esta ronda... es tuya!");
                    System.out.println();
                    pirataRonda.vida();// restamos vida al pirata
                } else {// si es incorrecta
                    System.out.println("Acaso te ha esneñado a hablar una sanguijuela? Esta es mía!");
                    System.out.println();
                    Guybrush.vida();// restamos vida al heroe
                    heroiViu = Guybrush.getestatheroi();
                }

                if (!pirataRonda.getestatpirata()) {// si el pirata ha muerto
                    System.out.println("El pirata " + nomRonda + " cae a los pies de " + nomHeroi);// imprimimos el mensaje de victoria
                    System.out.println();
                } else if (heroiViu == false) {// si el heroe ha muerto
                    System.out.println(nomHeroi + " cae y su alma se reúne con el resto de sueños rotos");// imprimimos el mensaje de derrota
                    System.out.println();
                }

            }
            illaLongitud--;// restamos uno a la longitud de la isla

        }
        if (heroiViu) {// si el heroe sigue vivo al final del juego
            System.out.println("¡Enhorabuena "+nomHeroi + "! ¡Has conquistado la isla"+nomIlla+"!");// imprimimos el mensaje de victoria final
            System.out.println("No olvides tu camiseta de 100% algodón complementaria");
        }
        sc.close();// cerramos el scanner
    }
}