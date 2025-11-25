package es.cide.programacio;

public class Main {
    public static void main(String[] args) {
        Obstacle[] obstacles = new Obstacle[5];//un array de obstacles
        Obstacle obstacleActual;//una variable per guardar el obstacle actual
        String[] nomObstacle = {//un array per guardar noms de obstacles
            "Pedra",
            "Forat",
            "Mur",
            "Barranc",
            "Rampa"
        };
        Robot ro = new Robot("El Bicho", 50, 6);// es crea un robot
        int c=0;//comptador
        for(int i=0; i<obstacles.length;i++){//plenam cada posició de l'array amb un nou obstacle
            obstacles[i] = new Obstacle(nomObstacle[i]);// guarda un nou obstacle en la posicio actual de l'array
        }
        while(ro.getRobotEnergia()>0 && c<obstacles.length){//sempre que el robot tengui energia i el comptador sigui menys que la longitut de l'array
            obstacleActual = obstacles[c];// guardam el valor d'aques obstacle en la variable obstacleActual
            System.out.println(obstacleActual.toString());// mostram l'informació
            ro.superarObstacle(obstacleActual);//el robot tracta de superarl'obstacle
            System.out.println("Energia restant: "+ro.getRobotEnergia());// mostram l'energia restant
            c++;//incrementam comptador
        }
        if(ro.getRobotEnergia()>0){// si el robot té més de 0 energia quan acaba 
            System.out.println(ro.getRobotNom()+" ha superat tots els obstacles!");//mostram missatge de victoria
        }else{//del contrari
            System.out.println(ro.getRobotNom()+" no ha lograt superar la prova");//mostram missatge de perdua
        }
    }
}