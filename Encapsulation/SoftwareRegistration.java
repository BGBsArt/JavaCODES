public class SoftwareRegistration
{
    /*
        ACCESSEURS
            --> getters : acces à un attribut (lecture)
            --> setters : modification d'un attribut
    */

   
 /*
    public SoftwareRegistration(int expiration)
    {
        this.mExpirationYear = expiration;
        System.out.println(" Enregistrement du produit valide jusqu'en " + this.mExpirationYear);
    }
*/

    public SoftwareRegistration(int expiration)
    {
        if(mNumberOfRegistration > 0)
        {
            this.mExpirationYear = expiration;
            mNumberOfRegistration--;

            System.out.println(" Le logiciel est valide (Expiration : " + this.mExpirationYear + ")");
            System.out.println(" Enregistrements restants : " + this.mNumberOfRegistration);
        }
        else
        {
            System.out.println(" Maximum de validation atteint !");
        }
    }

 // IMPLEMETATION DES ACCESSEURS

        public int getExpirationYear()        // lecture d'un attribut
        {
            return this.mExpirationYear;
        }

        public void setExpirationYear(int expiration)        // modification d'un attribut
        {
            this.mExpirationYear = expiration;
        }

        public static int getNumberOfRegist()       // public : accessible en dehors de cette classe, à l'extérieur
        {                                           //  static : pour ne pas avoir à creer d'instance dans le main()
            return mNumberOfRegistration;
        }

    private static int mNumberOfRegistration = 3;
    private int mExpirationYear;
}