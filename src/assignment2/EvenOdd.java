package assignment2;

public class EvenOdd
{
    public static void evenOddCheck(int num)
    {
        if(num % 2 == 0)
            System.out.println(num + " :Even");
        else
            System.out.println(num + " :Odd");
    }
    public static void main(String[] args)
    {
        int number = 100;
        evenOddCheck(number);
    }
}
