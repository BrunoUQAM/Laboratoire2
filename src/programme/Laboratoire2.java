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
     * @param args
     */
    public static void main(String [] args){

        // ---------------------------------------------------------------------------
        // Section no.1 - Classe abstraites
        // ---------------------------------------------------------------------------

        ElementGraphique carre = new Carre(5,5, 10);
        ElementGraphique cercle = new Cercle(1, 2, 3);

        ElementGraphique [] elementGraphiques = new ElementGraphique[3];
        elementGraphiques[0] = carre;
        elementGraphiques[1] = cercle;

        System.out.println("Affichage des classes abstraites : \n");
        System.out.print(affichageClassesAbraites(elementGraphiques));

        // ---------------------------------------------------------------------------
        // Section no.2 - Interfaces
        // ---------------------------------------------------------------------------

        ElementGraphiqueInter carre2 = new Carre2(5,5,10);
        ElementGraphiqueInter cercle2 = new Cercle2(1,2,3);

        ElementGraphiqueInter [] elementGraphiqueInters = new ElementGraphiqueInter[3];
        elementGraphiqueInters[0] = carre2;
        elementGraphiqueInters[1] = cercle2;

        System.out.println("\nAffichage des classes implémentant les interfaces : \n");
        System.out.print(affichageClassesInterface(elementGraphiqueInters));

    }

    /**
     *
     * Affichage des classes abstraites
     *
     * @param elementGraphiques Un tableau contenant les classes abstraites
     * @return Une chaîne de caractères avec le contenu dans chaque élément graphique
     */
    private static String affichageClassesAbraites(ElementGraphique [] elementGraphiques) {
        String affichage = "";

        for (ElementGraphique element: elementGraphiques) {
            if (element != null) {
                affichage += element.toString();
            }
        }

        return  affichage;
    }

    /**
     *
     * Affichage des classes abstraites
     *
     * @param elementGraphiques Un tableau contenant les classes implémentant l'interfce {@link ElementGraphiqueInter}
     * @return Une chaîne de caractères avec le contenu dans chaque élément graphique
     */
    private static String affichageClassesInterface(ElementGraphiqueInter [] elementGraphiques) {
        String affichage = "";

        for (ElementGraphiqueInter element: elementGraphiques) {
            if (element != null) {
                affichage += element.toString();
            }
        }

        return  affichage;
    }

}
