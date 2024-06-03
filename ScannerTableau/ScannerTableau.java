import java.util.Scanner;       // Package importé pour la lecture des données

class ScannerTableau
{
    public static void main(String[] args)
    {
//--------------------------------------------------------------------------------------------------------------------------------------------
/*

    > BufferedReader (objet), rapide parce que (VOIR L'IMPLEMENTATION DE CETTE NOTION DANS LE DOSSIER 'LectureClavierTableauChaine')
            --> synchrone
            --> thread-safe
            --> lecture de chaine de caracteres

        -- readLine()


    > Scanner (objet), plus lent parce que :
            --> asynchrone
            --> not thread-safe
            --> lecture de données + parsing (couteux)

        ** Type de données à lire

        - nextLine() (standard)
        - nextChar()
        - nextByte()
        - nextInt()
        - nextDouble()
        - nextFloat()
        - nextBolean()  ...
*/
//--------------------------------------------------------------------------------------------------------------------------------------------

        splitByStars();

        int[][] tab2 = new int[5][3];  // Declaration de tableau avec une reservation en memoire de 5 lines et 3coluns

        Scanner sc = new Scanner(System.in);        // Cet objet prend en argument un flux d'entrée (System.in)
        
                System.out.println(" Remplissez de chiffres ce tableau : \n");
                
                for(int i = 0; i < 5; i++)
                {
                    for(int j = 0; j < 3; j++)
                    {
                        System.out.print(" Saisir l'élément de la " + (i + 1) + "e ligne et celle de la " + (j + 1) + "e colonne : ");
                        tab2[i][j] = sc.nextInt();
                    }
                }
                sc.close();     // Fermeture de l'objet utilisé

                System.out.println(" VOICI VOTRE TABLEAU : ");
                displayTab(tab2);
                splitByStars();

    }

    // LES METHODES

    public static void splitByStars()
    {
        System.out.println("******************************************************************************************");  
        //  Une fonction qui affiche des stars permettant de délimiter les différents affichages au terminal
    }

    public static void displayTab(int[][] tab)
    {
        for(int[] i : tab)
            {
                for(int elements : i)
                {System.out.print(" " + elements + " ");}
                 System.out.println();
            }
           
    }
}