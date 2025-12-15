package es.cide.programacio;
import java.util.Random;
public class PirataNormal extends Pirata{
    Random ra = new Random();


    private String[] insultsElegits = new String[3];

    public PirataNormal(String nom, int vida){
        super(nom, vida);
        this.nom = nom;
        this.pViu = true;
        
        insultOriginal1 = ra.nextInt(8);
        insultOriginal2 = ra.nextInt(8);
        insultOriginal3 = ra.nextInt(8);
        while (insultOriginal1 == insultOriginal2){
        insultOriginal2 = ra.nextInt(8);
        }
        while(insultOriginal1==insultOriginal3||insultOriginal2==insultOriginal3){
        insultOriginal3 = ra.nextInt(8);
        }
        insultsElegits[0] = this.opcionsInsult[insultOriginal1];// asignamos los insultos elegidos al array insults
        insultsElegits[1] = this.opcionsInsult[insultOriginal2];
        insultsElegits[2] = this.opcionsInsult[insultOriginal3];
    }
     // metodes
    public void insultar() {//para devolver un insulto aleatorio y guardar su posicion original
        while(insultUsat[posInsult]== true);{
        posInsult = ra.nextInt(3);
        insultUsat[posInsult] = true;
        }
        
        
        if (insultsElegits[posInsult] == opcionsInsult[insultOriginal1]) {
            posicioOriginal = insultOriginal1;
        } else if (insultsElegits[posInsult] == opcionsInsult[insultOriginal2]) {
            posicioOriginal = insultOriginal2;
        } else if (insultsElegits[posInsult] == opcionsInsult[insultOriginal3]) {
            posicioOriginal = insultOriginal3;
        }
        
        System.out.println(insultsElegits[posInsult]);
        
        

    }

    public boolean replica(String response) {// para comprobar si la respuesta del heroe es correcta
        return response.equals(opcionsResposta[posicioOriginal]);

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
        System.out.println("¿Te crees madera de pirata? ¡Porque no desenvainas y lo comprobamos!");
    }
    
    public void sayGoodBye(){
        System.out.println("¡Vaya, No te gano ni con ventaja!");
    }
}
