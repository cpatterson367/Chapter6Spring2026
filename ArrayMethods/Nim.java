
/**
 * Write a description of class Nim here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Nim
{       
    int[][] stones;
    
    
    public Nim(int[][] stones)
    {
        this.stones = stones;
        
    }
    
    public void play(Player guy)
    {
        System.out.println("------------- "+guy.getName()+"'s turn -------------");
        System.out.println("Select a pile to take from\n1. Top\n2. Middle\n 3. Bottom");
    }
    
    public void display()
    {
        for (int i = 0; i<stones.length; i++)
        {   
            for ( int j = 0; j<stones[i].length; j++)
            {
                if (stones[i][j] == 0)
                    System.out.print(0);
                
                
            }
            System.out.println();
        }
    }
    public boolean complete()
    {
        boolean flag = true;
        for (int i = 0; i<stones.length; i++)
        {   
            for ( int j = 0; j<stones[i].length; j++)
            {
                if (stones[i][j] == 0)
                    System.out.print(0);
                
                
            }
            System.out.println();
        }
        return flag;
    }
}
