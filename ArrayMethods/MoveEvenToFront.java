import java.util.Random;

public class MoveEvenToFront
{
    public void moveEvenToFront(int[] arr)
    {
        int [] even = new int[10];
        int [] notEven = new int[10];
        
        int j=0,k=0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] % 2 == 0)
            {
                even[j] = arr[i];
                j++;
            }
            else
            {
                notEven[k] = arr[i];
                k++;
            }
        }

        j=0;
        for (int i = 0; i < arr.length; i++)
        {
            if (even[i] != 0)
                arr[i] = even[i];
            else
            {
                arr[i] = notEven[j];
                j++;
            }
        }
        
        // Even
          // Save the even number
        
            // Move array element from end of
            // evens to current location
        
    }
    
    public static void main(String[] args)
    {
        int[] randoms = new int[10];
        MoveEvenToFront util = new MoveEvenToFront();
        Random generator = new Random();
        
        // Create a test array containing random numbers.
        for (int i = 0; i < randoms.length; i++)
        {
            randoms[i] = generator.nextInt(100) + 1;
            // Print the values as they are assigned.
            System.out.print(randoms[i] + " ");
        }
        System.out.println();
        
        // Move the evens to the front.
        util.moveEvenToFront(randoms);
        
        // Print again to see new order.
        for (int i = 0; i < randoms.length; i++)
        {
            System.out.print(randoms[i] + " ");
        }
        System.out.println();
    }
}
