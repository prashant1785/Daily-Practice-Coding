/* Handling Built-in Exceptions
• Create a program that performs division of two numbers.
• Take input for two numbers from the user.
• Handle the following exceptions:
• ArithmeticException (when dividing by zero).
• InputMismatchException (when the user inputs non-numeric values).
• Ensure that the program continues running after an exception by using a loop.
 */
package assignment4;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Que1
{
    public static void div(int num1,int num2)
    {
        try
        {
           int result =  num1/num2;
            System.out.println("Result: "+result);
        }
        catch (ArithmeticException a)
        {
            System.out.println(a);
            System.out.println("Divisible by zero not allowed");
        }
        catch (InputMismatchException i) {
            System.out.println(i);
            System.out.println("Non-numeric values not allowed");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter first number: ");
            int n1 = sc.nextInt();
            System.out.println("Enter second number: ");
            int n2 = sc.nextInt();
            div(n1,n2);
        }
        catch (ArithmeticException a)
        {
            System.out.println(a);
        }
        catch (Exception e) {
            System.out.println(e);
            System.out.println("Non-numeric values not allowed");
        }
        finally {
            System.out.println("Execution Complete");
            sc.close();
        }

    }
}
