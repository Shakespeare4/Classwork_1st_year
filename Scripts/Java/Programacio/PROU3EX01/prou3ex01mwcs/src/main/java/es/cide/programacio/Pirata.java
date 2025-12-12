package es.cide.programacio;

import java.util.Random;//importamos la clase Random

public abstract class Pirata extends Personatge implements Speak, Fight {
    private Random ra = new Random();// inicializamos el random
    protected String nom;
    protected String[] insults;
    protected boolean pViu;
    protected int insultOriginal1, insultOriginal2, insultOriginal3, posicioOriginal, posInsult, vida, nomAleatori;
    protected String[] opcionsInsult = { // creamos un array con las posibles insultos
    "¡Eres tan repulsivo como un mono en lencería!",
    "¡Luchas como un granjero!",
    "¡He hablado con simios más educados que tú!",
    "¡Cada enemigo con el que he luchado ha sido aniquilado!",
    "¡Mi espada es conocida por todo el caribe!",
    "¡Tenía un perro más inteligente que tu!",
    "¿Ya has dejado de llevar pañales?",
    "No hay palabras para lo aqueroso que eres.",
    };
    protected String[] opcionsResposta = { // creamos un array con las posibles respuestas
    "¿Tanto me parezco a tu prometida?",
    "¡Suerte que tú peleas como una vaca!",
    "¡Me alegra que fueras a tu reunión familiar!",
    "Con un aliento como ese, ¡Se habran ahogado!",
    "¡Una pena que nadie haya oído hablar de tí!",
    "¡Te debió enseñar todo lo que sabes!",
    "¿Por que, quieres que te preste uno?",
    "Si las hay, solo que nunca las aprendiste.",
    };
    protected boolean[] insultUsat = new boolean[3];
    // constructor
    public Pirata(String nouNom, int novaVida) {
        super(nouNom, novaVida);
        this.nom = nouNom;
        this.vida = novaVida;
        insults = new String[3];// inicializamos el array de insultos
        vida = ra.nextInt(1, 3);// inicializamos la vida con un valor aleatorio entre 1 y 3
        pViu = true;// inicializamos el estado como vivo

    }

    //getters

    public boolean getestatpirata() {// para pedir el estado del pirata
        return this.pViu;
    }

    public String getnomPirata() {// para pedir el nombre del pirata
        return this.nom;
    }
    public abstract boolean replica(String response);


    public void sayHello(){

    }
    
    public void sayGoodBye(){

    }
    
    public void defensar(){

    }
}
