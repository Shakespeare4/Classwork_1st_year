package es.cide.programacio;

abstract class Cotxe extends Vehicle {
    protected int plaçes;
    protected double velocitatMaxima, preu;

    public Cotxe(String matricula, String marca, int plaçes, double velocitatMaxima, double preu) {
        super(matricula, marca);
        this.plaçes = plaçes;
        this.velocitatMaxima = velocitatMaxima;
    }

    public double getVelocitatMaxima() {
        return velocitatMaxima;
    }
}
