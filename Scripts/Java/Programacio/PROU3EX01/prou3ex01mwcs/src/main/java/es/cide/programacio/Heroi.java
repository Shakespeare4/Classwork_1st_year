package es.cide.programacio;

import java.util.Scanner;//importamos la clase Scanner

public abstract class Heroi extends Personatge implements Fight, Speak{
    // atributos
    private Scanner sc = new Scanner(System.in);
    private boolean hViu;
    private int  resposta, vida;
    private String[] opcionsResposta = { // creamos un array con las posibles respuestas
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

    // constructor
    public Heroi(String nouNom, int novaVida) {
        super(nouNom, novaVida);
        this.hViu = true;// inicializamos el estado como vivo

    }

    // getters

    public boolean getestatheroi() {// para pedir el estado del heroe
        return hViu;
    }

    // setters
    public void setnomheroi(String newnom) {// para cambiar el nombre del heroe
        this.nom = newnom;
    }

    // metodes

    public void defensar() {// para imprimir las opciones y devolver el resultado

        System.out.println("1 " + opcionsResposta[0]);
        System.out.println("2 " + opcionsResposta[1]);
        System.out.println("3 " + opcionsResposta[2]);
        System.out.println("4 " + opcionsResposta[3]);
        System.out.println("5 " + opcionsResposta[4]);
        System.out.println("6 " + opcionsResposta[5]);
        System.out.println("7 " + opcionsResposta[6]);
        System.out.println("8 " + opcionsResposta[7]);
        System.out.println("9 " + opcionsResposta[8]);
        System.out.println();
        this.resposta = sc.nextInt();// pedimos la respuesta
        //return opcionsResposta[resposta - 1];// pasamos el valor correspondiente del array
    }

    public boolean vida() {// para restar vida al heroe y comprobar si sigue vivo
        this.vida--;
        if (vida > 0) {
            this.hViu = true;
        } else {
            this.hViu = false;
        }
        return hViu;
    }
    public void sayHello(){

    }
    
    public void sayGoodBye(){

    }
    public void insultar(){

    }
}
