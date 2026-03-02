
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
        
        String last = "a";
        while(scanFile.hasNext())
        {
            boolean adjDupe = false, flag = false;;
            
            String word = scanFile.next();
            if (word.equals(last))
                 adjDupe = true;
            last = word;
            
            for (int i = 1; i < word.length(); i++)
                if (word.charAt(i) == 'i' || word.charAt(i) == 'a' || word.charAt(i) == 'u')
                    if (word.charAt(i) == word.charAt(i-1))
                        flag = true;
            
            if (word.length() == 6 && flag == false && adjDupe == false)
                wordList.add(word);
        }
        System.out.println(wordList.size()); // = 29880 no removal
    }
}
