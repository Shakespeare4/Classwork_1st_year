package es.cide.programacio;

import java.util.Scanner;//importamos la clase Scanner

public class Heroi {
    // atributos
    private Scanner sc = new Scanner(System.in);
    private String nom;
    private int vida;
    private boolean alive;
    private int response;
    int option1, option2, option3;
    private String[] comebackOptions = { // creamos un array con las posibles respuestas
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
    public Heroi() {
        this.vida = 10;// inicializamos la vida como 10
        this.alive = true;// inicializamos el estado como vivo

    }

    // getters

    public boolean getestatheroi() {// para pedir el estado del heroe
        return alive;
    }

    // setters
    public void setnomheroi(String newnom) {// para cambiar el nombre del heroe
        this.nom = newnom;
    }

    // metodes

    public String defensar() {// para imprimir las opciones y devolver el resultado
        System.out.println("¿Cual es tu respuesta?");
        System.out.println("1 " + comebackOptions[0]);
        System.out.println("2 " + comebackOptions[1]);
        System.out.println("3 " + comebackOptions[2]);
        System.out.println("4 " + comebackOptions[3]);
        System.out.println("5 " + comebackOptions[4]);
        System.out.println("6 " + comebackOptions[5]);
        System.out.println("7 " + comebackOptions[6]);
        System.out.println("8 " + comebackOptions[7]);
        System.out.println("9 " + comebackOptions[8]);
        System.out.println();
        this.response = sc.nextInt();// pedimos la respuesta
        return comebackOptions[response - 1];// pasamos el valor correspondiente del array
    }

    public boolean vida() {// para restar vida al heroe y comprobar si sigue vivo
        this.vida--;
        if (vida > 0) {
            this.alive = true;
        } else {
            this.alive = false;
        }
        return alive;
    }
}
