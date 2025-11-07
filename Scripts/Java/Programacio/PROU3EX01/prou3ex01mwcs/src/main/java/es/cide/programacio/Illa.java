package es.cide.programacio;

import java.util.Random;

public class Illa {
    Random ra = new Random();
    String nom;
    Pirata illa[] = new Pirata[ra.nextInt(2, 8)];
    int length = illa.length;

    public Illa() {
        for (int i = 0; i < length; i++) {
            Pirata insertPirata = new Pirata();
            illa[i] = insertPirata;
        }
    }

    public int getLongitudIlla() {
        return illa.length;
    }

    public Pirata vullUnPirata(int index) {
        return illa[index];

    }

}
