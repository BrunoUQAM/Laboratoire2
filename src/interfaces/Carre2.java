package interfaces;

import utilities.Utilities;

/**
 * Implémentation de l'interface {@link ElementGraphiqueInter}
 *
 * Created by bruno on 2017-05-19.
 */
public class Carre2 implements ElementGraphiqueInter {

    // Variables de classes

    private int x;
    private int y;
    private int longueurCote;

    // Constructeur

    /**
     * Constructeur à trois paramètre
     * @param x sa position x
     * @param y sa position y
     * @param longueurCote la longueur d'un côté
     */
    public Carre2(int x, int y, int longueurCote) {
        setX(x);
        setY(y);
        setLongueurCote(longueurCote);
    }

    // Méthodes

    /**
     * Calcul la surface du carré
     * @return sa surface
     */
    @Override
    public double surface() {
        return Math.pow(getLongueurCote(), 2);
    }

    /**
     * Calcul le périmètre du carré
     * @return son périmètre
     */
    @Override
    public double perimetre () {
        return 4 * getLongueurCote();
    }

    @Override
    public String toString() {
        return "position : ( " + getX() + ", " + getY() + " )"
                + Utilities.LINE_SKIP
                + "Longeur d'un cote : "
                + getLongueurCote()
                + Utilities.LINE_SKIP
                + "Sa surface est : "
                + surface()
                + Utilities.LINE_SKIP
                + "Son périmètre est : "
                + perimetre()
                + Utilities.LINE_SKIP
                + "-------------------------"
                + Utilities.LINE_SKIP;
    }

    // Getters et Setters

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

    private int getLongueurCote() {
        return longueurCote;
    }

    private void setLongueurCote(int longueurCote) {
        this.longueurCote = longueurCote;
    }

}