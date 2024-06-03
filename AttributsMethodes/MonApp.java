class MonApp
{
    public static void main(String[] args)
    {
            splitStars();       // Appel de la methode 'splitStars()''
        Cat c = new Cat();      // Nous avons instancié l'objet 'Cat()', dans la variable 'c'
            splitStars();       
        Cat c2 = new Cat("PIPO", 3);  // Nous avons entré les parametres
        Cat c3 = new Cat("KASSAFAYE", 2);
            splitStars();
        c2.attack();            // Appel de la methode de la classe 'Cat'
            splitStars();
    }

    // LES METHODES
    public static void splitStars()
    {
        System.out.println("*******************************************************");  
        //  Une fonction qui affiche des stars permettant de délimiter les différents affichages au terminal
    }
}