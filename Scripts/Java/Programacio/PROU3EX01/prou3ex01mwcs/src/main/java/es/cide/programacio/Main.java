package es.cide.programacio;

public class Main {
    public static void main(String[] args) {
        Heroi Guybrush = new Heroi();
        Guybrush.setvidaheroi(1);
        //int vidah= Guybrush.getvidaheroi();
        Guybrush.vida();
        boolean alive = Guybrush.getestatheroi();
        System.out.println(alive);
    }
}