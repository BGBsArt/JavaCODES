// Ecrire un programme qui affiche la somme des n premiers nombres premiers, n étant fixé dans le programme.

public class FirstsNumbersSum
{
    public static void main(String[] args)
    {
        int n = 4; // 4 premiers nombres premiers (2, 3, 5, 7) valent 17.

        System.out.println(" Somme des " + n + " premiers nombres premiers est : " + theSum(n));
/*
    Nous avons fixé 'n' dans le programme comme demandé dans l'énoncé, ceci pourrait etre modifier au besoin.
        De meme, on peut bien faire une lecture au clavier, où le programme demande à l'utilisateur d'entrer un nombre
        entier obligatoirement supérieur à 1, vu qu'on effectue rien que la somme de deux ou plusieurs nombres.
*/
    }

    public static boolean fistsNumbers(int first)
    {
        if(first <= 1)
            return false;   // Les nombres négatifs jusqu'a 1 ne sont pas premiers

        for(int j = 2; j <= Math.sqrt(first); j++)
        {
            if(first % j == 0)
                {return false;} // Ce n'est pas un nombre 95555premier
        }
        return true;
    }

    public static int theSum(int num)
    {
        int isSum = 0;
        int nb = 2; // Premier nombre premier
        int i = 0;

        while(i < num)
        {
            if(fistsNumbers(nb))     // Si 'nb' est un nombre premier
            {
                isSum += nb;         // alors, on l'ajoute à 'isSum' qui au départ était nul
                i++;
            }
            nb++;                    // puis ainsi de suite tant que le compteur 'i' serait inférieur à 'n' fixé dans le main().
        }
        return isSum;
    }
}