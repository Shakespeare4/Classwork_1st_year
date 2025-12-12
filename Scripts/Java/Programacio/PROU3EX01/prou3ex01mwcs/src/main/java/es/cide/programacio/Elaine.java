package es.cide.programacio;
import java.util.Random;
import java.util.Scanner;
public class Elaine extends Heroi {
    Random ra = new Random();
    Scanner sc = new Scanner(System.in);
    
    public Elaine(String nom, int vida){
        super(nom, vida);
        this.nom = nom;
        this.vida = vida;
    }



    public void sayHello(){
        System.out.println("Me llamo ELaine Marlen, gobernante de la isla Melee.");
    }
    
    public void sayGoodBye(){
        System.out.println("Au revoir, hasta que nuestros caminos se vuelvan a cruzar.");

    }
    public void insultar(){

    }
    public void defensar() {// para imprimir las opciones y devolver el resultado

        System.out.println("1 " + opcionsResposta[0]);
        System.out.println("2 " + opcionsResposta[1]);
        System.out.println("3 " + opcionsResposta[2]);
        System.out.println("4 " + opcionsResposta[3]);
        System.out.println("5 " + opcionsResposta[4]);
        System.out.println("6 " + opcionsResposta[5]);
        System.out.println("7 " + opcionsResposta[6]);
        System.out.println("8 " + opcionsResposta[7]);
        System.out.println("9 " + opcionsResposta[8]);
        System.out.println();
        this.resposta = sc.nextInt();// pedimos la respuesta
        this.respostaString = opcionsResposta[this.resposta-1];
        // pasamos el valor correspondiente del array
    }

    public boolean vida() {// para restar vida al heroe y comprobar si sigue vivo
        this.vida--;
        if (vida > 0) {
            this.hViu = true;
        } else {
            this.hViu = false;
        }
        return hViu;
    }
}
