package assignment3.Que2;

public class FindElement
{
    public static void main(String[] args) {
        int arr[] = {2, 5, 6, 77, 98, 34, 22, 67, 33};

        int ele = 22;
        int cnt =0;

        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] == ele)
            {
                System.out.println("Element " + ele + " found at index: " + i);
                cnt++;
            }
        }
        if(cnt==0)
            System.out.println("Element " + ele + " is not present in the array.");
    }
}
