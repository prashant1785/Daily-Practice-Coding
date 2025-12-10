package Multithreading;

class FileDownloading implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            try {
                if (i % 20 == 0) {
                    Thread.sleep(1000);
                    System.out.println("File downloading " + i + "%");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
public class FileDownloadingEx
{
    public static void main(String[] args) {
        Thread fileD = new Thread(new FileDownloading());
        fileD.start();
    }
}
