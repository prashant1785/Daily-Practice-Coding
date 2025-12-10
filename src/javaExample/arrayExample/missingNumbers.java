package arrayExample;

import java.util.Arrays;
import java.util.HashSet;

public class missingNumbers
{
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,6,7,9,10};
        Integer arr1[] = {1,2,4,7,8,9,10};

        HashSet<Integer> missingNum = new HashSet<>();
        HashSet<Integer> missingNum1 = new HashSet<>(Arrays.asList(arr1));

        for (int data: arr)
        {
            missingNum.add(data);
        }
        int min = arr[0];

        for (int i = min; i <= arr.length ; i++)
        {
            if (!missingNum.contains(i))
                System.out.print(i+" ");
        }
    }
}
