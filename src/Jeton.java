public class Jeton {
    char face;

    Jeton(char faceInitiale) {
        this.face = faceInitiale;
    }

    @Override
    public String toString() {
        return "" + this.face;
    }
}
