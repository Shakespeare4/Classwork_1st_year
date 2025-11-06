package es.cide.programacio;

import java.util.Random;

public class Pirata {
    private Random ra = new Random();
    // private String nom;
    private String insults[] = new String[3];
    private int vida = ra.nextInt(1, 3);
    private int insultindex = ra.nextInt(3);
    private boolean alive = true;
    private String[] insultOptions = {
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
    private String[] comebackOptions = {
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
    public Pirata() {
        do {
            this.insults[0] = insultOptions[ra.nextInt(9)];
            this.insults[1] = insultOptions[ra.nextInt(9)];
            this.insults[2] = insultOptions[ra.nextInt(9)];
        } while (this.insults[0].equals(this.insults[1])
                || this.insults[0].equals(this.insults[2])
                || this.insults[1].equals(this.insults[2]));
    }

    //
    public int getInsultIndex() {
        return this.insultindex;
    }

    public boolean getestatpirata() {
        return this.alive;
    }

    // metodes
    public String insultar() {
        return insults[insultindex];

    }

    public boolean replica(String response) {
        if (response.equals(insults[insultindex])) {
            return true;
        } else {
            return false;
        }

    }

    public boolean vida() {
        this.vida--;
        if (vida > 0) {
            this.alive = true;
        } else {
            this.alive = false;
        }
        return alive;
    }

}
