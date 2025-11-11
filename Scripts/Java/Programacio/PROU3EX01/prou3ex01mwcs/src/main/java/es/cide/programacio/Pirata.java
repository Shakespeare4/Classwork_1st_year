package es.cide.programacio;

import java.util.Random;//importamos la clase Random

public class Pirata {
    private Random ra = new Random();// inicializamos el random
    private String nom;
    private String[] insults;
    private int vida;
    private boolean pViu;
    private int insultOriginal1, insultOriginal2, insultOriginal3, posicioOriginal, posInsult;
    private String[] opcionsInsult = { // creamos un array con las posibles insultos
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
    public Pirata(String nomPirata) {
        this.nom = nomPirata;// asignamos el valor del parametro al atributo nombre
        insults = new String[3];// inicializamos el array de insultos
        vida = ra.nextInt(1, 3);// inicializamos la vida con un valor aleatorio entre 1 y 3
        pViu = true;// inicializamos el estado como vivo
        do {/*
             * aseguramos que los 3 insultos elegidos sean diferentes y guardamos su
             * posicion original en el array insultOptions
             */
            insultOriginal1 = ra.nextInt(9);
            insultOriginal2 = ra.nextInt(9);
            insultOriginal3 = ra.nextInt(9);
        } while (this.insultOriginal1 == (this.insultOriginal2)
                || this.insultOriginal1 == (this.insultOriginal3)
                || this.insultOriginal2 == (this.insultOriginal3));
        insults[0] = opcionsInsult[insultOriginal1];// asignamos los insultos elegidos al array insults
        insults[1] = opcionsInsult[insultOriginal2];
        insults[2] = opcionsInsult[insultOriginal3];

    }

    //getters


    public boolean getestatpirata() {// para pedir el estado del pirata
        return this.pViu;
    }

    public String getnomPirata() {// para pedir el nombre del pirata
        return this.nom;
    }

    // metodes
    public String insultar() {//para devolver un insulto aleatorio y guardar su posicion original
        posInsult = ra.nextInt(3);
        if (insults[posInsult] == opcionsInsult[insultOriginal1]) {
            posicioOriginal = insultOriginal1;
        } else if (insults[posInsult] == opcionsInsult[insultOriginal2]) {
            posicioOriginal = insultOriginal2;
        } else if (insults[posInsult] == opcionsInsult[insultOriginal3]) {
            posicioOriginal = insultOriginal3;
        }
        return insults[posInsult];

    }

    public boolean replica(String response) {// para comprobar si la respuesta del heroe es correcta
        return response.equals(opcionsResposta[posicioOriginal]);

    }

    public boolean vida() {// para restar vida al pirata y comprobar si sigue vivo
        this.vida--;
        if (vida != 0) {
            this.pViu = true;
        } else {
            this.pViu = false;
        }
        return pViu;
    }

}
