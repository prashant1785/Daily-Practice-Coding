package Multithreading;

class Table{
    public synchronized void printTable(int n)
    {
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(i * n);
        }
    }
}
class Five extends Thread{
    Table table = new Table();
    @Override
    public void run() {
        System.out.println("Print five number table");
        table.printTable(5);
    }
}
class Seven extends Thread{

    Table table = new Table();
    @Override
    public void run() {
        System.out.println("Print seven number table");
        table.printTable(7);
    }
}
class Three extends Thread{

    Table table = new Table();
    @Override
    public void run() {
        System.out.println("Print three number table");
        table.printTable(3);
    }
}
public class SynchronizedMethod
{
    public static void main(String[] args) {

       Five five = new Five();
       five.start();

        Seven seven = new Seven();
        seven.start();

        Three three = new Three();
        three.start();
    }
}
