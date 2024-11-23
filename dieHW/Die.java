import java.util.Random;
public class Die 
{
    private int side;
    private int numSides;

    public Die() 
    {
        numSides = 6;
        roll();
    }
    public Die(int userSides) 
    {
        numSides = userSides;
        roll();
    }
    public Die(int userSides, int userSide)
    {
        numSides = userSides;
        side = userSide;
    }
    public void roll()
    {
        Random rand = new Random();
        side = rand.nextInt(numSides) + 1;
    }
    public int getSide()
    {
        return side;
    }
    public String toString()
    {
        String temp = "";
        temp += numSides + " sided number cube. Currently showing " + side;
        return temp;
    }
}
