class MonApp
{
    public static void main(String[] args)
    {
        splitByStars();
        System.out.println(" ENREGISTREMENTS : " + SoftwareRegistration.getNumberOfRegist());
        SoftwareRegistration sr = new SoftwareRegistration(2021);
        splitByStars();

        sr.setExpirationYear(2030); // Modifie la valeur de notre attribut
        System.out.println(" (ATTRIBUT MODIFIE)\n Enregistrement du produit valide jusqu'en " + sr.getExpirationYear());   // Retourne la valeur modifiée et affiche la
        splitByStars();    

        System.out.println(" ENREGISTREMENTS : " + SoftwareRegistration.getNumberOfRegist());
        SoftwareRegistration sr1 = new SoftwareRegistration(2022);
         splitByStars();

        System.out.println(" ENREGISTREMENTS : " + SoftwareRegistration.getNumberOfRegist());
        SoftwareRegistration sr2 = new SoftwareRegistration(2023);
         splitByStars();
        
        System.out.println(" ENREGISTREMENTS : " + SoftwareRegistration.getNumberOfRegist());
        SoftwareRegistration sr3 = new SoftwareRegistration(2024);
         splitByStars();
    }

    public static void splitByStars()
    {
        System.out.println("*******************************************************");  
        //  Une fonction qui affiche des stars permettant de délimiter les différents affichages au terminal
    }
}