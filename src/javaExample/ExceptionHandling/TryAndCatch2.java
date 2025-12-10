package ExceptionHandling;

public class TryAndCatch2
{
    public static void main(String[] args)
    {
        String str = null;

        try
        {
            if(str != null)
                System.out.println("String is not null!");
        }
        catch (Exception e)
        {
            System.out.println(e);
            System.out.println("String is null!");
        }

        String str2 = "Hello";
        String str3 = "123";

        try {
            int a = Integer.parseInt(str3);
            int b = Integer.parseInt(str2); // NumberFormatException
            System.out.println(a);
            System.out.println(a);
        }
        catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
