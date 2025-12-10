package PracticeCodes;

public class DaemonThread
{
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            for (int i = 1; i <=10; i++)
            {
                System.out.println("Daemon thread running: " + i);
                try {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e) {
                    System.out.println("Daemon thread interrupted");
                }
            }
        });
        t1.setDaemon(true);
        t1.start();
        System.out.println("Main thread ends quickly.");
    }
}
