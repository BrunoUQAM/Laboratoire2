package abstraites;

/**
 * Created by bruno on 2017-05-19.
 */
public class Carre  extends ElementGraphique {

    private int longueurCote;

    public Carre(int x, int y, int longueurCote) {
        placer(x,y);
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
        return super.toString()
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

    public int getLongueurCote() {
        return longueurCote;
    }

    private void setLongueurCote(int longueurCote) {
        this.longueurCote = longueurCote;
    }

}
