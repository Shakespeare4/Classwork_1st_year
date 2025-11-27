package es.cide.programacio;

public class Patinet extends Vehicle implements Recarregable {
    private double preu;
    private int bateriaMax;
    private int bateriaActual;


    public Patinet(String matricula, String marca, double preu, int bateriaMax, int bateriaActual){
        super(matricula, marca);
        this.preu = preu;
        this.bateriaMax = bateriaMax;
        this.bateriaActual = bateriaActual;
    };


    public double calcularPreuLloguer(int dies){
        return preu/dies;
    };
    public void carregarBateria(){
        bateriaActual = bateriaMax;
    }
    public int getNivellBateria(){
        return bateriaActual;
    }
    @Override
    public void mostrarInfo() {
        System.out.println("--- FITXA PATINET ---");
        System.out.println("Matrícula: " + matricula);
        System.out.println("Marca: " + marca);
        
    }
}
