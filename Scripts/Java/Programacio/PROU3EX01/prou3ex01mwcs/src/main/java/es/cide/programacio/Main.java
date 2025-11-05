package es.cide.programacio;

public class Main {
    public static void main(String[] args) {
        Heroi Guybrush = new Heroi();
        Illa carib = new Illa();
        int illaLongitud = carib.getLongitudIlla();
        boolean playerIsAlive = Guybrush.getestatheroi();
        while (playerIsAlive){
            for (int i = 0; i< illaLongitud; i++){
            carib.vullUnPirata(i);
            




        }
        }
        
    }
}