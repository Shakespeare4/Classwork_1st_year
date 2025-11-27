package es.cide.programacio;

public class Cotxeelectric extends Cotxe implements Recarregable {
    private int bateriaMax;
    private int bateriaActual;


    public Cotxeelectric(String matricula, String marca,  int plaçes, double velocitatMaxima, double preu, int bateriaMax, int bateriaActual){
        super(matricula, marca, plaçes, velocitatMaxima, preu);
        this.bateriaMax = bateriaMax;
        this.bateriaActual = bateriaActual;
    }
    public double calcularPreuLloguer(int dies){
        return preu/dies;
    };
    public void carregarBateria(){
        bateriaActual = bateriaMax;
    }
    public int getNivellBateria(){
        return bateriaActual;
    }
}
