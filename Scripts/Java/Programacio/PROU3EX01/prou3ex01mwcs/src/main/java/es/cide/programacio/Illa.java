package es.cide.programacio;

import java.util.Random;//importamos la clase Random

public class Illa {
    // atributos
    private Random ra = new Random();
    private String nom;
    private Pirata illa[];
    private Pirata pirataIntroduit;
    private int longIlla;

    private String[] nameOptionsIlla = { // creamos un array con los posibles nombres de isla
            "Mêlée",
            "Booty",
            "Scabb",
            "Monkey Island"
    };
            private String[] opcionsNomPirata = { // creamos un array con los posibles nombres de pirata
            "John pirata",
            "Largo LaGrande",
            "Jerry el Gallego",
            "Antonio Matapulpos",
            "Eustaquio el iluminado",
            "Oriol el bufagaites",
            "Jacobo Gorrión",
            "Gato Pirata"
    };

    // Constructor
    public Illa() {
        this.illa = new Pirata[ra.nextInt(2, 8)];// inicializamos el tamaño de la isla
        this.longIlla = illa.length;// guardamos la longitud del array en una variable
        this.nom = nameOptionsIlla[ra.nextInt(4)];// elegimos un nombre aleatorio de nuestras pciones
        for (int i = 1; i < longIlla; i++) {// llenamos cada posición del aray illa con un pirata nuevo
            pirataIntroduit = new PirataNormal(opcionsNomPirata[ra.nextInt(7)], ra.nextInt(1,3));// cada pirata tiene un nombre aleatorio
            illa[i] = pirataIntroduit;
        }
        pirataIntroduit = new LeChuck("Pirata Lechuck", ra.nextInt(1,3));
        illa[0] = pirataIntroduit;
    }

    // getters
    public int getLongitudIlla() {// para pedir la longitud de illa
        return illa.length;
    }

    public String getnomIlla() {// para pedir el nombre de illa
        return this.nom;
    }

    // metodos
    public Pirata vullUnPirata(int index) {// para pedir un pirata dentro de illa
        return illa[index];

    }

}
