import java.util.Scanner;

public class TableauLecture 
{
    public static void main(String[] args) 
    {
        // Création d'un tableau de 2x5
        int[][] tableau = new int[2][5];

        // Utilisation de Scanner pour lire les entrées de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Boucle pour lire chaque élément du tableau
        for (int i = 0; i < 2; i++) 
        {
            for (int j = 0; j < 5; j++) 
            {
                System.out.print("Entrez un élément pour la ligne " + (i + 1) + " et la colonne " + (j + 1) + ": ");
                tableau[i][j] = scanner.nextInt();
            }
        }

        // Fermeture de l'objet Scanner
        scanner.close();

        // Affichage du tableau
        System.out.println("Tableau entré :");
        afficherTableau(tableau);
    }

    // Méthode pour afficher le tableau
    public static void afficherTableau(int[][] tableau) 
    {
        for (int i = 0; i < 2; i++) 
        {
            for (int j = 0; j < 5; j++) 
            {
                System.out.print(tableau[i][j] + " ");
            }
            System.out.println();
        }
    }
}
