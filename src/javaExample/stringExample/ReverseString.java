package stringExample;

public class ReverseString
{
    public static void main(String[] args)
    {
        String str = "India Is My Country";
        String [] str2 = str.split(" ");
        String rev = "";

        for (int i = str2.length-1; i >=0 ; i--)
        {
            rev  += str2[i]+" ";
        }
        System.out.println(rev);
        //-------------------------------------------------------------------------------------
                //Reverse Character
        String demo = "India Is My Country";

        StringBuilder reverse = new StringBuilder(demo).reverse();
        System.out.println(reverse);
        //------------------------------------------------------

        String str1 = "India Is My Country";
        String[] str3 = str1.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word: str3){
            StringBuilder reverse1 = new StringBuilder(word).reverse();
            result.append(reverse1).append(" ");
        }
        System.out.println(str1);
        System.out.println(result);
    }
}
