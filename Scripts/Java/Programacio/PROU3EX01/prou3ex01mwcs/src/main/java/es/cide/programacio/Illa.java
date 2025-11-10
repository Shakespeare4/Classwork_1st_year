package es.cide.programacio;

import java.util.Random;//importamos la clase Random

public class Illa {
    // atributos
    private Random ra = new Random();
    private String nom;
    private Pirata illa[];
    private int length;
    private String[] nameOptionsPirata = { // creamos un array con los posibles nombres de pirata
            "John pirata",
            "Babraverde",
            "Jerry el Gallego",
            "Antonio Matapulpos",
            "Eustaquio el iluminado",
            "David Juanes",
            "Xim el bufagaites"
    };
    private String[] nameOptionsIlla = { // creamos un array con los posibles nombres de isla
            "La isla de las tinieblas",
            "Ibiza",
            "Sta Helena"
    };

    // Constructor
    public Illa() {
        this.illa = new Pirata[ra.nextInt(2, 8)];// inicializamos el tamaño de la isla
        this.length = illa.length;// guardamos la longitud del array en una variable
        this.nom = nameOptionsIlla[ra.nextInt(3)];// elegimos un nombre aleatorio de nuestras pciones
        for (int i = 0; i < length; i++) {// llenamos cada posición del aray illa con un pirata nuevo
            Pirata insertPirata = new Pirata(nameOptionsPirata[ra.nextInt(7)]);// cada pirata tiene un nombre aleatorio
            illa[i] = insertPirata;
        }
    }

    // getters
    public int getLongitudIlla() {// para pedir la longitud de illa
        return illa.length;
    }

    public String getnomIlla() {// para pedir el nombre de illa
        return this.nom;
    }

    // metodos
    public Pirata vullUnPirata(int index) {// para pedirun pirata dentro de illa
        return illa[index];

    }

}
