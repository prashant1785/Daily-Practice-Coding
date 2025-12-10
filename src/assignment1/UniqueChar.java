package assignment1;

public class UniqueChar
{
    public static void main(String[] args)
    {
        String str = "Mahabharat";

        for (int i = 0; i < str.length(); i++)
        {
            int cnt = 0;
            for (int j = i+1; j < str.length(); j++)
            {
                if(str.charAt(i)==str.charAt(j))
                    cnt++;
            }
            if(cnt==0)
                System.out.print(str.charAt(i));
        }
    }
}
