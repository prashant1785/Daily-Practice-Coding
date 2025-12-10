package assignment3;
//Create a Multi-Dimensional Array

public class Que3
{
    public static void main(String[] args)
    {
        int [][]arr = new int[3][3];
        int cnt=1;

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length; j++)
            {
                arr[i][j] = cnt++;
            }
        }
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
