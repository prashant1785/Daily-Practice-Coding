/*Creating Threads
• Create a class called PrimeNumberThread that extends the Thread class.
• In the run method, write logic to print all prime numbers between 1 and 100.
• Create another class called FibonacciThread that implements the Runnable interface.
• In the run method, generate and print the first 10 numbers in the Fibonacci sequence.
• In the main method, start both threads and ensure they execute concurrently.
 */
package assignment4;

import java.util.Scanner;

class PrimeNumberThread extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Prime numbers between 1 and 100 :");
        for (int i = 1; i <= 100; i++)
        {
            int cnt = 0;
            for (int j = 1; j <= 100; j++)
            {
                if(i%j == 0)
                    cnt++;
            }
            if(cnt == 2)
                System.out.println(i);
        }
    }
}
class FibonacciThread implements Runnable
{
    @Override
    public void run()
    {
        System.out.println("First 10 numbers in Fibonacci sequence :");
        int a = 0,b = 1;
        System.out.println(a);
        System.out.println(b);

        for (int i = 1; i <= 8; i++)
        {
               int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}
public class Que6 
{
    public static void main(String[] args)
    {
        PrimeNumberThread pnt = new PrimeNumberThread();
        Thread fbt = new Thread(new FibonacciThread());

        pnt.start();

        try {
            pnt.join();
        }
        catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        fbt.start();
    }
}
