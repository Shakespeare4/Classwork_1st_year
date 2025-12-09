package es.cide.programacio;
import java.util.Random;
public class LeChuck extends Pirata {
    Random ra = new Random();
    private String insultActual;
private String[] opcionsInsult = { // creamos un array con las posibles insultos
            "¡Matarte sería homicidio justificado!",
            "¡Eres el monstruo más feo que ha creado Davy Jones!",
            "¿Quieres ser enterrado o incinerado?",
            "¡Verte cara a cara conmigo te debe haber petrificado!",
            "¡Eres una desgracia para tu especie!",
            "¡Nunca había visto un espadachín tan torpe!",
            "¡Mis hazañas son cantadas por todo el Caribe!",
            "¡Te dejaré devastado, mutilado y perforado!",
            "¡En mi última batalla acabé lleno de sangre!"
    };

    private String[] insultsElegits = new String[3];
    public LeChuck(String nom, int vida){
        super(nom, vida);
        do {/*
             * aseguramos que los 3 insultos elegidos sean diferentes y guardamos su
             * posicion original en el array insultOptions
             */
            insultOriginal1 = ra.nextInt(9);
            insultOriginal2 = ra.nextInt(9);
            insultOriginal3 = ra.nextInt(9);
        } while (this.insultOriginal1 == (this.insultOriginal2)
                || this.insultOriginal1 == (this.insultOriginal3)
                || this.insultOriginal2 == (this.insultOriginal3));
        insultsElegits[0] = this.opcionsInsult[insultOriginal1];// asignamos los insultos elegidos al array insults
        insultsElegits[1] = this.opcionsInsult[insultOriginal2];
        insultsElegits[2] = this.opcionsInsult[insultOriginal3];
        
    }
    
    public String getLechuckNom(){
        return nom;
    }
    public int getVidaLechuck(){
        return vida;
    }
    
}
