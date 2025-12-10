package PracticeCodes;

public class palindromeNum
{
    public static void main(String[] args)
    {
        int num = 1257521;
        int tempNum = num;
        int revNum = 0;

        while (num != 0)
        {
            int dig = num % 10;
            revNum = revNum * 10 + dig;
            num = num/10;
        }
        if (revNum == tempNum)
        System.out.println("Num is palindrome");
        else
        System.out.println("Num is not palindrome");
  //---------------------------------------------------------------------------------------------
        int number = 1257521;
        String str = String.valueOf(number);

        StringBuilder revNumber = new StringBuilder(str).reverse();

        if (str.equals(revNumber.toString()))
            System.out.println("Num is palindrome");
        else
            System.out.println("Num is not palindrome");

    }
}
