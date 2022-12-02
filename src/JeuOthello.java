public class JeuOthello {
    private Plateau plateau;

    JeuOthello(boolean plateauConfigure) {
        this.plateau = new Plateau(plateauConfigure);
    }

    public static void main(String[] args) {
        JeuOthello jeu = new JeuOthello(true);
        jeu.placerJeton("d6", 'B');
        jeu.retournerJeton("d6");
        System.out.println(jeu.plateau);

        jeu.retournerJeton("d8");
        jeu.placerJeton("e4", 'B');

    }

    private void retournerJeton(String coord) {
        try {
            plateau.retournerJeton(coord);
        } catch (RetournerJetonCaseVideException e) {
            System.out.println(e);
        }
    }
    
    private void placerJeton(String coord, char faceInitiale) {
        try {
            plateau.placerJeton(coord, faceInitiale);
        } catch (PlacerJetonCaseNonLibreException e) {
            System.out.println(e);
        }

    }
}