package PracticeCodes;

public class countNumOfDigit
{
    public static void main(String[] args) {

        int num = 234554;
        int cnt =0;

        while (num != 0)
        {
            int rem = num % 10;
            cnt++;
            num /= 10;
        }
        System.out.println("Count number of digit is: "+cnt);
        //=================================================================================================
        int tempNum = 876721707;
        String str = String.valueOf(tempNum);
        System.out.println("Count of number of digit is: "+str.length());
    }
}
