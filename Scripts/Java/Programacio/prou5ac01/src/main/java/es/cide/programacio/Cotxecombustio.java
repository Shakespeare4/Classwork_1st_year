package es.cide.programacio;

public class Cotxecombustio extends Cotxe {
    private double capacitatDeposit;

    public Cotxecombustio(String matricula, String marca, int plaçes, double velocitatMaxima, double preu, double capacitatDeposit){
        super(matricula, marca, plaçes, velocitatMaxima, preu );
        this.capacitatDeposit = capacitatDeposit;
    }




    public double calcularPreuLloguer(int dies){
        return preu/dies;
    };
}
