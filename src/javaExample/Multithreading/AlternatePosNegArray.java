package Multithreading;

class PosArray extends Thread
{
    private int posArr[];

    PosArray(int [] posArr)  //Constructor throw pass
    {
        this.posArr = posArr;
    }
    public void run()
    {
        try
        {
            for (int i = 0; i < posArr.length; i++) {
                if (posArr[i] > 0)
                    System.out.print(posArr[i] + " ");
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
class NegArray extends Thread
{
    private int negArr[];

    NegArray(int [] negArr)  //Constructor throw pass
    {
        this.negArr = negArr;
    }
    public void run()
    {
        try {
            for (int i = 0; i < negArr.length; i++) {
                if (negArr[i] < 0)
                    System.out.print(negArr[i] + " ");
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
public class AlternatePosNegArray
{
    public static void main(String[] args)
    {
        int [] positiveArr = {98,45,70,22,75,55};
        int [] negativeArr = {-44,-5,-76,-22,-43,-23};

        PosArray posArray = new PosArray(positiveArr);
        NegArray negArray = new NegArray(negativeArr);

        posArray.start();
        negArray.start();
    }
}
