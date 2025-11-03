package es.cide.programacio;

public class Vehicle {
    //atributos
    int peso;
    int plazas;
    int ocupantes;
    int cuentkm;
    double combustible;
    double consumo;
    double range;
    double distanciamax;
    String tipocombustible;
    double autonomiatotal;
    
    //constructor
    public Vehicle(int peso, int plazas, int ocupantes, double consumo, double combustible, String tipocombustible){
        this.peso = peso;
        this.plazas = plazas;
        this.ocupantes = ocupantes;
        this.combustible = combustible;
        this.tipocombustible = tipocombustible;
        this.consumo = consumo;
    }

    // metodoss
    public double range(){
            range = combustible*consumo;
            return range;
        
    }
    public int addocupantes(){
        
        ocupantes++;
        return ocupantes;
    }
    public int removeocupantes(){
        if (ocupantes <= plazas){
        ocupantes--;}
        return ocupantes;
    }
}
