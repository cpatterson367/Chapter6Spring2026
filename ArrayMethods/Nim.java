
/**
 * Write a description of class Nim here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Nim
{
    int[] stones = new int[16];
    public static void main(String[] args)
    {
        
        
    }
    
    public void display()
    {
        for (int i = 0; i<stones.length; i++)
        {
            if (stones[i] == 0)
                System.out.print(0);
            
            if (i == 2 || i == 7 || i == 15)
                System.out.println();
            
        }
    }
}
