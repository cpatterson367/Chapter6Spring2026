
// Cole Patterson

import java.util.Scanner;

public class purseMain
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        System.out.println("Select an option.\nA. Add a coin\nR. Remove a coin\nD. Display purse\nE. Exit");
        String choice = kb.next();
        
        while (!(choice.toLowerCase() == "e"))
        {
            
            
            
            System.out.println("Select an option.\nA. Add a coin\nR. Remove a coin\nD. Display purse\nE. Exit");
        }
    }
}
