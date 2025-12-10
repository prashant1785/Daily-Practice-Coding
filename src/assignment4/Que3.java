/* Custom Exceptions
• Create a custom exception class called InvalidAgeException that extends
Exception.
• Write a program where the user inputs their age. If the age is less than 18,
throw the InvalidAgeException with an appropriate message.
• Use try-catch blocks to handle the custom exception and display a meaningful
message to the user.
 */

package assignment4;

import java.util.Scanner;

class InvalidAgeException extends Exception
{
    InvalidAgeException(String msg)
    {
        super(msg);
    }
}
public class Que3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an age: ");

        try {
            int age = sc.nextInt();
                if (age < 18)
                {
                    throw new InvalidAgeException("Error: Enter an age above 18");
                }
                else
                {
                    System.out.println(age + " :Age is valid. You are eligible.");
                }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage()+" Invalid input. Please enter a valid number");
        }
        finally
        {
            System.out.println("Execution Complete");
            sc.close();
        }
    }
}
