public class Jeton {
    char face;

    Jeton(char faceInitiale) {
        this.face = faceInitiale;
    }

    void retournerJeton() {
        System.out.println(this.face);
        if (this.face == 'N') {
            this.face = 'B';
        } else if (this.face == 'B') {
            this.face = 'N';
        }
    }

    @Override
    public String toString() {
        return "" + this.face;
    }
}
