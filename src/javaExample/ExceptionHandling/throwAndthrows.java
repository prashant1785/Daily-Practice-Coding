package ExceptionHandling;

public class throwAndthrows
{
    void div(int a,int b) throws ArithmeticException     //use throws key
    {
        if(b == 0)
            throw new ArithmeticException("Divide by zero not allowed");  //use throw key
        else
            System.out.println("Result : "+a/b);
    }
    public static void main(String[] args)
    {
        throwAndthrows th = new throwAndthrows();
        try {
            th.div(50,0);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
}
