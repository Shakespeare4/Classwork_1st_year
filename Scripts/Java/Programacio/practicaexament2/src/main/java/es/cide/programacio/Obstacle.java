package es.cide.programacio;

import java.util.Random;//importam el random per fer nombres aleatoris

public class Obstacle {
    // atributs
    Random ra = new Random();
    private String tipus;
    private int dificultat;

    // constructor
    public Obstacle(String tipus) {
        this.tipus = tipus;
        dificultat = ra.nextInt(1, 11);
    }

    // getters
    public int getDificultat() {
        return dificultat;
    }

    public String getTipus() {
        return tipus;
    }

    // setters
    public void setObstacleDificultat(int dificultat) {
        this.dificultat = dificultat;
    }

    // metodes
    public String toString() {// retornam la informació del obstacle (Tendría que utilitzar override)
        return ("Tipus: " + tipus + " Diffultat: " + String.valueOf(dificultat));
    }
}
