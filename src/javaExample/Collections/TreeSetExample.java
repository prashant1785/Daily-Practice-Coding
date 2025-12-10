package Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample
{
    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(40);
        ts.add(10);
        ts.add(40);
        ts.add(60);
        ts.add(30);
        ts.add(70);

        System.out.println(ts);
        try
        {
            ts.add(null);
        }
        catch (Exception e) {
            System.out.println("Error :null value not allowed :"+ e);
        }

        Iterator it = ts.descendingIterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
