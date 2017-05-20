# Laboratoire2

### Laboratoire - Classes abstraites et interfaces

###### 1. Considérez la classe abstraite ElementGraphique fournie.
  
    * Dérivez de cette classe une classe concrète Carre. L'attribut supplémentaire de la classe sera la longueur
      du côté du carré (int). Vous devrez définir un constructeur avec trois paramètres (la longueur du côté
      ainsi que les deux coordonnées de la position du centre du carré). Vous devrez redéfinir la méthode
      toString() et implanter les méthodes abstraites de la classe ElementGraphique. Le périmètre
      d'un carré est quatre fois la longueur de son côté et la surface du carré est la longueur du côté au carré.
  
    * Dérivez de cette classe une classe concrète Cercle. L'attribut supplémentaire de la classe sera la
      longueur du rayon du cercle (int). Vous devrez définir un constructeur avec trois paramètres (la longueur
      du rayon ainsi que les deux coordonnées de la position du centre du cercle). Vous devrez redéfinir la
      méthode toString() et implanter les méthodes abstraites de la classe ElementGraphique. Le
      périmètre (circonférence) du cercle est égal à 2 * pi * rayon et la surface est égale à pi *
      rayon * rayon. Utilisez la constante PI de la classe Math.

    * Définissez une classe permettant de tester vos deux dérivations en déclarant un tableau de longueur 3
      contenant des objets de type ElementGraphique. Placez-y un cercle de rayon 3 et de position (1, 2),
      un carré de côté 10 et de position (5, 5) et un autre cercle de rayon 12 et de position (0, 0). Ensuite, faites
      afficher le contenu du tableau et faites afficher aussi la surface et le périmètre de chaque
      ElementGraphique du tableau.

###### 2. Considérez l'interface ElementGraphiqueInter fournie.

    * Définissez les classes Carre2 et Cercle2 comme en 1 mais implémentant l'interface
      ElementGraphiqueInter. Aussi, vous devrez avoir trois variables d'instance : la position en x et y ainsi
      que le côté ou le rayon. Puis, refaites les mêmes tests qu'en 1 (c). Vous devez obtenir les mêmes résultats.

Assurez-vous de bien comprendre la distinction entre une classe abstraite et une interface.
