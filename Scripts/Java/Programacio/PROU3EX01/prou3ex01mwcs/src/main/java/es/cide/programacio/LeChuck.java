package es.cide.programacio;
import java.util.Random;
public class LeChuck extends Pirata {
    Random ra = new Random();

    public LeChuck(String nom, int vida){
        super(nom, vida);
        this.insultsElegits = new String[4];
        insultOriginal1 = ra.nextInt(8);
        while (insultOriginal1 == insultOriginal2){
        insultOriginal2 = ra.nextInt(8);
        }
        while(insultOriginal1==insultOriginal3||insultOriginal2==insultOriginal3){
        insultOriginal3 = ra.nextInt(8);
        }
        insultsElegits[0] = opcionsInsult[insultOriginal1];
        insultsElegits[1] = opcionsInsult[insultOriginal2];
        insultsElegits[2] = opcionsInsult[insultOriginal3];
        insultsElegits[3] = "¡Eres una desgracia para tu especie!";

        
    }
    
    public String getLechuckNom(){
        return nom;
    }
    public int getVidaLechuck(){
        return vida;
    }
    public boolean vida() {// para restar vida al pirata y comprobar si sigue vivo
        this.vida--;
        if (vida != 0) {
            this.pViu = true;
        } else {
            this.pViu = false;
        }
        return pViu;
    }
    public void sayHello(){
        System.out.println("¡Soy LeChuck, el temible capitán fantasma!");
    }
    
    public void sayGoodBye(){
        System.out.println("¡No has visto lo último de mí!");
    }
        public boolean replica(String response) {// para comprobar si la respuesta del heroe es correcta
        if(response.equals(opcionsResposta[posicioOriginal])){
            return true;
        }else if (response.equals("¡Al menos la mía saben cual es!")&& unique == true){
            return true;
        }else{
            return false;
        }

    }
}
