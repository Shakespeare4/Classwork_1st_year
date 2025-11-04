package es.cide.programacio;
import java.util.Scanner;
public class Heroi {
    private Scanner sc = new Scanner(System.in);
    private String nom = "Guybrush ";
    private int vida = 10;
    private boolean alive = true;
    private String response;
    //getters
    public String getnomheroi(){
        return nom;
    }
    public boolean getestatheroi(){
        return alive;
    }

    //setters
    public void setnomheroi(String newnom){
        this.nom = newnom;
    }

    //metodes

    public String defensar(){
        this.response = sc.nextLine();
        return response;
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
