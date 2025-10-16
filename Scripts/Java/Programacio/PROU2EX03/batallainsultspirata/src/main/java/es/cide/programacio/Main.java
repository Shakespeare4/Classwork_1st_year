package es.cide.programacio;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();
        String insults[] = new String[3];
        insults[0] = "Eres tan repulsivo como un mono en lencería";
        insults[1] = "Insulto 2";
        insults[2] = "Insulto 3";
        String comeback[] = new String[3];
        comeback[0] = "No sabía que me parecía tanto a tu amada";
        comeback[1] = "Respuesta 2";
        comeback[2] = "Respuesta 3";
        int option1;
        int option2;
        int option3;
        int r = 0;
        String used[] = new String[3];
        int battleinsult;
        int  answer;
        System.out.println("Prepara tu espada y tu lengua grumete, ¡Empieza la batalla de insultos pirata!");
        while (r<3){
            battleinsult = ra.nextInt(insults.length);
            option1 = ra.nextInt(comeback.length);
            option2 = ra.nextInt(comeback.length);
            option3 = ra.nextInt(comeback.length);
            
                System.out.println(insults[battleinsult]);
                System.out.println(comeback[option1]);
                System.out.println(comeback[option2]);
                System.out.println(comeback[option3]);
                answer = sc.nextInt();
            switch (battleinsult) {
                case insults.length[0]:
                    if (answer == comeback.length[0]){
                        System.out.println("¡ARGH, parece que esta ronda es tuya!");
                    }else {
                        System.out.println("¿Acaso te enseñó a hablar una sanguijuela? ¡Esta es mía!");
                    }
                    break;
                case insults.length[1]{
                    if (answer == comeback.length[1]){
                        System.out.println("¡ARGH, parece que esta ronda es tuya!");
                    }else {
                        System.out.println("¿Acaso te enseñó a hablar una sanguijuela? ¡Esta es mía!");
                    }break;}
                case insults.length[2]{
                    if (answer == comeback[2]){
                        System.out.println("¡ARGH, parece que esta ronda es tuya!");
                    }else {
                        System.out.println("¿Acaso te enseñó a hablar una sanguijuela? ¡Esta es mía!");
                    }
                    }
                }
                
                    }
                }
        }
        

