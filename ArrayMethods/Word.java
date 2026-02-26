
/**
 * Cole Pattersnon, Kaylie Austin
 */



import java.util.Scanner;
import java.io.*;  
import java.util.ArrayList;

public class Word
{
    public static void main(String[] args) throws IOException
    {
        Scanner kb = new Scanner(System.in);
        Scanner scanFile = new Scanner(new File("words.txt"));
        
        ArrayList<String> wordList = new ArrayList<>();
        
        while(scanFile.hasNext())
        {
            String word = scanFile.next();
            boolean flag = false;
            for (int i = 1; i < word.length(); i++)
            {
                if (word.charAt(i) == word.charAt(i-1))
                    flag = true;
            }
            
            
            if (word.length() == 6 && flag == false)
                wordList.add(word);
                
                
        }
        System.out.println(wordList.size()); // = 29880
    }
}
