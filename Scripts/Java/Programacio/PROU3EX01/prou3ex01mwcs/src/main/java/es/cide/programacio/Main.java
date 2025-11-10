package es.cide.programacio;

import java.util.Scanner;//importamos la clase Scanner

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el nombre de tu heroe");
        String nomHeroi = sc.next();// pedimos el nombre del heroe
        System.out.println();
        Heroi Guybrush = new Heroi();// creamos el heroe
        Guybrush.setnomheroi(nomHeroi);// le asignamos el nombre
        Illa carib = new Illa();// creamos la isla
        String nomIlla = carib.getnomIlla();// pedimos el nombre de la isla
        int illaLongitud = carib.getLongitudIlla();// pedimos la longitud de la isla
        boolean playerIsAlive = Guybrush.getestatheroi();// pedimos el estado del heroe
        String nomRonda;
        boolean isCorrect;
        while (playerIsAlive && illaLongitud > 0) {// mientras el heroe este vivo y la isla tenga piratas 
            Pirata roundPirate = carib.vullUnPirata(illaLongitud - 1);// pedimos un pirata de la isla
            nomRonda = roundPirate.getnomPirata();// pedimos el nombre del pirata de la ronda
            System.out.println("El pirata " + nomRonda + " se acerca a tí. En guardia!");
            System.out.println();
            while (playerIsAlive && roundPirate.getestatpirata()) {// mientras el heroe y el pirata de la ronda esten vivos
                String roundInsult = roundPirate.insultar();// el pirata insulta
                System.out.println(roundInsult);
                System.out.println();
                String roundComeback = Guybrush.defensar();// el heroe responde
                System.out.println(roundComeback);
                System.out.println();
                isCorrect = roundPirate.replica(roundComeback);// comprobamos si la respuesta es correcta
                if (isCorrect) {// si es correcta
                    System.out.println("Agh! Esta ronda es tuya!");
                    System.out.println();
                    roundPirate.vida();// restamos vida al pirata
                } else {// si es incorrecta
                    System.out.println("Acaso te ha esneñado a hablar una sanguijuela? Esta es mía!");
                    System.out.println();
                    Guybrush.vida();// restamos vida al heroe
                    playerIsAlive = Guybrush.getestatheroi();
                }

                if (!roundPirate.getestatpirata()) {// si el pirata ha muerto
                    System.out.println("El pirata " + nomRonda + " cae a los pies de " + nomHeroi);// imprimimos el mensaje de victoria
                    System.out.println();
                } else if (playerIsAlive == false) {// si el heroe ha muerto
                    System.out.println(nomHeroi + " cae y su alma se reúne con el resto de sueños rotos");// imprimimos el mensaje de derrota
                    System.out.println();
                }

            }
            illaLongitud--;// restamos uno a la longitud de la isla

        }
        if (playerIsAlive) {// si el heroe sigue vivo al final del juego
            System.out.println(nomHeroi + " se convirtió en el pirata más temido de todo el caribe!");// imprimimos el mensaje de victoria final
        }
        sc.close();// cerramos el scanner
    }
}