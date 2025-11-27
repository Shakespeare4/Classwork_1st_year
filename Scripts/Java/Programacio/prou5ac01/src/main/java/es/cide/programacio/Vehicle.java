package es.cide.programacio;

abstract class Vehicle {
    protected String matricula;
    protected String marca;

    public Vehicle(String matricula, String marca) {
        this.matricula = matricula;
        this.marca = marca;
    }
    public abstract double calcularPreuLloguer(int dies);

    public void mostrarInfo() {
        System.out.println("--- FITXA VEHICLE ---");
        System.out.println("Marca: " + marca);
        System.out.println("Matrícula: " + matricula);
    }
}

