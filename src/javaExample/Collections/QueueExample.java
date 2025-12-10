package Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample
{
    public static void main(String[] args)
    {       //FIFO
        Queue<Integer> pq = new PriorityQueue<>();

        pq.offer(20);
        pq.offer(10);
        pq.offer(60);
        pq.offer(40);
        pq.offer(60);
        pq.offer(60);
        pq.offer(90);
        pq.add(80);
        pq.offer(100);

        System.out.println(pq);

        System.out.println(pq.peek());
        System.out.println(pq.poll());

        System.out.println(pq);
        System.out.println(pq.element());
    //    pq.offer(null);    //Null not allowed
        System.out.println(pq);

        pq.remove(90);
       // pq.clear();
        pq.poll();
       // pq.remove(); //when queue is empty and perform remove() throw exception
        System.out.println(pq);
    }
}
