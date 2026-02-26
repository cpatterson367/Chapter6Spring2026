/********************************************************************
// These are the notes for ch 6 used in hayes class


import
//******************************************************************* */


import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.*;
import java.util.StringTokenizer;
import java.util.*;
import java.util.ArrayList;//yes AL are in util

public class ch6intro_to_ArrayList

{
    final static int MAX = 20;

    public static void main (String[] args)
    {
        //ArrayList notes
        
        
        /*
        ArrayList <String> farm = new ArrayList<>(); // size 0
        //    "diamond syntax" selects type accepted in the list
        farm.add("cow");farm.add("chicken");
        for (int i = 0; i<20;i++)
        {
            farm.add("cow");
            farm.add("chicken");
            farm.add("chicken");
            farm.add("duck");
            farm.add("horse");
    
        }
        farm.add("dog");farm.add("dog");farm.add("dog");
        farm.add("pig");farm.add("pig");farm.add("pig");
        farm.add("pig");farm.add("pig");farm.add("pig");
    
        System.out.println(farm); //it has toString
        
        int count = 0;
        for (int i = 0; i<farm.size(); i++)
        {
            while(farm.get(i).equals("chicken"))
            // the ideal method
            {
                count++;
                farm.remove(i);
                // i--; // accomodate for index shift from removing element
            }
        }
        System.out.println("There are " + count+ " chickens");
        
        
        count = 0;
        for (int i = 0; i<farm.size();i++)
        {
            if(farm.get(i).equals("chicken")) //farm.get(i) = farm[i] 
            {
                count++;
            }
        }
        System.out.println("There are " + count+ " chickens");
        
        
    
        
        
        
    
        String evil = farm.set(farm.size()-1,"chicken");
        
        
        System.out.println(farm);
        
        */
        
        
        ArrayList <Character> list = new ArrayList<>();
        for (char let = 'A'; let <= 'Z'; let++)
        {
            list.add(let);
        }
        System.out.println(list);
        
        char temp;
        for (int i = 0,j=list.size()-1; i<j; i++,j--)
        {
            temp = list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
        }
        System.out.println(list);
        
        //ArrayList <int> list1 = new ArrayList<>(); throws error; no primitive data types
    
        
        /*
        ArrayList <Integer> list1 = new ArrayList<>();
        for (int i = 0; i<10; i++)
        {
            int rand = (int)(((Math.random())*20)+1);
            if (list1.size() == 0)
                list1.add(rand);
            else
            {
                int j = 0;
                while (j < list1.size() && rand > list1.get(j))
                    j++;
                list1.add(j,rand);
            }
        }
        System.out.println(list1);
        */
        
        
        
        
        
        
        
        
        /*
        ArrayList <CD> mycds = new ArrayList<>();
    
        for(int i = 0; i<3; i++)
        {
        
            mycds.add(new CD("Wilco","Jeff Tweety",12.99,16));
            mycds.add(new CD("Throwup","Britiny Spears",12.99,16));
            mycds.add(new CD("Oxygen","CatFish and the Bottlemen",12.99,16));
        
            System.out.print(mycds);
        
        } */
        
    }// end of main

}// end of class











