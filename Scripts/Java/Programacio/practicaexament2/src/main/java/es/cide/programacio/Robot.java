package es.cide.programacio;

public class Robot {
    //atributs
    private String nom;
    private int energia;
    private int força;
    private boolean teEnergia;

//constructor
public Robot(String nom, int energia, int força){
    this.nom = nom;
    this.energia = energia;
    this.força = força;
}
//getters
public int getRobotEnergia(){
    return energia;
}
public String getRobotNom(){
    return nom;
}
public int getRobotForça(){
    return força;
}
//setters
public void setRobotEnergia(int energia){
    this.energia = energia;
}
public void setRobotNom(String nom){
    this.nom = nom;
}
public void setRobotForça(int força){
    this.força = força;
}

//metodes
public boolean superarObstacle(Obstacle o){
    energia -= o.getDificultat() * 2;//redueix l'energia per la dificultat del obstacle*2
    if(energia > 0){// si energia es mayor a 0
        teEnergia = true;// el booleà es true
    }else{// del contrari
        teEnergia = false;//el cooleà es false
    }
    return teEnergia;// retornam el booleà
}








}
