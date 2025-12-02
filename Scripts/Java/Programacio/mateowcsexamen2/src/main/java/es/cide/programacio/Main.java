//Mateo Wlliam Carter Shakespeare

package es.cide.programacio;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random ra = new Random();//inicialitzam el Random
        Obstacle[] obstaclesDisponibles = new Obstacle[ra.nextInt(5,8)];// Cream l'array d'obstacles
        Pony po = new Pony("McFreaky", 10);// cream el pony
        int c = 0;// inicialitzam un comptador
        Obstacle obstacleElegit;// cream una variable per emmagatzemmar el obstacle actual
        boolean failed = false, passed;// cream un boolea per saber si el pony ha fracasat contra l'obstacle
        do{
            obstaclesDisponibles[c] = new Obstacle();// cream un nou Obstacle a aquesta posició de l'array
            obstacleElegit = obstaclesDisponibles[c];// emmagtzemmam aquest Obstacle dins la variable obstacleElegit 
                System.out.println(obstacleElegit.getTipusObstacle()+" es troba davant de "+ po.getNomPony());// mostram el tipus de obstacle i el nom del pony
                passed = po.superarObstacle(obstacleElegit);// utilitzam el metode superarObstacle
                System.out.println(po.getNomPony()+" encara te "+ po.getEnergiaPony()+ " energia");// mostram l'energia restant del pony
                if (obstacleElegit.getEstatObstacle() == false){// si l'obstacle no ha esta superat
                    failed = true;// el pony ha fracasat
                }
            c++;// incrementam comptador
        }while(c < obstaclesDisponibles.length&& passed == true&& failed == false);// mentre quedin obstacles a l'array, el pony tengui energia i no ha fracasat
        if (failed == false&& po.getEstatPony() == true){// si el poni ha acabat sense fracasar y encara amb energia
            System.out.println("El pony ha superat tots els obstacles, el pots dur a competir!");// mostram missatge de victoria
        }else{// del contrari
            System.out.println("El pony no ha aconseguit superar la prova, només serveix per fer hamburgueses.");// mostram missatge de perdua
        }
    }
}