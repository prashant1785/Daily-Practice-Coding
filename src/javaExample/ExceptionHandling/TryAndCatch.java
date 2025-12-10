package ExceptionHandling;

public class TryAndCatch {
    public static void main(String[] args)
    {
        int[] arr = {3, 6, 8, 9, 4,0};

        try
        {
                System.out.println(arr[6]);  //ArrayIndexOutOfBoundsException
        }
        catch(Exception e)
        {
            System.out.println(e);
            System.out.println("Enter number below 5");
        }
        try
        {
            int result = arr[2]/arr[5];   //ArithmeticException
            System.out.println("Result : "+result);
        }
        catch (Exception e)
        {
            System.out.println(e);
            System.out.println("Error: Division by zero is not allowed.");
        }
        System.out.println("End Point");
    }
}
