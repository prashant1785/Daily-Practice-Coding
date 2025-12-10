package arrayExample;

import java.util.ArrayList;
import java.util.Arrays;

public class mergeArray
{
    public static void main(String[] args) {
        int arr1[] = {34, 66, 78, 55, 99, 12, 99};
        int arr2[] = {35, 56, 78, 65, 49, 22, 59};
        int arr3[] = new int [arr1.length + arr2.length];

        for (int i = 0; i < arr1.length;i++)
        {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length;i++)
        {
            arr3[arr1.length + i] = arr2[i];
        }
        for (int data : arr3)
        {
            System.out.print(data+" ");
        }
//-----------------------------------------------------------------------------------------------------------
        ArrayList<Integer> list = new ArrayList<>();
        for (int data: arr1)
        {
            list.add(data);
        }
        for (int data: arr2)
        {
            list.add(data);
        }
        System.out.println(list);
    }
}
