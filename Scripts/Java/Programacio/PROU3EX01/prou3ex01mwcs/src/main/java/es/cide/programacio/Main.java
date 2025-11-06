package es.cide.programacio;

public class Main {
    public static void main(String[] args) {
        Heroi Guybrush = new Heroi();
        Illa carib = new Illa();
        int illaLongitud = carib.getLongitudIlla();
        boolean playerIsAlive = Guybrush.getestatheroi();
        boolean pirateIsAlive;
        while (playerIsAlive && illaLongitud > 0) {
            Pirata roundPirate = new Pirata();
            roundPirate = carib.vullUnPirata(illaLongitud - 1);
            pirateIsAlive = roundPirate.getestatpirata();
            while (playerIsAlive || pirateIsAlive){
            String roundInsult = roundPirate.insultar();
            int roundInsultIndex = roundPirate.getInsultIndex();
            Guybrush.setIndexInsult(roundInsultIndex);
            System.out.println(roundInsult);
            int roundComeback = Guybrush.defensar();
            if (roundComeback == roundInsultIndex) {
                roundPirate.vida();
            } else {
                Guybrush.vida();
            }
            playerIsAlive = Guybrush.getestatheroi();
            pirateIsAlive = roundPirate.getestatpirata();
            }
            illaLongitud--;

        }

    }
}