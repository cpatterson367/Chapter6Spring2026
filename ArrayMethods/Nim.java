
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
        System.out.println("\n\n------------- "+guy.getName()+"'s turn -------------");
        display();
        System.out.println("Select a pile to take from");
        
        int stonesTaken = 0;
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
        int choice = kb.nextInt()-1;
        System.out.println("Enter number of stones to take: ");
        int numStones = kb.nextInt(), count = 1;
        
        for (int i = 0; i<stones[choice].length; i++)
        {
            while (count <= numStones)
                if (stones[choice][i] == 0)
                {
                    stones[choice][i] = 1;
                    count++;
                }
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
