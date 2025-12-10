package Multithreading;

class Msg{
    public void sayHello(String name)
    {
        System.out.println("How are you guy's...");
        synchronized (name) {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hello: " + name);
            }
            System.out.println("I know you are fine...");
        }
    }
}
class MyName implements Runnable{
    Msg msg = new Msg();
    @Override
    public void run() {
            msg.sayHello("Prashant");
    }
}
public class SynchronizedBlock
{
    public static void main(String[] args) {

        Msg msg1 = new Msg();
        msg1.sayHello("Rohit");

        Thread mn = new Thread(new MyName());
        mn.start();
    }
}
