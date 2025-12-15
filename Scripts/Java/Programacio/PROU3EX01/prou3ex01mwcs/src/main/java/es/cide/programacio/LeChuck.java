package es.cide.programacio;
import java.util.Random;
public class LeChuck extends Pirata {
    Random ra = new Random();
    private boolean unique;
    private String[] insultsElegits = new String[4];
    public LeChuck(String nom, int vida){
        super(nom, vida);
        this.vida = vida*2;
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
    public void insultar() {//para devolver un insulto aleatorio y guardar su posicion original
        do{
        posInsult = ra.nextInt(4);
        insultUsat[posInsult] = true;
        }while(!insultUsat[posInsult]);
        
        if (insults[posInsult] == opcionsInsult[insultOriginal1]) {
            posicioOriginal = insultOriginal1;
        } else if (insults[posInsult] == opcionsInsult[insultOriginal2]) {
            posicioOriginal = insultOriginal2;
        } else if (insults[posInsult] == opcionsInsult[insultOriginal3]) {
            posicioOriginal = insultOriginal3;
        }
            
        if (insults[posInsult].equals("¡Eres una desgracia para tu especie!")) {
            unique = true;
        }
        System.out.println( insults[posInsult]);
    }
    public void sayHello(){
        System.out.println("Soy LeChuck, el temible capitán fantasma");
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
