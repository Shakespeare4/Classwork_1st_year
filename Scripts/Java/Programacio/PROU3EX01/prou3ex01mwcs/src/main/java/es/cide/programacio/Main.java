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
            if (pirateIsAlive == false) {
                System.out.println("El pirata cae a tus piers");
                pirateIsAlive = true;
            } else if (playerIsAlive == false) {
                System.out.println("Guybrush cae y su alma se reúne con el resto de sueños rotos");
            }
            while (playerIsAlive && pirateIsAlive) {

                String roundInsult = roundPirate.insultar();
                int roundInsultIndex = roundPirate.getInsultIndex();
                Guybrush.setIndexInsult(roundInsultIndex);
                System.out.println(roundInsult);
                String roundComeback = Guybrush.defensar();
                System.out.println(roundComeback);
                boolean isCorrect = roundPirate.replica(roundComeback);
                if (isCorrect) {
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