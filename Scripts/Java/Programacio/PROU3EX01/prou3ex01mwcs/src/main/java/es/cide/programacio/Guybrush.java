package es.cide.programacio;
import java.util.Random;

public class Guybrush extends Heroi {
    private String[] respostes = new String[4];
    private int respostaOriginal1, respostaOriginal2, respostaOriginal3, respostaOriginal4;
    Random ra = new Random();
    public Guybrush(String nomG, int vidaG){
        super(nomG, vidaG);
        this.nom = nomG;
        this.vida = vidaG;
        this.hViu = true;
        do {
            respostaOriginal1 = ra.nextInt(9);
            respostaOriginal2 = ra.nextInt(9);
            respostaOriginal3 = ra.nextInt(9);
            respostaOriginal4 = ra.nextInt(9);
        } while (this.respostaOriginal1 == (this.respostaOriginal2)
                || this.respostaOriginal1 == (this.respostaOriginal3)
                || this.respostaOriginal2 == (this.respostaOriginal3)
                ||this.respostaOriginal1 == (this.respostaOriginal4)
                ||this.respostaOriginal2 == (this.respostaOriginal4)
                || this.respostaOriginal3 == this.respostaOriginal4);

            respostes[0] = opcionsResposta[respostaOriginal1];
            respostes[1] = opcionsResposta[respostaOriginal2];
            respostes[2] = opcionsResposta[respostaOriginal3];
            respostes[3] = opcionsResposta[respostaOriginal4];
        
    }



    public void sayHello(){
        System.out.println("¡Soy Guybrush Threepwood, gran pirata!™");
    }
    
    public void sayGoodBye(){
        System.out.println("¡Eso es todo amigos!");

    }
    public void insultar(){

    }


    @Override
    public boolean vida() {// para restar vida al heroe y comprobar si sigue vivo
        this.vida-=2;
        if (this.vida > 0) {
            this.hViu = true;
        } else {
            this.hViu = false;
        }
        return hViu;
    }
}
