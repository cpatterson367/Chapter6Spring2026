
// Cole Patterson

import java.util.Scanner;

public class purseMain
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        
        Purse purse = new Purse();
        purse.add(new Coin('Q'));
        purse.add(new Coin('D'));
        purse.add(new Coin('N'));
        purse.add(new Coin('Q'));
        purse.add(new Coin('P'));
        
        
        System.out.println("Select an option.\nA. Add a coin\nR. Remove a coin\nD. Display purse\nE. Exit");
        String choice = kb.next();
        
        while (!(choice.toLowerCase() == "e"))
        {
            
            
            
            System.out.println("Select an option.\nA. Add a coin\nR. Remove a coin\nD. Display purse\nE. Exit");
            
            if (choice.toLowerCase().equals("a"))
            {
                System.out.println("Enter coin type to add: ");
                purse.add(new Coin(kb.next().charAt(0)));
            }
            
            if (choice.toLowerCase().equals("r"))
            {
                System.out.println("Enter coin type to remove: ");
                purse.remove(kb.next().charAt(0));
            }
            
            System.out.println(choice.toLowerCase());
            if (choice.toLowerCase().equals("d"))
            {
                System.out.println(purse);
            }
            
            
            choice = kb.next();
        }
    }
}
