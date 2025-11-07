package es.cide.programacio;

import java.util.Random;

public class Pirata {
    private Random ra = new Random();
    // private String nom;
    private String insults[] = new String[3];
    private int vida = ra.nextInt(1, 3);
    private int insultindex;
    private boolean alive = true;
    private int original1, original2, original, original3;
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
            original = ra.nextInt(9);
            original2 = ra.nextInt(9);
            original1 = ra.nextInt(9);
        } while (this.original ==(this.original1)
                || this.original ==(this.original2)
                || this.original1 == (this.original2));
        insults[0] = insultOptions[original];
        insults[1] = insultOptions[original1];
        insults[2] = insultOptions[original2];

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
        insultindex= ra.nextInt(3);
        if(insults[insultindex] ==insultOptions[original]){
            original3 = original;
        }else if (insults[insultindex] ==insultOptions[original1]){
            original3= original1;
        }else if(insults[insultindex] ==insultOptions[original2]){
            original3 = original2;
        }
        return insults[insultindex];


    }

    public boolean replica(String response) {
        if (response.equals(comebackOptions[original3])) {
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

