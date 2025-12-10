package PracticeCodes;

import java.util.ArrayList;
import java.util.Scanner;

public class DuplitesInBothArray
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        int[] arr1 = new int[size];
        int[] arr2 = new int[size];

        System.out.println("Enter " + size + " elements in array1:");
        for (int i = 0; i<size; i++)
        {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter " + size + " elements in array2:");
        for (int i = 0; i<size; i++)
        {
            arr2[i] = sc.nextInt();
        }
        ArrayList<Integer> duplites = new ArrayList<>();
        for (int i =0; i<arr1.length; i++)
        {
            if (arr1[i] == arr2[i])
                duplites.add(arr1[i]);
        }
        System.out.print("Duplites elements in both array: ");
        System.out.print(duplites);
    }
}
