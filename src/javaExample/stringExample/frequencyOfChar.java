package stringExample;

public class frequencyOfChar
{
    public static void main(String[] args)
    {
        String str = "Mahabharata";

        for (int i = 0; i < str.length(); i++)
        {
            int cnt = 0;
            for (int j = 0; j < i; j++)
            {
                if(str.charAt(i) == str.charAt(j))
                {
                    cnt++;
                }
            }
            if (cnt==0)
            {
                int frq = 0;
                for (int j = 0; j < str.length(); j++)
                {
                    if(str.charAt(i) == str.charAt(j))
                    {  frq++;   }
                }
                System.out.println(str.charAt(i) + " "+ frq);
            }
        }
    }
}
