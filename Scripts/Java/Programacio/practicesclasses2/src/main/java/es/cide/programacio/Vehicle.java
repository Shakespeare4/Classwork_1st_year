package es.cide.programacio;

public class Vehicle {
    //atributos
    int peso;
    int plazas;
    int ocupantes;
    int cuentkm;
    double combustible;
    double consumo;
    String tipocombustible;
    double autonomiatotal;
    
    //constructor
    public Vehicle(int peso2, int plazas2, int ocupantes2, double combustible2, double consumo2){
        this.peso = peso2;
        this.plazas = plazas2;
        this.ocupantes = ocupantes2;
        this.combustible = combustible2;
        this.consumo = consumo2;
    }

    // metodos
    public double range(){
        while (combustible > 0){
            combustible = combustible-consumo;
            cuentkm = cuentkm + 100;
        }
        return cuentkm;
    }
}
