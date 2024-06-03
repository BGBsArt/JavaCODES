import java.util.*;       // Au lieu de 'import java.util.Scanner;', 'java.util.InputMismatchException'

public class MonApp
{
    public static void main(String[] args) // throws Exception 
    {                                               // 'throws Exception' est la methode d'exception standard qu'on ajoute au main() pour notifier 
        Scanner sc = new Scanner(System.in);      // que ben dans le code, il pourrait y avoir un petit défaut, donc de lever cette exception.
        
        // Ici, l'exception sera spécifique 
        try
        {
            displayStars();

            System.out.print(" Année de naissance : "); //
            int birth = sc.nextInt();
            System.out.println(" Vous etes né en l'an " + birth);
        } // Si tout se passe correctement, ignore les 'catch()', mais lorsqu'il y aura une exception, saute directement vers le 'catch()' correspondant.
        catch(InputMismatchException e)
        {
            displayStars();
            System.out.println(" La date denaissance est incorrecte."); // Grace à cette ligne, le programme n'affichera plus des erreurs d'exception 

            // Quelques methodes
            displayStars();
            e.printStackTrace(); // Affiche l'historique d'erreur pour mieux comprendre l'exception

            displayStars();
            System.out.println(" ERREUR : " + e.getMessage());       // Renvoie un message d'erreur (souvent 'null')

            displayStars();
        }
/*
        catch(IOException e)
        {
            // Un autre cas précis
        }
        catch(Exception e)
        {
            // Cas général
        }
*/      finally
        {
            // Un bloc 'finally' qui affichera un message s'il y a une exception ou pas
            System.out.println(" Bien terminer !");

            displayStars();
        }

    }

    public static void displayStars()
    {
        System.out.println("******************************************************************");
    }
    
}