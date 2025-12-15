package es.cide.programacio;
import java.util.Random;
public class Elaine extends Heroi {
    Random ra = new Random();    
    public Elaine(String nom, int vida){
        super(nom, vida);
        this.nom = nom;
        this.vida = vida;
    }



    public void sayHello(){
        System.out.println("Me llamo ELaine Marlen, gobernante de la isla Melee.");
    }
    
    public void sayGoodBye(){
        System.out.println("Au revoir, hasta que nuestros caminos se vuelvan a cruzar.");

    }
    public void insultar(){

    }
    

    public boolean vida() {// para restar vida al heroe y comprobar si sigue vivo
        this.vida--;
        if (vida > 0) {
            this.hViu = true;
        } else {
            this.hViu = false;
        }
        return hViu;
    }
}
