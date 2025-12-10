package Collections;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class StackExample
{       //LIFO
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(60);
        stack.push(80);
        stack.push(30);
        stack.push(10);
        stack.push(60);

        System.out.println(stack);
        stack.push(90);
        System.out.println(stack);
        System.out.println(stack.pop()); //get last element and remove from list
        System.out.println(stack);
        System.out.println( stack.peek());   //get last element
        System.out.println(stack);
        System.out.println(stack.capacity());
        System.out.println(stack);

        ListIterator<Integer> li = stack.listIterator();
        while (li.hasPrevious())
        {
            System.out.println(li.previous());

        }
    }
}
