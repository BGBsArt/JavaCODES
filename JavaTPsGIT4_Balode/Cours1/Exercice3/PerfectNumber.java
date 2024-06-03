// Ecrire un programme en langage Java qui dit si un nombre n est un nombre parfait, ou non.

import java.util.Scanner;

public class PerfectNumber
{
    public static void main(String[] args)
    {
        int number = 5;    // 6; 28; 496 sont des nombres parfaits entre 0 et 1000.
        Scanner sc = new Scanner(System.in);
        
        do
        {
            System.out.print(" Saisir un entier : ");
            number = sc.nextInt();

            if(number <= 0)
             System.out.println("\n ERREUR ! Un entier négatif ou nul ne peut etre un nombre parfait.");
        } while (number <= 0);  // Verifie juste l'égibilité du nombre entré

        if(number == sumDivisor(number))
            {
                System.out.println(" OUAIS, " + number + " est un nombre parfait");
            }
        else
            {
                System.out.println(" NON, " + number + " n'est pas un nombre parfait");
            }
        
    }

    public static int sumDivisor(int num)   // Une methode 'sumDivisor()' qui recherche les diviseurs potentiels du nombre en entrée.
    {                                       // Le pointeur fait la recherche sans inclure l'entier meme. On pouvait meme s'arreter à la moitié
         int sumD = 0;                      // de 'num' (num/2 inclu). La fonction retoune la somme des diviseurs stricts.

        for(int i = 1; i < num; i++)
            {
                if(num % i == 0)
                     sumD += i;
            }
        return sumD;
    }
}