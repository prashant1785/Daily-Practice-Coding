package assignment3.Que2;

public class FindMaxAndMin
{
    public static void main(String[] args)
    {
        int arr[] = {2,5,6,77,98,34,22,67,33};

        FindMaxAndMin mam = new FindMaxAndMin();
        mam.findMax(arr);
        mam.findMin(arr);
    }
    public void findMax(int []arr)  // find MAX Element
    {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println("Max : "+ max);
    }
    public void findMin(int []arr)   // Fine Min Element
    {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++)
        {
            if(min < arr[i])
                arr[i] = min;
        }
        System.out.println("Min : "+ min);
    }
}
