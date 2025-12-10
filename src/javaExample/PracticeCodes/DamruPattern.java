package PracticeCodes;

public class DamruPattern
{
    public static void main(String[] args) {

        int spc = 0;
        for (int i = 1; i < 10; i++)
        {
            for (int j = 1; j <= 5; j++)
            {
                if (j <= spc)
                    System.out.print(" ");
                else System.out.print("* ");
            }
            System.out.println();
            if (i < 5)
                spc++;
            else spc--;
        }
    }
}
