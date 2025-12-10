package assignment2;

public class PositiveOrNegative
{
    public static void numberCheck(int num)
    {
        if(num > 0)
            System.out.println(num + " :Positive Number");
        else if(num < 0)
            System.out.println(num + " :Negative Number");
        else
            System.out.println(num + " :Netural Number");
    }
    public static void main(String[] args)
    {
        int number = 0;
        numberCheck(number);
    }
}
