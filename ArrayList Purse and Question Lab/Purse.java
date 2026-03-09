
import java.util.ArrayList;
import java.text.NumberFormat;

public class Purse
{
    //private ArrayList
    
    NumberFormat fmt =  NumberFormat.getCurrencyInstance();
    
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
    
    public void remove (char type)
    {   
        int j = -1;
        for (int i = 0; i < change.size(); i++)
        {
            if (change.get(i).getType() == type)
                j = i;
        }
        
        if (j != -1)
            change.remove(j);
        else
            System.out.println("no coin");
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
        String data = "";
        for (int i = 0; i<change.size(); i++)
        {
            data += (i+1) + ". " + change.get(i).getTypeName() + ": " + fmt.format(change.get(i).getValue()) + "\n";
        }
        
        return data;
    }

}
//end of purse
