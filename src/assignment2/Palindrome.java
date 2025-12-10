package assignment2;

public class Palindrome
{
    public static boolean isPalindrome(String str)
    {
        str = str.toLowerCase();
        int left = 0;
        int right = str.length()-1;

        while (left < right)
        {
            if(str.charAt(left) == str.charAt(right))
            {
                return true;
            }
            left++;
            right--;
        }
            return false;
    }

    public static void main(String[] args)
    {
        String string1 = "Madam";

        if(isPalindrome(string1))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
