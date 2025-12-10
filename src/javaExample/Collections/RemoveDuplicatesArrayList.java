package Collections;

import java.util.ArrayList;

public class RemoveDuplicatesArrayList
{
    public static void main(String[] args)
    {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(10);
        al.add(15);
        al.add(10);
        al.add(20);
        al.add(15);
        al.add(50);

        System.out.println(al);
        ArrayList<Integer> result = new ArrayList<>();

        for (int data : al )
        {
            if (!result.contains(data))
                result.add(data);
        }
        System.out.println(result);
    }
}
