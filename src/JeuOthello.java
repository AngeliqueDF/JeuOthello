public class JeuOthello {
    private Plateau plateau;

    JeuOthello(boolean plateauConfigure) {
        this.plateau = new Plateau(plateauConfigure);
    }

    public static void main(String[] args) {
    }

    private void retournerJeton(String coord) {
        try {
            plateau.retournerJeton(coord);
        } catch (RetournerJetonCaseVideException e) {
            System.out.println(e);
        }
    }
    
    }
}