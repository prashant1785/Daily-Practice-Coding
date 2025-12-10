package assignment1;

/*14. Write a program to initialize two strings and check whether 1st string is same with 2nd
string or not (without using equals and equalsIgnoreCase method) program must be
case insensitive without using compareToIgnoreCase Method.*/

public class EqualOrNot
{
    public static void main(String[] args) {

        String str1="Hello";
        String str2="HeLLo";

        if(str1.length()==str2.length())
        {
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();

            if(str1.contains(str2))
                    System.out.println("String is Same");
                else
                    System.out.println("String is not Same");


//            int cnt=0;
//
//            for (int i = 0; i < str1.length(); i++)
//            {
//
//                if(str1.charAt(i)==str2.charAt(i))
//                    cnt++;
//            }
//            if(cnt==str2.length())
//                System.out.println("String is Same");
//            else
//                System.out.println("String is not Same");
        }
        else
            System.out.println("String is not Same");

    }
}
