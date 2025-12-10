package assignment3.Que2;

import java.util.Arrays;

public class CalculateArray
{
    public static void main(String[] args) {
        int arr[] = {2, 5, 6, 77, 98, 34, 22, 67, 33};

        CalculateArray array = new CalculateArray();
        array.printArray(arr);
        array.printCal(arr);
    }
    public void printArray(int arr[])
    {
        System.out.println(Arrays.toString(arr));
    }
    public void printCal(int []arr)
    {
        int sum =0;
        for (int i = 0; i < arr.length; i++)
        {
            sum = sum + arr[i];
        }
        System.out.println("Sum : " + sum);
    }
}
