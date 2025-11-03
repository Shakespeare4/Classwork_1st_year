package es.cide.programacio;

public class Main {
    public static void main(String[] args) {
        Vehicle vc = new Vehicle(0, 0, 0, 200, 20);
        double range = vc.range();
        System.out.println(range);
    }
}