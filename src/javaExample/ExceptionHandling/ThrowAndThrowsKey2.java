package ExceptionHandling;

class AgeInvalidException extends Exception
{
    AgeInvalidException()
    {
        super("Error: Age must be above 0");
    }
}
public class ThrowAndThrowsKey2
{
    public static void checkString(String str)
    {
        if (str == null)
        {
            throw new NullPointerException();
        }
        System.out.println("This is string: "+ str);
    }
    public static void checkAge(int age) throws AgeInvalidException
    {
        if (age < 1)
        {
            throw new AgeInvalidException();
        }
        System.out.println("Age: "+ age);
    }
    public static void main(String[] args)  {
        try {
            String string = "null";
            checkString(string);
        } catch (Exception e)
        {
            System.out.println("Null value not allowed: "+e);
        }
        try {
            int setAge = -4;
            checkAge(setAge);
        } catch (IllegalArgumentException | AgeInvalidException e) {
            System.out.println(e.getMessage());
        }

    }
}
