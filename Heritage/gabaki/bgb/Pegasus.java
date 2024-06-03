package gabaki.bgb;

public class Pegasus
{
    public Pegasus(String name)
    {
        this.mName = name;
        this.mPosX = 50;
        this.mPosY = 50;
        this.mPosZ = 100;
    }

    public void move(int x, int y)
    {
        this.mPosX = x;
        this.mPosY = y;
        System.out.println(" Le Pegase se deplace (X = " + this.mPosX + ", Y = " + ")");
    }

    public void fly(int z)
    

    private String mName;
    private int mPosX;
    private int mPosY;
    private int mPosZ;
}