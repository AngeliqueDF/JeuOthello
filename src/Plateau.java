public class Plateau {
    boolean configInitiale;
    private Jeton[][] cases = new Jeton[8][8];

    Plateau(boolean configInitiale) {
        if (configInitiale) {
            this.configInitiale = true;
            // deux noirs, en e4 et d5, et deux blancs, en d4 et e5. Chaque joueur, noir et blanc, pose l'un après l'autre un pion de sa couleur sur
            this.cases[4][3] = new Jeton('N');
            this.cases[3][4] = new Jeton('N');

            this.cases[3][3] = new Jeton('B');
            this.cases[4][4] = new Jeton('B');
        }
    }

}
