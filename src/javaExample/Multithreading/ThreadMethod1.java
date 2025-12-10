package Multithreading;

class Method1 extends Thread
{
    @Override
    public void run()
    {
        try
        {
            int i=1;
            while (i <= 5)
            {
                Thread.sleep(1000);    //Sleep method pause the thread speficed time
                System.out.println(Method1.currentThread().getName());
                i++;
            }
        }
        catch (InterruptedException i)
        {
            System.out.println(i);
        }
    }
}
public class ThreadMethod1
{
    public static void main(String[] args)
    {
        Method1 m1 = new Method1();
        Method1 m2 = new Method1();
        Method1 m3 = new Method1();
        Method1 m4 = new Method1();

        m1.setName("Prashant");
        m2.setName("Avinash");
        m3.setName("Ajay");
        m4.setName("Tushar");

        m2.start();
        try
        {
            m2.join();      //join method wait for the therad finish execution
                            //It's execute the all thread at a time.
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }

        m1.start();         //isAlive Check thread is still running or not.
        System.out.println("m1 method is running : " + m1.isAlive());
        m1.setPriority(Thread.MIN_PRIORITY);

        m3.start();
       m3.setPriority(Thread.MAX_PRIORITY); //Set the threads priority 1 to 10.

        m4.start();
        try {
            m4.interrupt();     //interrupted the thread
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
