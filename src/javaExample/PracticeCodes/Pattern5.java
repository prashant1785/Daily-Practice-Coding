package PracticeCodes;

public class Pattern5 {
    public static void main(String[] args) {

        int height = 5,length = 5;

        for (int i = 1; i <= height; i++)
        {
            for (int j = 1; j <= length ; j++)
            {
                try {
                    Thread.sleep(100);
                    if ((i == 1 || i == 5 || j == 4))
                        System.out.print("❤");
                    else
                        System.out.print(" ");
                }
                catch (Exception e)
                {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(" ");
        }
        System.out.println();

        for (int i = 1; i <= height; i++)
        {
            for (int j = 1; j <= length ; j++)
            {
                try {
                    Thread.sleep(100);
                    if((j==1  || i==5))
                        System.out.print("@");
                    else
                        System.out.print(" ");
                }
                catch (Exception e)
                {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(" ");
        }
        System.out.println();

        for (int row = 0; row < height; row++)
        {
            for (int col = 0; col < length ; col++)
            {
                try {
                    Thread.sleep(100);
                    if((row == 0 || row == height - 1) && (col > 0 && col < height - 1))
                    {
                        System.out.print("❤");
                    }
                    else if ((col == 0 || col == height - 1) && (row > 0 && row < height - 1))
                    {
                        System.out.print("❤");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                catch (Exception e)
                {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(" ");
        }

        for (int i = 1; i <= height-1; i++)
        {
            for (int j = 1; j <= length ; j++)
            {
                try {
                    Thread.sleep(100);
                    if((i-j==1 || i+j==7))
                        System.out.print("@");
                    else
                        System.out.print(" ");
                }
                catch (Exception e)
                {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(" ");
        }
        System.out.println();

        for (int i = 1; i <= height; i++)
        {
            for (int j = 1; j <= length ; j++)
            {
                try {
                    Thread.sleep(100);
                    if((i==1 || i==5)||(j==1 || i==3))
                        System.out.print("❤");
                    else
                        System.out.print(" ");
                }
                catch (Exception e)
                {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(" ");
        }
        System.out.println();

        for (int i = 1; i <= height; i++)
        {
            for (int j = 1; j <= length ; j++)
            {
                try {
                    Thread.sleep(100);
                    if((j==1 || j==5) || (i==5))
                        System.out.print("@");
                    else
                        System.out.print(" ");
                }
                catch (Exception e)
                {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(" ");
        }
        System.out.println();

        for (int i = 1; i <= height; i++)
        {
            for (int j = 1; j <= length ; j++)
            {
                try {
                    Thread.sleep(100);
                    if((i==1 || i==3 || i==5) || (i==2 && j==1) || (i==4 && j==5))
                        System.out.print("@");
                    else
                        System.out.print(" ");
                }
                catch (Exception e)
                {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(" ");
        }
        System.out.println();

        for (int i = 1; i <= height-1; i++)
        {
            for (int j = 1; j <= length ; j++)
            {
                try {
                    Thread.sleep(100);
                    if((i+j==4 || j-i==2) || (i==2 && j==3))
                        System.out.print("@");
                    else
                        System.out.print(" ");
                }
                catch (Exception e)
                {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(" ");
        }

        for (int i = 1; i <= height; i++)
        {
            for (int j = 1; j <= length ; j++)
            {
                try {
                    Thread.sleep(100);
                    if((j==1) || (i+j==5 || i-j==1))
                        System.out.print("❤");
                    else
                        System.out.print(" ");
                }
                catch (Exception e)
                {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(" ");
        }
        System.out.println();

        for (int i = 1; i <= height; i++)
        {
            for (int j = 1; j <= length ; j++)
            {
                try {
                    Thread.sleep(100);
                    if((i==1 || i==3 || i==5) || (i==2 && j==1) || (i==4 && j==5))
                        System.out.print("@");
                    else
                        System.out.print(" ");
                }
                catch (Exception e)
                {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(" ");
        }
        System.out.println();

        for (int i = 1; i <= height; i++)
        {
            for (int j = 1; j <= 5 ; j++)
            {
                try {
                    Thread.sleep(100);
                    if((j==1 || j==5 || i==3))
                        System.out.print("@");
                    else
                        System.out.print(" ");
                }
                catch (Exception e)
                {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= 5 ; j++)
            {
                try
                {
                    Thread.sleep(100);
                    if((i==1 || i==5 || j==4))
                        System.out.print("❤");
                    else
                        System.out.print(" ");
                }
                catch (Exception e)
                {
                    throw new RuntimeException(e);
                }

            }
            System.out.println(" ");
        }
    }
}




