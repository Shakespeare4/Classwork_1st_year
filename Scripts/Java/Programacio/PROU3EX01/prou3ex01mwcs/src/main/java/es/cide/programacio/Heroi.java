package es.cide.programacio;

import java.util.Scanner;//importamos la clase Scanner

public abstract class Heroi extends Personatge implements Fight, Speak{
    // atributos
    private Scanner sc = new Scanner(System.in);
    protected boolean hViu;
    protected int  resposta, vida;
    protected String respostaString;
    protected String[] opcionsResposta = { // creamos un array con las posibles respuestas
            "¿Tanto me parezco a tu prometida?",
            "¡Suerte que tú peleas como una vaca!",
            "¡Me alegra que fueras a tu reunión familiar!",
            "Con un aliento como ese, ¡Se habran ahogado!",
            "¡Una pena que nadie haya oído hablar de tí!",
            "¡Te debió enseñar todo lo que sabes!",
            "¿Por que, quieres que te preste uno?",
            "Si las hay, solo que nunca las aprendiste.",
    };

    // constructor
    public Heroi(String nomH, int vidaH) {
        super(nomH, vidaH);
        this.hViu = true;// inicializamos el estado como vivo

    }

    // getters

    public boolean getestatheroi() {// para pedir el estado del heroe
        return hViu;
    }
    public String getRespostaHeroi(){
        return this.respostaString;
    }

    public String getNomHeroi(){
        return this.nom;
    }
    // setters
    public void setnomheroi(String newnom) {// para cambiar el nombre del heroe
        this.nom = newnom;
    }

    // metodes

    
    public void sayHello(){

    }
    
    public void sayGoodBye(){

    }
    public void insultar(){

    }

}
