
/*
public class Practic
{
    public static void main(String[] args)
    {
        class TestThread3 implements Runnable
        {
            @Override
            public void run() {
                String name = Thread.currentThread().getName();

                int sleepTime =0;
                int start = 0;
                int end  = 0;

                if(name.equalsIgnoreCase("tom"))
                {
                    sleepTime = 500;
                    start = 1;
                    end =40;
                }

                else if(name.equalsIgnoreCase("jerry"))
                {
                    sleepTime = 1000;
                    start=1;
                    end=20;
                }
                for (int i=start;i<=end;i++)
                {
                    System.out.println(name +" : "+ i);
                    try {
                        Thread.sleep(sleepTime);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        public class MyThread3 {
            public static void main(String[] args) {
                TestThread3 tt = new TestThread3();

                Thread t1 = new Thread(tt, "tom");
                Thread t2 = new Thread(tt, "jerry");


                Thread t = Thread.currentThread();

                for (int i=1;i<=15;i++)
                {
                    System.out.println(" ------------ "+t.getName()+" : "+ i);
                    System.out.println("------------ "+t1.getName()+" : "+t1.isAlive());
                    System.out.println("------------ "+t2.getName
                            System.out.println("------------ "+t2.getName()+" : "+t2.isAlive());

                    try
                    {
                        if (i==3)
                        {
                            t1.start();
                        } else if (i==4) {
                            System.out.println(t1.getName()+" Joined and "+t2.getName()+" joined");
                            t2.start();
                            t1.join();
                            t2.join();
                        }
                        Thread.sleep(2000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            }
        }


    }
}

 */

