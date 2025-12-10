package ExceptionHandling;

public class throw2
{
    public static void checkString(String str1)
    {
        if (str1 == null)
            throw new NullPointerException("String is null...!");
          else
            System.out.println(str1.toUpperCase());
    }
    public static void main(String[] args)
    {
        try {
            checkString(null);
        }
        catch (NullPointerException n)
        {
            System.out.println(n);
        }

    }
}
