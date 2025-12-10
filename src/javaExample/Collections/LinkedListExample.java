package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample
{
    public static void main(String[] args)
    {   //FIFO
        LinkedList link = new LinkedList<>();

        link.add("Hello");
        link.add("Flynaut");
        link.add("How");
        link.add("Are");
        link.add("You");

        System.out.println(link);
        link.add("Good");
        link.remove();
        System.out.println(link);
        link.remove();
        System.out.println(link);
        System.out.println(link.get(3));
        link.add(0,"Hii");
        System.out.println(link);
        link.set(0,"hii");
        System.out.println(link);

        Iterator<String> iterator = link.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

    }
}
