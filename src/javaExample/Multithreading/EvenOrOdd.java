package Multithreading;
class Even extends Thread{
    public void run() {
        for (int i = 1; i <= 20 ; i++)
        {
            if(i % 2 == 0)
                System.out.println("Even: "+i);
        }
    }
}
class Odd extends Thread{
    public void run() {
        for (int i = 1; i <= 20 ; i++)
        {
            if(i % 2 != 0)
                System.out.println("Odd: "+i);
        }
    }
}
public class EvenOrOdd
{
    public static void main(String[] args) {
        Even even = new Even();
        Odd odd = new Odd();
        even.start();
        odd.start();
    }
}
