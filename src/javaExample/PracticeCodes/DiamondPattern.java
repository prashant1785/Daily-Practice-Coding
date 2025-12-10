package PracticeCodes;

public class DiamondPattern
{
    public static void main(String[] args) {

        int spc = 4;
        for (int i = 1; i <= 10; i++)
        {
            for (int j = 1; j <= 5; j++)
            {
                if (j <= spc)
                    System.out.print(" ");
                else System.out.print("* ");
            }
            System.out.println();
            if (i < 5)
                spc--;
            else spc++;
        }
    }
}
