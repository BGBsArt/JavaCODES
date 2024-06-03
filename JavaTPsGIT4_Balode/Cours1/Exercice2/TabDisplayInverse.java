// Créer un tableau de 20 entiers, y placer les nombres de 1 à 20, inverser l'ordre des éléments et les afficher.

public class TabDisplayInverse
{
    public static void main(String[] args) throws Exception
    {
        int[] tab = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        System.out.println(" Voici le Tableau original : ");
        for(int elements : tab)
        {
            System.out.println("        " + elements);
        }

        System.out.println("\n Puis son Inverse : ");
        for(int i = tab.length - 1; i >= 0; i--)    // Nous affichons à travers le compteur 'i' l'inverse du tableau en soustrayant
        {                                           // une fois la longueur du tableau pour chaque itération jusqu'à 0 (i>=0)
            System.out.println("        " + tab[i]);
        }
    }
}