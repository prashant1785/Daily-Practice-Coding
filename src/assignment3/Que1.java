package assignment3;

import java.util.Arrays;
//1. Create a Single-Dimensional Array
public class Que1
{
    public static void main(String[] args)
    {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length ; i++)
        {
            arr[i] = i+1;
        }
        System.out.println("Array Element : ");

        for(int data : arr)
        {
            System.out.println(data);
        }
    }
}
