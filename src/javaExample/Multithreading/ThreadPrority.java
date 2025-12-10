package Multithreading;

class Neta extends Thread
{
    @Override
    public void run() {
        for (int i = 1; i <= 5 ; i++) {
            System.out.println("Im Neta");
        }
      //  System.out.println("Out of neta");
    }
}
class CommonMan extends Thread
{
    @Override
    public void run() {
        for (int i = 1; i <= 5 ; i++) {
            System.out.println("Im CommonMan");
        }
    }
}
class GovermentEmp extends Thread
{
    @Override
    public void run() {
        for (int i = 1; i <= 5 ; i++) {
            System.out.println("Im GovermentEmp");
        }
    }
}
public class ThreadPrority
{
    public static void main(String[] args) {

        Neta neta = new Neta();
        CommonMan man = new CommonMan();
        GovermentEmp emp = new GovermentEmp();

        neta.setPriority(Thread.MAX_PRIORITY);
        neta.start();

        man.setPriority(Thread.MIN_PRIORITY);
        man.start();

        emp.setPriority(Thread.NORM_PRIORITY);
        emp.start();
    }
}
