// Ecrire un programme affichant les valeurs n, n - 1,n-2, : : :, 1, 0, n étant un nombre entier.

import java.util.Scanner;

public class Countdown
{
    public static void main(String[] args)
    {
        int number = 1;

        Scanner sc = new Scanner(System.in);

        do
        {
            System.out.print(" SAISIR UN NOMBRE POUR LE COMPTE A REBOURS : ");
            number = sc.nextInt();

            if(number > 0)  // Affiche le compte à rebours lorsque 'number' est positif
            {
                System.out.println(" VOICI LE COMPTE A REBOURS : ");

                for(int i = -number; i <= number; i++)
                {
                    System.out.println("       " + number-- + " ");
                } break;    // Arret du programme apres affichage, cela évite la répetition à cause de 'for'
            }
            else
            {
                System.out.println("\n ENTREZ UN NOMBRE STRICTEMENT POSITIF SVP !");
            }

        } while (number <= 0);  // Réexecute le programme tant que 'number' saisi est inférieur ou égale à '0'
    }
}