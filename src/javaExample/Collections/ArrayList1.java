package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.*;
import java.util.Stack;

public class ArrayList1
{
    public static void main(String[] args)
    {
        List arrayList1 = new ArrayList<>();  // Its store all type of data.
        List vector = new Vector();

        arrayList1.add(23);
        arrayList1.add("Prashant");
        arrayList1.add(67.98);
        arrayList1.add(33.2);
        arrayList1.add('S');
        arrayList1.add(true);

        System.out.println(arrayList1);

        arrayList1.add(0,30);
        arrayList1.set(3,55.3);

        System.out.println(arrayList1);

        arrayList1.remove(67.98);
        System.out.println(arrayList1.isEmpty());
        System.out.println(arrayList1);

        System.out.println("Contains Method : " + arrayList1.contains("Prashant"));

        System.out.println(vector.isEmpty());
        vector.addAll(arrayList1);

        arrayList1.clear();
        System.out.println(arrayList1);

        arrayList1.addAll(vector);
        System.out.println(arrayList1);
        System.out.println(vector);

        System.out.println(arrayList1.containsAll(vector));
        System.out.println(arrayList1.hashCode());
        System.out.println(arrayList1.size());
        System.out.println(arrayList1.get(2));
        System.out.println(arrayList1.lastIndexOf(arrayList1));
        System.out.println(arrayList1.stream().findFirst());

        for (Object data : arrayList1)
        {
            System.out.println(data);
        }
        System.out.println("-----------------------------------------------");
        for (int i = 0; i < vector.size(); i++)
        {
            System.out.println(vector.get(i));
        }

        Stack <Integer> stack = new Stack<> ();

        stack.add(12);
        stack.push(10);
        stack.push(20);
        stack.push(10);
        stack.push(30); //to add element

        System.out.println(stack);
        stack.pop(); //get last element and remove from list
        System.out.println(stack);
        System.out.println(stack.peek()); //get last element
        System.out.println(stack);


        LinkedList<String> ll = new LinkedList<>();

        ll.add("Prashant");
        ll.add("Dilip");
        ll.add("Domkawale");

        System.out.println(ll);
        ll.remove(1);
        System.out.println(ll);








    }
}
