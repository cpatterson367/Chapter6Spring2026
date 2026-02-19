
// Cole Patterson
// I made this way harder for myself than I needed to

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
        for (int i = 0; i<stones.length; i++)
        {   
            boolean flag = true;
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
        int numStones = kb.nextInt(), count=0;
        
        while (count < numStones)
        {
            for (int i = 0; i<stones[choice].length; i++)
            {
                if (stones[choice][i] == 0)
                {
                    stones[choice][i] = 1;
                    count++;
                }
                if (count == numStones)
                    break;
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
