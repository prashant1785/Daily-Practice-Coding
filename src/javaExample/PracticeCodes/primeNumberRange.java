package PracticeCodes;

public class primeNumberRange
{
    public static void main(String[] args)
    {
        System.out.println("Prime Numbers");
        for (int i = 1; i <= 100 ; i++)
        {
            int cnt=0;
            for (int j = 1; j <=100 ; j++)
            {
                if (i%j==0)
                    cnt++;
            }
            if (cnt==2)
                System.out.println(i);
        }
        //---------------------------------------------------------------------------------

    }
}
