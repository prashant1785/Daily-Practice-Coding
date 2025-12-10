package Collections;

import java.util.Vector;

public class VectorExample
{
    public static void main(String[] args)
    {
        Vector <Integer> vector = new Vector<>();

        vector.add(50);
        vector.add(30);
        vector.add(60);
        vector.add(80);
        vector.add(20);
        vector.add(50);

        System.out.println(vector);
        vector.remove(0);
        System.out.println(vector);
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        System.out.println(vector.size());
        System.out.println(vector.capacity());

    }
}
