package es.cide.programacio;

public abstract class Personatge {

    protected String nom;
    protected int vida;

    public Personatge(String nomP, int vidaP) {
        this.nom = nomP;
        this.vida = vidaP;
    }

    public abstract boolean vida();
}