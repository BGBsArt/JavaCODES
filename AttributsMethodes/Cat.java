public class Cat            // La classe Cat
{
    public Cat()            // Ceci est un constructeur, une methode un peu particuliere
    {
        System.out.println(" Chat : " + this);     // La variable 'this' indique l'instance en cours. En l'affichant sur le terminal
    }

    public Cat(String name, int age)
    {
        this.mName = name;      // Pour cette instance courante (l'objet qu'on est entrain de créer), 
        this.mAge = age;        // nous affecttons à l'attribut 'mName' la valeur 'name'

        System.out.println(" Nom : " + this.mName + " ---> Age : " + this.mAge + " ans");
        
    }

    // Creation de methodes appartenant à cette classe, donc non static
    public void attack()
    {
        System.out.println(this.mName + " attaque une souris.");
    }


    // LES ATTRIBUTS

    private String mName;       // Ces deux attributs sont privés, donc uniquement accessibles dans cette classe (Cat)
    private int mAge;
}