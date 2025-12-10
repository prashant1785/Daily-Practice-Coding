package Multithreading;


class DaemonEx extends Thread{
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
                System.out.println("The Daemon thread is running....");
            } catch (InterruptedException e) {
                System.out.println("Daemon thread interrupted");
            }
        }
    }
}

public class DaemonThreadExample {
    public static void main(String[] args) {

        DaemonEx dt = new DaemonEx();
        dt.setDaemon(true);
        dt.start();

        System.out.println("Main thread is running....");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Main thread is finished....");
    }
}



