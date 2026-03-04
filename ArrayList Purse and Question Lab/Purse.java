
import java.util.ArrayList;

public class Purse
{
    //private ArrayList

    ArrayList<Coin> change = new ArrayList<>();
    public Purse (){};
    
    public Purse (Coin acoin)
    {
        change.add(acoin);
    }
    
    /** precondition: Coin will be initialized (value and name) correctly
    *               each variable will have a value
    postcondition: Puts the Coin into the array list change
    */
    public void add (Coin acoin)
    {
        change.add(acoin);
    }
    
    /** Returns the total value of the coins in the array
    *                 list change
    @return ???
    */
    public double getTotal()
    {
        double ttl = 0;
        for (int i = 0; i<change.size(); i++)
            ttl += change.get(i).getValue();
    
        return ttl;
    }
    
    
    public int getNumberofDimes()
    {
        int num = 0;
        for (int i = 0; i<change.size(); i++)
            if (change.get(i).getType() == 'D')
                num++;
                
        return num;
    }
    
    public int getNumberofPenny()
    {
        int num = 0;
        for (int i = 0; i<change.size(); i++)
            if (change.get(i).getType() == 'P')
                num++;
                
        return num;
    }
    
    public int getNumberofNickels()
    {
        int num = 0;
        for (int i = 0; i<change.size(); i++)
            if (change.get(i).getType() == 'N')
                num++;
                
        return num;
    }
    
    public int getNumberofQuarters()
    {
        int num = 0;
        for (int i = 0; i<change.size(); i++)
            if (change.get(i).getType() == 'Q')
                num++;
                
        return num;
    }
    


    
    
    /**
    *  Returns the all objects in the array list as Strings
    */
    
    public String toString()
    {
        return " --";
    }

}
//end of purse
