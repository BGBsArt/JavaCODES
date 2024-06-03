// Ecrire un programme en langage Java qui dit si un nombre entier positif non nul est premier ou non.

import java.util.Scanner;

public class FirstNumber
{
    public static void main(String[] args)
    {
        int number = 0;     // 2; 3; 5; 7; 11; 13; 17; 19 sont des nombres premiers.

        Scanner sc = new Scanner(System.in);
        
        do
        {
            System.out.print(" Saisir un entier : ");
            number = sc.nextInt();

            if(number <= 1)
                System.out.println("\n ERREUR ! Tous les entiers inférieurs à 1 ne sont pas des nombres premiers. REESSAYEZ SVP !");
            else if(noDivisors(number))
                System.out.println(" " + number + " est un nombre premier.");
            else
                System.out.println(" " + number + " n'est pas un nombre premier.");

        } while (number <= 1);  // Verifie juste l'égibilité du nombre entré
    }

    public static boolean noDivisors(int num)
    {
        for(int i = 2; i <= Math.sqrt(num); i++)     // Recherche les divisors potentiels autre que 1 et le nombre lui-meme
        {
            if(num % i == 0)
                return false;    // Pas un nombre premier
        }

        return true; // Pas d'autres diviseurs, alors le nombre est premier
    }
}