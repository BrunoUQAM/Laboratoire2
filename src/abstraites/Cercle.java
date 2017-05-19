package abstraites;

/**
 * Created by bruno on 2017-05-19.
 */
public class Cercle extends ElementGraphique {

    private int longueurRayon;

    public Cercle(int x, int y, int longueurRayon) {
        placer(x, y);
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
        return super.toString()
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

    public int getLongueurRayon() {
        return longueurRayon;
    }

    private void setLongueurRayon(int longueurRayon) {
        this.longueurRayon = longueurRayon;
    }
}
