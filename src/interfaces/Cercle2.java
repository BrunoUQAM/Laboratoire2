package interfaces;

import utilities.Utilities;

/**
 * Implémentation de l'interface {@link ElementGraphiqueInter}
 *
 * Created by bruno on 2017-05-19.
 */
public class Cercle2 implements ElementGraphiqueInter {

    // Variables de classes

    private int x;
    private int y;
    private int longueurRayon;

    // Constructeur

    /**
     * Constructeur à trois paramètres
     * @param x Position x
     * @param y Position y
     * @param longueurRayon La longueur de son rayon
     */
    public Cercle2(int x, int y, int longueurRayon) {
        setX(x);
        setY(y);
        setLongueurRayon(longueurRayon);
    }

    // Méthodes

    /**
     * Calcule la surface du cercle
     * @return Sa surface
     */
    @Override
    public double surface() {
        return Math.PI * Math.pow(getLongueurRayon(), 2);
    }

    /**
     * Calcul le périmètre du cercle
     * @return Son périmètre
     */
    @Override
    public double perimetre() {
        return 2 * Math.PI * getLongueurRayon();
    }

    @Override
    public String toString() {
        return "position : ( " + getX() + ", " + getY() + " )"
                + Utilities.LINE_SKIP
                + "Longeur d'un cote : "
                + getLongueurRayon()
                + Utilities.LINE_SKIP
                + "Sa surface est : "
                + String.format("%.2f", surface())
                + Utilities.LINE_SKIP
                + "Son périmètre est : "
                + String.format("%.2f", perimetre())
                + Utilities.LINE_SKIP
                + "-------------------------"
                + Utilities.LINE_SKIP;
    }

    // Getter et Setters

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
