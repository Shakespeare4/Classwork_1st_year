package es.cide.programacio;

import java.util.Scanner;
import java.util.Random;

public class Heroi {
    private Scanner sc = new Scanner(System.in);
    private Random ra = new Random();
    private String nom = "Guybrush ";
    private int vida = 10;
    private boolean alive = true;
    private int response;
    private int insultPirata;
    int option1, option2, option3;
    private String comebacks[] = new String[3];
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


    // getters
    public String getnomheroi() {
        return nom;
    }

    public boolean getestatheroi() {
        return alive;
    }

    // setters
    public void setnomheroi(String newnom) {
        this.nom = newnom;
    }
    public void setIndexInsult(int index){
        this.insultPirata = index;
    }


    // metodes

    public int defensar() {
        while(option1 != insultPirata|| option2 != insultPirata|| option3 != insultPirata){
            option1 = ra.nextInt(9);
            option2 = ra.nextInt(9);
            option3 = ra.nextInt(9);
        }

        do {
            this.comebacks[0] = comebackOptions[option1];
            this.comebacks[1] = comebackOptions[option2];
            this.comebacks[2] = comebackOptions[option3];
        } while (this.comebacks[0].equals(this.comebacks[1])
                || this.comebacks[0].equals(this.comebacks[2])
                || this.comebacks[1].equals(this.comebacks[2]));
        System.out.println("1 " + comebacks[0]);
        System.out.println("2 " + comebacks[1]);
        System.out.println("3 " + comebacks[2]);
        this.response = sc.nextInt();
        return response;
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
