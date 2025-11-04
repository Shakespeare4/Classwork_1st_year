package es.cide.programacio;
import java.util.Random;
public class Illa {
    Random ra = new Random();
    String nom;
    Pirata illa[] = new Pirata[ra.nextInt(3,7)];
    int length = illa.length;

    public Illa(){
        for(int i = 0; i< length; i++){
            illa[i] = new Pirata();

        }
    }

}
