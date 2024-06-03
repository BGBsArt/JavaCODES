import java.io.BufferedReader;          // Ces deux packages ont été importés dans le soucis d'avoir
import java.io.InputStreamReader;       // acces à BufferedReader (lecture au clavier de chaine caracteres uniquement)

// import java.util.Scanner;               // Et celui-ci pour toutes données

import java.util.StringTokenizer;       // Pour delimiter les chaines

class MonApp
{

/*
    MonApp.java:42: error: unreported exception IOException; must be caught or declared to be thrown
        String food = br.readLine();
    Cette erreur a cause de 'redLine()' nous permet d'ajouter la fonction 'theows Exception' au main, pour jeter cette exception
*/
//--------------------------------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) throws Exception
    {
        int[] tab = {1, 2, 3};          // Declaration de tableau avec des valeurs initialisées
    //  int[][] tab2 = new int[5][3];  // Declaration de tableau avec une reservation en memoire de 5 lines et 3coluns

        // Parcourir le tableau 'tab' avec la boucle for

        splitByStars();
        splitByStars();
        System.out.println(" Tableau parcouru avec 'i' : ");
        for(int i = 0; i < tab.length; i++)
            System.out.println("           " + tab[i]);

        System.out.println("\n Tableau parcouru avec 'elements' : " );
        for(int elements : tab)
            System.out.println("           " + elements);

            System.out.println(" Ce tableau a pour addresse en memoire (avec toString()) : " + tab.toString());
            System.out.println(" Ce tableau a pour addresse en memoire (avec le nom de la variable) :" + tab);
        splitByStars();
//--------------------------------------------------------------------------------------------------------------------------------------------
/*
    String : Immuable, contenu non modifiable
            --> concat(), plus rapide que l'operateur '+'
            --> length(), pour la longueur d'une chaine
            --> toUpperCase(), pour creer une nouvelle instance, mais tout en MAJUSCULE
            --> toLowerCase(), par contre en miniscule
            --> trim(), pour condenser les espaces qui pouvaient y avoir entre une chaine 'name.trim()'
            --> replace(), pour remplacer des caraceres 'name.replace("a", "o")' == 'Goboki'
            --> charAt(<index>), suivi de l'indice pour avoir acces à un caractere d'une chaine
            --> substring(<index>, <nbr>) ==> name.substring(0, 4) ==  'Gaba'
            --> equals(<str>), compareTo(<str>), la reponse est en bolean ou leur place dans la table ASCII
*/
//--------------------------------------------------------------------------------------------------------------------------------------------
        String name = "Gabaki";
        String name2 = "Bgb";

 System.out.println(" Je m'appelle " + name.concat(" ").concat(name2.toUpperCase()) + "\n Et Gabaki comporte " + name.length() + " Caracteres"); 
 // 'concat()' additionne des chaines (name + name2)
        splitByStars();
//--------------------------------------------------------------------------------------------------------------------------------------------
        // DELIMITER LES CHAINES
        String lien = "MonLivre/LHOMME-DANS-SES-NATURES/p26";
        StringTokenizer st = new StringTokenizer(lien, "/", true);  // 'true', pour recuperer aussi les delimiteurs (/)

        System.out.println(" Votre lien 'MonLivre/LHOMME-DANS-SES-NATURES/p26' est délimité : ");
        while(st.hasMoreTokens())
            System.out.println("        " + st.nextToken());
            splitByStars();
//--------------------------------------------------------------------------------------------------------------------------------------------
/*
     A L'OPPOSE DE 'String', ON A : 
     (les deux classes généralement memes fonctions, sont muables)

    - StringBuilder (asymchrone) >>> Monothreadé : 1 seul thread, plus performant
     
    - StringBuffer (symchronisée) >>> Multi-threadé : plusieurs threads, un peu plus lent

        --> length()
        --> capacity()
        --> append(<str>), un peu comme concat() avec 'String'
        --> insert(<index>, <str>), comme charAt()

*/
        StringBuilder sBuilder = new StringBuilder("Mon nom est Balode");

        System.out.println(" Espace disponible en memoire : " + sBuilder.capacity());
        System.out.println(" La longeur de la chaine et l'espace occupé : " + sBuilder.length());
        
        sBuilder.append(" Je serai");
        sBuilder.append(" RICHE");
        System.out.print(" COMBINAISON DE 3 CHAINES : " + sBuilder + "\n");
//--------------------------------------------------------------------------------------------------------------------------------------------
/*

    > BufferedReader (objet), rapide parce que
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
            bufferEatFood();        // Implementation de l'objet 'BufferedReader'
        splitByStars();

/*  VOIR LE DOSSIER 'ScannerTableau.java' POUR L'IMPLEMENTATION DE CETTE PARTIE DE CODE
        Scanner sc = new Scanner(System.in);        // Cet objet prend en argument un flux d'entrée (System.in)

                System.out.println(" Remplissez de caracteres ce tableau : \n");
                
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
*/
    }
//--------------------------------------------------------------------------------------------------------------------------------------------

    // LES METHODES

    public static void splitByStars()
    {
        System.out.println("******************************************************************************************");  
        //  Une fonction qui affiche des stars permettant de délimiter les différents affichages au terminal
    }

/* 
    public static void displayTab(int[][] tab)
    {
        for(int[] i : tab)
            {
                for(int elements : i)
                {System.out.print(" " + elements + " ");}
                 System.out.println();
            }           
    }
*/

    public static void bufferEatFood() throws Exception
    {
        InputStreamReader isr = new InputStreamReader(System.in);    // Cet objet prend en argument un flux d'entrée (System.in)
        BufferedReader br = new BufferedReader(isr);

                System.out.print(" Qu'as-tu mangé ce matin ? : ");
                String food = br.readLine();

                br.close();     
                System.out.println(" COOL, Vous avez mangé " + food);
    }
}