package es.cide.programacio;

public class Main {
    public static void main(String[] args) {
        Vehicle vc = new Vehicle(0, 5, 0, 5, 50, null);
        double range = vc.range();
        System.out.println(range);

    }
}