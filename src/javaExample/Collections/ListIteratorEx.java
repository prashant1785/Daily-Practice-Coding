package Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
public class ListIteratorEx{
    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(12);
        ll.add(15);
        ll.add(22);
        ll.add(38);

        ListIterator<Integer> lit = ll.listIterator(); //ll.size() When retrieve data backword direction
        while (lit.hasNext())
        {
            System.out.print(lit.next()+" ");
        }
        System.out.println("------------------------------------------------------");
        while (lit.hasPrevious())
        {
            System.out.print(lit.previous()+" ");
        }

        System.out.println("------------------------------------------------------");

        Iterator<Integer> it = ll.iterator();
        while (it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
    }
}
