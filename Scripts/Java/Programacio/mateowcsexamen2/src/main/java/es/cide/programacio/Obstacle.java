package es.cide.programacio;
import java.util.Random;
public class Obstacle {
    //atributs
    Random ra = new Random();
    private String tipus;
    private int dificultat;
    private String[] noms = {"Seto", "Barra", "valla"};
    boolean superat;

    //constructor
    public Obstacle(){
        tipus = noms[ra.nextInt(3)];
        dificultat = ra.nextInt(1,7);
        superat  = false;

    }

    //getters

    public String getTipusObstacle(){
        return this.tipus;
    }

    public int getDificultatObstacle(){
        return this.dificultat;
    }
    public boolean getEstatObstacle(){
        return this.superat;
    }

    //setters

    public void setTipusObstacle(String tipus){
        this.tipus = tipus;
    }

    public void setDificultatObstacle(int dificultat){
    this.dificultat = dificultat;
    }

        public void setEstatObstacle(boolean estat){
        this.superat = estat;
    }
}
