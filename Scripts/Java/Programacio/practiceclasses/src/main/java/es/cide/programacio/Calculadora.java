package es.cide.programacio;

public class Calculadora {
    // atributos
    double operando1;
    double operando2;

    // constructor
    public Calculadora(double operando11, double operando22) {
        this.operando1 = operando11;
        this.operando2 = operando22;

    }
    // getters y setters
    public void setoperando1(double operando33){
        this.operando1= operando33;
    }
    public void setoperando2(double operando44){
        this.operando2= operando44;
    }
    public double getoperando1(){
        return this.operando1;
    }
    public double getoperando2(){
        return this.operando2;
    }
    // metodos
        public double sumar(){
        double resultadoSuma=operando1+operando2;
        return resultadoSuma;
    }
    public double restar(){
        return operando1-operando2;
    }
    public double multiplicar(){
        return operando1*operando2;
    }
    public double dividir(){
        return operando1/operando2;
    }
}
