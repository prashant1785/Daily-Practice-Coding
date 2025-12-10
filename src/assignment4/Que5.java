/*Throw and Throws
• Write a method called checkEligibility that takes an age as a parameter and:
• Throws an IllegalArgumentException if the age is less than 0.
• Throws a custom exception SeniorCitizenException if the age is greater than
100.
• Use throws in the method signature and handle these exceptions in the main
method.
 */

package assignment4;
import java.util.Scanner;

public class Que5 {
    public static void checkEligibility(int age) throws IllegalArgumentException, SeniorCitizenException
    {
        if (age < 0)
        {
            throw new IllegalArgumentException("IllegalArgumentException : Enter an age above zero");
        }
        else if (age > 100)
        {
            throw new SeniorCitizenException("SeniorCitizenException : Enter an age below 100");
        }
        else
        {
            System.out.println(age + " :Age is valid. You are eligible.");
        }

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter an age : ");
       try {
           int age = sc.nextInt();
           checkEligibility(age);
       }
       catch (SeniorCitizenException s)     //the age is greater than 100
       {
           System.out.println("Error: " + s.getMessage());
       }
       catch (IllegalArgumentException i)   //the age is less than zero
       {
           System.out.println("Error: " + i.getMessage());
       }
       catch (Exception e)                //Unwanted errors
       {
           System.out.println("Error: " + e.getMessage());
       }
       finally
       {
           System.out.println("Execution Completed");
           sc.close();
       }
    }
}
    class SeniorCitizenException extends Exception      //Create class for user defined exception
    {
        public SeniorCitizenException(String seniorCitizenException)
        {
                super(seniorCitizenException);
        }
    }


