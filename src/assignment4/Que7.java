/*Synchronization
• Create a shared resource class called SharedCounter with a counter variable
(e.g., int count = 0).
• Add a synchronized method increment() that increases the counter by 1.
• Add a method getCount() to print the current counter value.
• Create multiple threads (e.g., 3 threads) that call the increment() method 100
times each.
• Ensure the SharedCounter is thread-safe and display the final value of the
counter.
 */

package assignment4;

class SharedCounter
{
     int cnt = 0;
    synchronized void increment()
    {
        cnt++;
    }
    void getCount()
    {
        System.out.println("Final Counter Value : " + cnt);
    }
}
class Counter extends Thread
{
     SharedCounter counter;

     Counter(SharedCounter counter)
    {
        this.counter = counter;
    }
    @Override
    public void run()
    {
        for (int i = 1; i <= 100; i++)
        {
            counter.increment();
        }
    }
}
public class Que7
{
    public static void main(String[] args)
    {
        SharedCounter sc = new SharedCounter();

        Thread t1 = new Counter(sc);
        Thread t2 = new Counter(sc);
        Thread t3 = new Counter(sc);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }
        sc.getCount();
    }
}
