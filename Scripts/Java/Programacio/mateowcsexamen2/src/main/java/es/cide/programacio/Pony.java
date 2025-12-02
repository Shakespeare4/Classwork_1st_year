package es.cide.programacio;
import java.util.Random;
public class Pony {
    //atributs
    Random ra = new Random();
    private String nom;
    private int energia, força;
    private boolean teEnergia;
    //constructor

    public Pony(String nom, int energia){
        this.nom = nom;
        this.energia = energia;
        força = ra.nextInt(1,5);
        teEnergia = true;
    }


    //getters
    public String getNomPony(){
        return this.nom;
    }

    public int getEnergiaPony(){
        return this.energia;
    }

    public int getForçaPony(){
        return this.força;
    }

    public boolean getEstatPony(){
        return teEnergia;
    }

    //setters

    public void setNomPony(String nom){
        this.nom = nom;
    }

        public void setEnergiaPony(int energia){
        this.energia = energia;
    }

        public void setNForçaPony(int força){
        this.força = força;
    }

    public void setEstatPony(boolean estat){
        this.teEnergia = estat;
    }

    //metodes

    public boolean superarObstacle(Obstacle o){
        if (this.força > o.getDificultatObstacle()){// si la força del pony es major a la dificultat de l'obstacle
            o.setEstatObstacle(true);// guardam l'obstacle com a superat
        }

        this.energia = this.energia - (o.getDificultatObstacle()/2);// restam a l'energia la meitat de la difficultat

        if (this.energia>0){// si l'energia es major a 0
            teEnergia = true;
            return teEnergia;
        }else{
            teEnergia = false;
            return teEnergia;
        }
    }
}
