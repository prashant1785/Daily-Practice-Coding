package Multithreading;

//Extending by Runnable Interface
class Run1 implements Runnable
{
    @Override
    public void run()
    {
            for (int i = 1; i <=3 ; i++)
            {
                try
                 {
                     Thread.sleep(1000);
                System.out.println("Run1..!");
                 }
                catch (Exception e)
                {
                    System.out.println(e);
                }
             }
    }
}
class Run2 implements Runnable
{
    @Override
    public void run()
    {
        for (int i = 1; i <=3 ; i++)
        {
            try
            {
                Thread.sleep(1000);
                System.out.println("Run2..!");
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
public class RunTherad
{
    public static void main(String[] args)
    {
        Run1 r1 = new Run1();  // Create obj Run1 class
        Thread t1 = new Thread(r1);  //Declare in thread class
        Thread t2 = new Thread(new Run2()); // Direct create Run2 class and declear in thread class
         t1.start();
         t2.start();


        for (int i = 1; i <=3 ; i++)
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
