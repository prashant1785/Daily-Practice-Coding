package stringExample;

public class ConcatenateStringElements
{
    public static void main(String[] args)
    {
        String [] str = new String[]
                {
                        "Hello","Flynaut","How","Are","You"
                };
        String ConcatEle = "";

        for (int i = 0; i < str.length; i++)
        {
            ConcatEle += str[i] + " ";
        }

            System.out.print(ConcatEle);
    }
}
