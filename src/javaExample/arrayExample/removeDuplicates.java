package arrayExample;

import java.util.*;

public class removeDuplicates
{
    public static void main(String[] args) {

        int [] arr = {23,45,77,89,23,45,99,76,44};

        for (int i = 0; i < arr.length; i++)
        {
            int cnt =0 ;
            for (int j = 0; j < i ; j++)
            {
                if (arr[i]==arr[j])
                    cnt++;
            }
            if (cnt == 0)
                System.out.print(arr[i]+" ");
        }
   //------------------------------------------------------------------------------------------------
        int [] arr1 = {23,45,77,89,23,45,99,76,44};
        HashSet<Integer> uniqueNum = new HashSet<>();

        for(int data : arr1)
        {
            uniqueNum.add(data);
        }
        System.out.println(uniqueNum);


    }
}
