package es.cide.programacio;
import java.util.Random;
public class Pirata {
    Random ra = new Random();
    String nom;
    String insults[] = new String[3];
    int vida = ra.nextInt(1, 3);
    int insultindex = ra.nextInt();
    boolean alive;
    //constructor
    public Pirata (String insult1, String insult2, String insult3){
        this.insults[0] = insult1;
        this.insults[1] = insult2;
        this.insults[2] = insult3;

    }


    //metodes
    public String insultar(){

        return insults[insultindex];
        
    } 
    public boolean replica(String response){
        if(response.equals(insults[insultindex])){
            return true;
        }else{
            return false;
        }

    }
    public boolean vida(){
        this.vida--;
        if (vida > 0){
            this.alive = true;
        }else{
            this.alive = false;
        }
        return alive;
    }

}
