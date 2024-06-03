import java.util.Scanner;

public class FriendsNumbers
{
    // 3. Appeler dans la fonction principale, la fonction sontAmis avec deux nombres entiers positifs pour savoir si ces deux nombres 
    // entiers sont amis.
    public static void main(String[] args)
    {
        int x, y;    // le plus petit couple de nombres amis connu est 220 et 284.
        Scanner sc = new Scanner(System.in);
        
        do
        {
            System.out.print(" Saisir l'entier x : ");
            x = sc.nextInt();

            System.out.print(" Saisir l'entier y : ");
            y = sc.nextInt();

            if(x <= 0 || y <= 0 || x == y)
                System.out.println("\n ATTENTION ! Deux entiers différents et strictement positifs peuvent etre amis. Réessayez svp !");
            else if(x > 0 && y > 0)
                {
                    if(sontAmis(x,y))
                        System.out.println(" " + x + " et " + y + " sont amis.");
                    else
                        System.out.println(" " + x + " et " + y + " ne sont pas amis.");
                }
        } while (x <= 0 || y <= 0 || x == y);  // Verifie juste l'égibilité des nombres entrés
    }

    // 1. Ecrire une fonction public static int sommeDiviseursStricts(int n), elle doit renvoyer la somme des diviseurs stricts de n.
    public static int sommeDiviseursStricts(int n)
    {
        int sumStrictsDivisors = 0;

        for(int i = 1; i < n; i++)
            {
                if(n % i == 0)
                sumStrictsDivisors += i;
            }
        return sumStrictsDivisors;
    }

    // 2. Ecrire une fonction public static boolean sontAmis(int a, int b), elle doit renvoyer true si a et b sont amis, false sinon.
    public static boolean sontAmis(int a, int b)
    {
        if(sommeDiviseursStricts(a) == b && sommeDiviseursStricts(b) == a)
            return true;
        else
            return false;
    }
}