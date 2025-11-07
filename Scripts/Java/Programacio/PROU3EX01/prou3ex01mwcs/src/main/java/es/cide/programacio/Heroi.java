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
    private int c;
    int option1, option2, option3;
    private String comebacks[] = new String[9];
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

    public String defensar() {
        System.out.println("1 " + comebackOptions[0]);
        System.out.println("2 " + comebackOptions[1]);
        System.out.println("3 " + comebackOptions[2]);
        System.out.println("4 " + comebackOptions[3]);
        System.out.println("5 " + comebackOptions[4]);
        System.out.println("6 " + comebackOptions[5]);
        System.out.println("7 " + comebackOptions[6]);
        System.out.println("8 " + comebackOptions[7]);
        System.out.println("9 " + comebackOptions[8]);
        this.response = sc.nextInt();
        return comebackOptions[response-1];
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
