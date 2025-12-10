package Multithreading;
class Pratiksha implements Runnable
{
    @Override
    public void run() {
        try {

            for (int i = 1; i < 6 ; i++)
            {
                Thread.sleep(1000);
                System.out.println("I am Mom...");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
class Durva implements Runnable
{
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("I am Baby...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class ThreadMethods
{
    public static void main(String[] args) {

        Thread p = new Thread(new Pratiksha());
        Thread d = new Thread(new Durva());

        p.start();
        try {
            p.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        d.start();
    }
}
