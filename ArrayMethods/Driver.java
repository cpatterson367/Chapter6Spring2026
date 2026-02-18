
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class Driver
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        
        
        System.out.println("Enter player 1 name: ");
        Player p1 = new Player(kb.next());
        System.out.println("Enter player 2 name: ");
        Player p2 = new Player(kb.next());
        int[][] stones = new int[][] {{0,0,0},
        {0,0,0,0,0},{0,0,0,0,0,0,0,0}};
        
        
        Nim game = new Nim(stones);
        
        
        while (!game.complete())
        {
            
            game.play(p1);
        }
        
    }
}
