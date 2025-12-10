package stringExample;

public class ArrayEqualOrNot
{
    public static void main(String[] args) {

        int [] arr1 = {12,59,79,33,99,88};
        int [] arr2 = {12,59,79,33,99,90};

      //  System.out.println( Arrays.equals(arr1,arr2));

        if (arr1.length == arr2.length)
        {
            int cnt = 0;
            for (int i = 0; i < arr1.length; i++)
            {
                for (int j = 0; j < arr2.length; j++)
                {
                    if (arr1[i] == arr2[j])
                        cnt++;
                }
            }
            if (cnt == arr1.length)
                System.out.println("Arrays are equal");
            else
                System.out.println("Arrays are not equal");
        }
        else
            System.out.println("Arrays are not equal");
    }
}
