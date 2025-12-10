package Collections;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class MaxElementInPriorityQ
{
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.offer(10);
        pq.offer(88);
        pq.offer(15);
        pq.offer(99);
        pq.offer(100);
        pq.offer(130);
        pq.offer(122);
        pq.offer(152);
        pq.offer(133);

        System.out.println("Elements in priority queue: "+pq);
        System.out.println("Largest element: "+pq.peek());
        System.out.println("Size of priority queue: "+pq.size());
    }
}
