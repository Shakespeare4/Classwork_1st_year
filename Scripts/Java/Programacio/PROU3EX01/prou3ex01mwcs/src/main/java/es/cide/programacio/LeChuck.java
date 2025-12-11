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
    };
    
private String[] opcionsResposta = {
            "¡Entonces matarte a tí será fungicidio justificado!",
            "¡Si no cuentas todos con los que has salido!",
            "Contigo aquí ¡Quiero ser fumigado!",
            "¿Esa es tu cara? Pensaba que era tu trasero...",
            "¡Al menos la mía saben cual es!",
            "¡Si dejaras de huir tanto, lo verías!",
            "¡Una pena que sean inventadas!",
            "¡Tu olor ya me tiene!"
};

    private String[] insultsElegits = new String[3];
    public LeChuck(String nom, int vida){
        super(nom, vida);
        do {/*
             * aseguramos que los 3 insultos elegidos sean diferentes y guardamos su
             * posicion original en el array insultOptions
             */
            insultOriginal1 = ra.nextInt(8);
            insultOriginal2 = ra.nextInt(8);
            insultOriginal3 = ra.nextInt(8);
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
        posInsult = ra.nextInt(3);
        insultUsat[posInsult] = true;
        }while(!insultUsat[posInsult]);
        
        if (insults[posInsult] == opcionsInsult[insultOriginal1]) {
            posicioOriginal = insultOriginal1;
        } else if (insults[posInsult] == opcionsInsult[insultOriginal2]) {
            posicioOriginal = insultOriginal2;
        } else if (insults[posInsult] == opcionsInsult[insultOriginal3]) {
            posicioOriginal = insultOriginal3;
        }
        //return insults[posInsult];
    }
    public void sayHello(){
        System.out.println("Soy LeChuck y te voy a tocar");
    }
    
    public void sayGoodBye(){
        System.out.println("Soy LeChuck y me han tocado");
    }
        public boolean replica(String response) {// para comprobar si la respuesta del heroe es correcta
        return response.equals(opcionsResposta[posicioOriginal]);

    }
}
