package arrayExample;

public class SumOfArray
{
    public static void main(String[] args)
    {
        int arr[] = {-20,4,-5,3,-2,4,6,77,-65,3};

        int sum=0;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i]>0)
                sum+=arr[i];
        }
        System.out.print("Sum of positive number : "+sum);
    }
}
