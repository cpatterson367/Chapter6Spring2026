
// Cole Patterson

import java.util.Scanner;

public class purseMain
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        
        Purse purse = new Purse();
        purse.add(new Coin("Q"));
        purse.add(new Coin("D"));
        purse.add(new Coin("N"));
        purse.add(new Coin("Q"));
        purse.add(new Coin("P"));
        
        
        System.out.println("Select an option.\nA. Add a coin\nR. Remove a coin\nD. Display purse\nE. Exit");
        String choice = kb.next();
        
        while (!(choice.toLowerCase().equals("e")))
        {
            
            
            if (choice.toLowerCase().equals("a"))
            {
                System.out.println("Enter coin type to add: ");
                String type = kb.next();
                while (!isValid(type))
                {
                    System.out.println("evil type!!");
                    type = kb.next();
                }
                Coin acoin = new Coin(type);
                purse.add(acoin);
            }
            
            if (choice.toLowerCase().equals("r"))
            {
                System.out.println("Enter coin type to remove: ");
                purse.remove(kb.next().charAt(0));
            }
            
            if (choice.toLowerCase().equals("d"))
            {
                System.out.println(purse);
            }
            
            
            System.out.println("\nSelect an option.\nA. Add a coin\nR. Remove a coin\nD. Display purse\nE. Exit");
            choice = kb.next();
        }
        
        
    }
    
    public static boolean isValid (String type)
    {
        type = type.toUpperCase();
        boolean evil = false;
        String[] valid = new String[] {"Q","S","D","N","P"};
        for (int i = 0; i<valid.length; i++)
            if (valid[i].equals(type))
                evil = true;       
                
        return evil;
    }
    
}


