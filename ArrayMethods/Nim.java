
/**
 * Write a description of class Nim here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Nim
{       
    int[][] stones;
    Scanner kb = new Scanner(System.in);
    
    public Nim(int[][] stones)
    {
        this.stones = stones;
        
    }
    
    public void play(Player guy)
    {
        System.out.println("------------- "+guy.getName()+"'s turn -------------");
        display();
        System.out.println("Select a pile to take from");
        
        boolean flag = true;
        for (int i = 0; i<stones.length; i++)
        {   
            for ( int j = 0; j<stones[i].length; j++)
            {
                if (stones[i][j] == 0)
                    flag = false;
            }
            
            if (flag == false)
                {
                if (i == 0)
                    System.out.println("1. Top");
                    
                if (i == 1)
                    System.out.println("2. Middle");
                    
                if (i == 2)
                    System.out.println("3. Bottom");
                }
            flag = false;

            
        }
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
            for ( int j = 0; j<stones[i].length; j++)
                if (stones[i][j] == 0)
                    flag = false;     
        return flag;
    }
}
