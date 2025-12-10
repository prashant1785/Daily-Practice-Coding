package ExceptionHandling;

public class TryAndCatch4
{
    public static void main(String[] args)
    {
        int arr[] = {22,44,66,0};

        try {
            try {                               // Nested try block
                System.out.println(arr[2]);
            }
            catch (ArrayIndexOutOfBoundsException a){
                System.out.println(a);
                System.out.println("Nested try block");
            }

            System.out.println(arr[1]/arr[3]);
        }
        catch (Exception e) {
            System.out.println(e);
            System.out.println("try block");

            try {
                String str = null;
                System.out.println(str.toUpperCase());
            }
            catch (NullPointerException n)              // Nested catch block
            {
                System.out.println("Null value can't be converted");
            }
        }
        finally {
            System.out.println("finally Block");
        }

    }
}
