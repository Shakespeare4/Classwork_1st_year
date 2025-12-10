package es.cide.programacio;
import java.util.Random;
import java.util.Scanner;
public class Guybrush extends Heroi {
    private String[] respostes = new String[4];
    private int respostaOriginal1, respostaOriginal2, respostaOriginal3, respostaOriginal4;
    Random ra = new Random();
    Scanner sc = new Scanner(System.in);
    public Guybrush(String nom, int vida){
        super(nom, vida);
        do {
            respostaOriginal1 = ra.nextInt(8);
            respostaOriginal2 = ra.nextInt(8);
            respostaOriginal3 = ra.nextInt(8);
            respostaOriginal4 = ra.nextInt(8);
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
    public void defensar() {// para imprimir las opciones y devolver el resultado

        System.out.println("1 " + respostes[0]);
        System.out.println("2 " + respostes[1]);
        System.out.println("3 " + respostes[2]);
        System.out.println("4 " + respostes[3]);
        System.out.println();
        this.resposta = sc.nextInt();// pedimos la respuesta
        //return opcionsResposta[resposta - 1];// pasamos el valor correspondiente del array
    }
    @Override
    public boolean vida() {// para restar vida al heroe y comprobar si sigue vivo
        this.vida-=2;
        if (vida > 0) {
            this.hViu = true;
        } else {
            this.hViu = false;
        }
        return hViu;
    }
}
