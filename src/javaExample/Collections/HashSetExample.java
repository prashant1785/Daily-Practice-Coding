package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample
{
    public static void main(String[] args)
    {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(10);
        hs.add(20);
        hs.add(10);
        hs.add(40);
        hs.add(20);
        hs.add(50);

        System.out.println(hs);
        hs.add(30);
        System.out.println(hs);
        System.out.println(hs.contains(50));
        hs.add(60);
        hs.add(null);
        hs.add(null);
        System.out.println(hs);

        Iterator it = hs.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
