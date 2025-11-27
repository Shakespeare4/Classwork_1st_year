package es.cide.programacio;

public class Main {
    public static void main(String[] args) {
    Cotxecombustio cc = new Cotxecombustio("1234ABC", "SEAT", 5, 240, 5000, 100);  
    cc.mostrarInfo();
    System.out.println(cc.calcularPreuLloguer(100)+" al dia");
    Cotxeelectric ce = new Cotxeelectric("4321CBA", "BMW", 6, 220, 8000, 100, 75);
    ce.mostrarInfo();
    System.out.println(ce.calcularPreuLloguer(100)+" al dia");
    System.out.println(ce.getNivellBateria());
    ce.carregarBateria();
    System.out.println(ce.getNivellBateria());
    Patinet pa = new Patinet("2134", "Xiamoi", 2000, 100, 50);
    pa.mostrarInfo();
    System.out.println(pa.calcularPreuLloguer(100));
    System.out.println(pa.getNivellBateria());
    pa.carregarBateria();
    System.out.println(pa.getNivellBateria());

}
}