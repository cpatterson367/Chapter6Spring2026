
// Cole Patterson


public class AcctMain
{
    public static void main(String[] args)
    {
        Account p1 = new Account ("Homer Simpson", 1001, 1090.45);
        Account p2 = new Account ("Marge Simpson", 1002, 786.54);
        Account p3 = new Account ("Bart Simpson", 1564, 4571.60);
        Account p4 = new Account ("Liz Wilson", 1349, 2034.52);
        Account p5 = new Account ("Jack Hagested", 2389, 280.67);
        Account p6 = new Account ("Mack Hagested", 2391, 1008.53);
        Account p7 = new Account ("Emy Hayes", 3598, 1260.84);
        Account p8 = new Account ("Doug Dralle", 4562, 5783.90);
        Account p9 = new Account ("Eric Willhelm", 3208, 3420.75);
        Account p10 = new Account ("Julie Noris", 4568, 9041.49);
        Account[] people = {p1,p2,p3,p4,p5,p6,p7,p8,p9,p10};
        
        Sorts.insertionSort(people);
        for (int i=0; i<people.length; i++)
        {
            System.out.println(people[i]);
        }
        System.out.println();

        Account[] hashArray = new Account[people.length*2];
        for (int i=0; i<people.length; i++)
        {
            hashArray[people[i].hashCode() % 20] = people[i];
        }
        
        for (int i=0; i<hashArray.length; i++)
            System.out.println(hashArray[i]);
        
    }
}
