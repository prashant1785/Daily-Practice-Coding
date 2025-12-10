package stringExample;

public class PailndromeString
{
    public static void main(String[] args)
    {
       /* String str = "madam";

        StringBuffer str1 = new StringBuffer(str);

        String reverse = str1.reverse().toString();
        System.out.println(reverse);

        if (reverse.equals(str))
            System.out.println("true");
        else {
            System.out.println("false");
        }
---------------------------------------------------------------------------------------------------
        String str3 = "Onoiono";
        if (chekPalindrome(str3))
            System.out.println("String is palindrome");
        else
            System.out.println("String is not palindrome");
  -------------------------------------------------------------------------------------------------*/
        String str = "Madam";
        str = str.toLowerCase();
        String rev = "";
        for ( int i = str.length()-1; i>=0; i--)
        {
            rev+=str.charAt(i);
        }
        if(str.equals(rev))
            System.out.println(true);
        else
            System.out.println(false);
    }
//--------------------------------------------------------------------------------------------------
   /* public static boolean chekPalindrome(String str)
    {
        int left = 0;
        int right = str.length()-1;

        str = str.toLowerCase();

        while (left < right)
        {
            if (str.charAt(left) != str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }*/
}

