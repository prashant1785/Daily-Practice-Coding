package Multithreading;

// Extending by thread class
class Thread1 extends Thread
{
    @Override
    public void run()
    {
        for (int i = 1; i <=5 ; i++)
        {
            try
            {
                Thread.sleep(1000);
                System.out.println("Thread1..!");
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
class Thread2 extends Thread
{
    @Override
    public void run()
    {
        int i = 1;
        while (i <= 5)
        {
            try
            {
                Thread.sleep(1000);
                System.out.println("Thread2..!");
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
            i++;
        }
    }
}
public class MultithreadingEx
{
    public static void main(String[] args)
    {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();

        for (int i = 1; i <=5 ; i++)
        {
            try
            {
                Thread.sleep(1000);
                System.out.println("Main..!");
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
