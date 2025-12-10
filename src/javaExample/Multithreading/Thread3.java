package Multithreading;

class Thread4 implements Runnable
{
   public Thread4(String name)
    {
        super();
    }
    @Override
    public void run()
    {
        int i = 1;
        while (i <= 5)
        {
            System.out.println("I am in Thread4");
            i++;
        }
    }
}
public class Thread3
{
    public static void main(String[] args)
    {
        Thread t4 = new Thread(new Thread4("Prashant"));
       // Thread tt = new Thread(t4,"Prahant");

        t4.start();
        System.out.println("ID : " + t4.getId());
        System.out.println("Name : " + t4.getName());
        System.out.println(t4.currentThread().getName());
        System.out.println("Program Execute");

    }
}
