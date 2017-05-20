package abstraites;

import utilities.Utilities;

/**
 * Classe qui dérive la classe abstraite {@link ElementGraphique}
 *
 * Created by bruno on 2017-05-19.
 */
public class Cercle extends ElementGraphique {

    // Variable de classe
    private int longueurRayon;

    // Constructueur

    /**
     * Constructeur à trois paramètres
     * @param x Position x
     * @param y Position y
     * @param longueurRayon La longueur de son rayon
     */
    public Cercle(int x, int y, int longueurRayon) {
        placer(x, y);
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
        return super.toString()
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
}
