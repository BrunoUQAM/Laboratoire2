package interfaces;

/**
 * Created by bruno on 2017-05-19.
 */
public class Cercle2 implements ElementGraphiqueInter {

    private int x;
    private int y;
    private int longueurRayon;

    public Cercle2(int x, int y, int longueurRayon) {
        setX(x);
        setY(y);
        setLongueurRayon(longueurRayon);
    }

    @Override
    public double surface() {
        return Math.PI * Math.pow(getLongueurRayon(), 2);
    }

    @Override
    public double perimetre() {
        return 2 * Math.PI * getLongueurRayon();
    }

    @Override
    public String toString() {
        return "position : ( " + getX() + ", " + getY() + " )"
                + "\n"
                + "Longeur d'un cote : "
                + getLongueurRayon()
                + "\n"
                + "Sa surface est : "
                + surface()
                + "\n"
                + "Son périmètre est : "
                + perimetre()
                + "\n----------------\n";
    }

    private int getLongueurRayon() {
        return longueurRayon;
    }

    private void setLongueurRayon(int longueurRayon) {
        this.longueurRayon = longueurRayon;
    }

    private int getX() {
        return x;
    }

    private void setX(int x) {
        this.x = x;
    }

    private int getY() {
        return y;
    }

    private void setY(int y) {
        this.y = y;
    }
}
