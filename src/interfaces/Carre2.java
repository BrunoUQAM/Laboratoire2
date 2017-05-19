package interfaces;

/**
 * Created by bruno on 2017-05-19.
 */
public class Carre2 implements ElementGraphiqueInter {

    private int x;
    private int y;
    private int longueurCote;

    public Carre2(int x, int y, int longueurCote) {
        setX(x);
        setY(y);
        setLongueurCote(longueurCote);
    }

    @Override
    public double surface() {
        return Math.pow(getLongueurCote(), 2);
    }

    @Override
    public double perimetre () {
        return 4 * getLongueurCote();
    }

    @Override
    public String toString() {
        return "position : ( " + getX() + ", " + getY() + " )"
                + "\n"
                + "Longeur d'un cote : "
                + getLongueurCote()
                + "\n"
                + "Sa surface est : "
                + surface()
                + "\n"
                + "Son périmètre est : "
                + perimetre()
                + "\n----------------\n";
    }

    public int getX() {
        return x;
    }

    private void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    private void setY(int y) {
        this.y = y;
    }

    public int getLongueurCote() {
        return longueurCote;
    }

    private void setLongueurCote(int longueurCote) {
        this.longueurCote = longueurCote;
    }

}