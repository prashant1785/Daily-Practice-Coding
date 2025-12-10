package assignment2;

public class PrimeNumber
{
    public static boolean primeNumCheck(int num)
    {
        if(num <= 1)
        {
            return false;
        }
        for (int i = 2; i < num; i++)
        {
            if(num % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        int number = 81;
        if(primeNumCheck(number))
            System.out.println(number + " :Prime Number");
        else
            System.out.println(number + " :Not Prime Number");
    }
}
