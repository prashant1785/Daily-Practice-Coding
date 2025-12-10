package ExceptionHandling;

public class deadLockEx
{
    public static void main(String[] args) {
        final String lock1 = "LOCK1";
        final String lock2 = "LOCK2";

        Thread t1 = new Thread(()-> {
            synchronized (lock1){
                System.out.println("Thread-1: Holding lock1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread-1: Waiting for lock2");
                synchronized (lock2) {
                    System.out.println("Thread-1: Acquired lock2");
                }
            }
        });
        Thread t2 = new Thread(()-> {
            synchronized (lock2){
                System.out.println("Thread-2: Holding lock2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread-2: Waiting for lock1");
                synchronized (lock2) {
                    System.out.println("Thread-2: Acquired lock1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
