package es.cide.programacio;
import java.util.Random;

public class Guybrush extends Heroi {
    private String[] respostes = new String[4];
    private int respostaOriginal;
    Random ra = new Random();
    int c;
    public Guybrush(String nomG, int vidaG){
        super(nomG, vidaG);
        this.nom = nomG;
        this.vida = vidaG;
        this.hViu = true;
        this.c = 0;
    }


    @Override
    public void defensar() {// para imprimir las opciones y devolver el resultado
        respostaOriginal = ra.nextInt(9);
        for(c=0; c<4;++c){
            if (respostaOriginal==opcionsResposta.length-1){
                respostes[c] = opcionsResposta[respostaOriginal];
                respostaOriginal = 0;
            }else{
                respostes[c] = opcionsResposta[respostaOriginal];
                ++respostaOriginal;
            }

        }
        for (int i = 0; i<respostes.length;i++){
            System.out.println((i+1)+" "+respostes[i]);
        }
        this.resposta = sc.nextInt();// pedimos la respuesta
        System.out.println();
        this.respostaString = respostes[this.resposta-1];
        // pasamos el valor correspondiente del array
    }
    public void sayHello(){
        System.out.println("¡Soy Guybrush Threepwood, gran pirata!™");
        System.out.println();
    }
    
    public void sayGoodBye(){
        System.out.println("¡Eso es todo amigos!");
        System.out.println();

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
