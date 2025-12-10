package Collections;

import java.util.ArrayList;

public class FoundElement
{
    public static void main(String[] args)
    {
        ArrayList<Double> al1 = new ArrayList<>();

        al1.add(1.5);
        al1.add(4.5);
        al1.add(7.7);
        al1.add(3.2);
        al1.add(9.4);

 // Sum of list elements.
        double sum = 0;
        for (Double data : al1)
        {
            sum = sum + data;
        }
        System.out.println(sum);

        //checks if element is in the list.
        if (al1.contains(1.5))
            System.out.println("Element Found");
        else
            System.out.println("Element Not Found");
    }
}
