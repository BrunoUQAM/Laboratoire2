package programme;

import abstraites.Carre;
import abstraites.Cercle;
import abstraites.ElementGraphique;
import interfaces.Carre2;
import interfaces.Cercle2;
import interfaces.ElementGraphiqueInter;

/**
 * Laboratoire no. 2
 *
 * Classes abstraites et interfaces
 *
 * Created by bruno on 2017-05-19.
 */
public class Laboratoire2 {

    /**
     *
     * Classe utilisée pour créer les éléments graphique et les affichés
     *
     * @param args arguments d'initialisation
     */
    public static void main(String [] args){

        /* ---------------------------------------------------------------------------
        // Section no.1 - Classe abstraites
        // -------------------------------------------------------------------------
        */

        ElementGraphique carre = new Carre(5,5, 10);
        ElementGraphique cercle = new Cercle(1, 2, 3);

        ElementGraphique [] elementGraphiques = new ElementGraphique[3];
        elementGraphiques[0] = carre;
        elementGraphiques[1] = cercle;

        printThisString("Affichage des classes abstraites : \n" + affichageClassesAbraites(elementGraphiques));

        /* ---------------------------------------------------------------------------
        // Section no.2 - Interfaces
        // ---------------------------------------------------------------------------
        */

        ElementGraphiqueInter carre2 = new Carre2(5,5,10);
        ElementGraphiqueInter cercle2 = new Cercle2(1,2,3);

        ElementGraphiqueInter [] elementGraphiqueInters = new ElementGraphiqueInter[3];
        elementGraphiqueInters[0] = carre2;
        elementGraphiqueInters[1] = cercle2;

        printThisString("\nAffichage des classes implémentant les interfaces : \n" + affichageClassesInterface(elementGraphiqueInters));

    }

    /**
     *
     * Affichage des classes abstraites
     *
     * @param elementGraphiques Un tableau contenant les classes abstraites
     * @return Une chaîne de caractères avec le contenu dans chaque élément graphique
     */
    private static String affichageClassesAbraites(ElementGraphique [] elementGraphiques) {
        StringBuilder affichage = new StringBuilder();

        for (ElementGraphique element: elementGraphiques) {
            if (element != null) {
                affichage.append(element);
            }
        }

        return affichage.toString();
    }

    /**
     *
     * Affichage des classes abstraites
     *
     * @param elementGraphiques Un tableau contenant les classes implémentant l'interfce {@link ElementGraphiqueInter}
     * @return Une chaîne de caractères avec le contenu dans chaque élément graphique
     */
    private static String affichageClassesInterface(ElementGraphiqueInter [] elementGraphiques) {
        StringBuilder affichage = new StringBuilder();

        for (ElementGraphiqueInter element: elementGraphiques) {
            if (element != null) {
                affichage.append(element);
            }
        }

        return affichage.toString();
    }

    /**
     * Affichage du message envoyé
     *
     * @param message Le message qui doit être affiché
     */
    private static void printThisString(String message) {
        System.out.println(message);
    }

}
