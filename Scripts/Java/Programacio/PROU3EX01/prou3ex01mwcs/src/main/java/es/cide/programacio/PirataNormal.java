package es.cide.programacio;
import java.util.Random;
public class PirataNormal extends Pirata{
    Random ra = new Random();
        private String[] opcionsInsult = { // creamos un array con las posibles insultos
            "¡Eres tan repulsivo como un mono en lencería!",
            "¡Luchas como un granjero!",
            "¡He hablado con simios más educados que tú!",
            "¡Cada enemigo con el que he luchado ha sido aniquilado!",
            "¡Mi espada es conocida por todo el caribe!",
            "¡Tenía un perro más inteligente que tu!",
            "¿Ya has dejado de llevar pañales?",
            "No hay palabras para lo aqueroso que eres.",
            "¡Me haces querer vomitar!"
    };
    private String[] opcionsResposta = { // creamos un array con las posibles respuestas
            "¿Tanto me parezco a tu prometida?",
            "¡Suerte que tú peleas como una vaca!",
            "¡Me alegra que fueras a tu reunión familiar!",
            "Con un aliento como ese, ¡Se habran ahogado!",
            "¡Una pena que nadie haya oído hablar de tí!",
            "¡Te debió enseñar todo lo que sabes!",
            "¿Por que, quieres que te preste uno?",
            "Si las hay, solo que nunca las aprendiste.",
            "¡Tu me haces pensar que alguien ya lo hizo!"
    };
        private String[] opcionsNomPirata = { // creamos un array con los posibles nombres de pirata
            "John pirata",
            "Largo LaGrande",
            "Jerry el Gallego",
            "Antonio Matapulpos",
            "Eustaquio el iluminado",
            "LeChuck",
            "Oriol el bufagaites",
            "Jacobo Gorrión",
            "Gato Pirata"
    };
    private String[] insultsElegits = new String[3];

    public PirataNormal(String nom, int vida){
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
     // metodes
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
}
