package ExceptionHandling;

public class TryAndCatch3
{
    public static void main(String[] args)
    {
        int a = 10,b = 0,c;

        try {                                           //try block contains only risky code
            c = a/b;
            System.out.println("I am in try block");
            System.out.println(c);
        }
        catch (Exception e) {                           //catch block handle the exception
            System.out.println("I am in catch block");
            System.out.println(e);
        }
        finally {
            System.out.println("I am in finally block"); // finally block always executed its use to handle the resources
        }
    }
}
