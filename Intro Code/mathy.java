import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;
//import cs1.Keyboard;
//import javax.swing.*;

public class mathy
{
    private int [][] square;
    private Random gen = new Random();
    
    /**
        default constructor - stubed in

    */
    public mathy()
    {
            System.out.println ("hi from default constructor");

    }

    public mathy(int [][] array)
    {
        square = array;

    }
    
    /**
     * Creates and populates an array with random values
     * @param size - the number of random values 
     * @param range - the range of random values from 1 to range (1, range)
     * 
     */
    public int[] popRandomArray ( int size, int range)
    {
        int[] a = new int[size];
        popRandomArray(a,range);
        return a;
        
        
    }
    
    /**
     * Creates and populates an array with random values
     * @param int[] to be populated
     * @param range - the range of random values from 1 to range (1, range)
     * 
     */
    public void popRandomArray ( int[] nums, int range)
    {
        for(int i = 0; i < nums.length; i++)
        {
            nums[i] = gen.nextInt(range) +1;
        }
    }


    /**
        take the absoulute value of the number
        @param int value
        @return absoulute value of number
    */
    public int abs (int x)
    {
        if (x < 0)
            x = -x;

        return x;



    }//end of abs



    /**
    *    takes the odd numbers out of an array
    *    @param int[] values int [] to be populated
    *    @return int[] odd values in the array
    */

    public  void getOdd ( int[] num1, int odd [])
    {
        int j = 0;
        for (int i = 0; i < num1.length; i++)
        {
            if (num1[i] % 2 == 1)
            {
                odd[j] = num1[i];
                j++;
            }
            
        }
        
        



    }//end of getOdd



    /**
    *    takes the even numbers out of an num array
    *    assigns values to evennum array
    *    @param int[] values, int[] evenvalues
    *    @none
    */


    public int [] getEven(int[] num)
    {
        int [] evens = new int[num.length];
        int j = 0;
        for (int i = 0; i < num.length; i++)
        {
            if (num[i] % 2 == 0)
            {
                evens[j] = num[i];
                j++;
            }
            
        }


        return evens;
    }//end of getEven









    /**
            message from Mathy class
            @param none
            @return String message
    */


    public String toString()
    {
        return ("Hi what do you want?, I'm just Mathy");

    }


    public void switchThem (int[] a1, int a2[])
    {
        int [] temp = a1;




    }
    public void count(int[] a1, int[] a2)
    {
        for (int i : a1)
            a2[i] ++;



    }


    public static int sum2DArray(int [][] scores)
    {



        for ( int row=0; row < scores.length; row++)
        {
            for ( int col=0; col < scores[row].length; col++)

                System.out.print (scores[row][col] + "\t");

            System.out.println();
          }


        return 0;

    }



    public int sumOneRow2DArray(int row)
    {    int total = 0;




        return total;

    }
        public int sumOneCol2DArray(int row)
        {    int total = 0;




            return total;

    }

    public int[] sumall2DArray(int [][] scores)
    {
        int [] temp = {1,2,3,4,};




        return temp;
    }

    /**
        Doubles the size of an array
        @param int []
        @return int [] twice the size, with values copied over
    */
   public static int[] doubleSize(int[] array)
   {
       //make temp 2 times the size of array
       int[] temp = new int[array.length * 2];
       System.out.println(temp.length +"-" );

        //copy all the values over to new array
       for (int i = 0; i < array.length; i++)
               temp[i] = array[i];

        //old array changes reference to new larger array
       array = temp;

        return array;

   }




}//end of class
