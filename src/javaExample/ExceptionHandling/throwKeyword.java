package ExceptionHandling;

public class throwKeyword
{
    public static void checkAge(int age)
    {
        if(age < 18)
        {
            throw new ArithmeticException("Age is must be greater than 18"); // throw keyword
        }
        else
        {
            System.out.println("Eligible for voting");
        }
    }
    public static void main(String[] args)
    {
        try {
            checkAge(15); // Throws an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }

    }
}
