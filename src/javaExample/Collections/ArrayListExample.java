package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample
{
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        Collections.addAll(al,10,20,30,40,50);

        System.out.println(al);
        al.add(80);
        al.add(60);
        System.out.println(al);
        al.set(5,70);
        System.out.println(al);
        al.remove(5);
        System.out.println(al);
        System.out.println(al.get(5));

        Collections.reverse(al);
        System.out.println(al);

        Iterator<Integer> iterator = al.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
