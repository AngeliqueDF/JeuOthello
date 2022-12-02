class RetournerJetonCaseVideException extends Exception {
    public RetournerJetonCaseVideException(String message) {
        super(message);
    }
}

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

    void retournerJeton(String coord) throws RetournerJetonCaseVideException {
        int colonne = Character.getNumericValue(coord.charAt(0)) - 10;
        int rangee = Character.getNumericValue(coord.charAt(1)) - 1;
        if (this.cases[rangee][colonne] != null) {
            this.cases[rangee][colonne].retournerJeton();
        } else {
            throw new RetournerJetonCaseVideException("Erreur : cette case ne contient aucun jeton.");
        }
    }

    @Override
    public String toString() {
        String result = "";

        if (this.configInitiale) {
            result += "Ce plateau a été initialisé avec la configuration initiale.\n";
        }

        for (int i = 0; i < this.cases.length; i++) {
            result += Arrays.toString(this.cases[i]) + "\n";

        }
        return result;
    }
}
