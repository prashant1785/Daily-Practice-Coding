/* Multi-Catch and Finally Block
• Write a program that performs mathematical operations (e.g., addition,
subtraction, division).
• Handle multiple exceptions in a single catch block using the multi-catch
feature:
• ArithmeticException
• NumberFormatException
• Use a finally block to ensure a message (e.g., "Execution Completed") is
always printed, regardless of whether an exception occurs.
 */

package assignment4;

import java.util.Scanner;

public class Que4
{
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);

            try {
                System.out.print("Enter first number: ");
                int num1 = Integer.parseInt(sc.nextLine());    //NumberFormatException

                System.out.print("Enter second number: ");
                int num2 = Integer.parseInt(sc.nextLine());    //NumberFormatException

                System.out.println("Addition: " + (num1 + num2));

                try {
                    System.out.println("Division: " + (num1 / num2));      //ArithmeticException
                }
                catch (ArithmeticException e)
                {
                    System.out.println(e.getMessage() + " : Error: Divisible bye zero not allowed");
                }
                System.out.println("Subtraction: " + (num1 - num2));
                System.out.println("Multiplication: " + (num1 * num2));
            }
            catch (ArithmeticException e)
            {
                System.out.println(e.getMessage() + " : Error: Divisible bye zero not allowed");
            }
            catch (NumberFormatException n)
            {
                System.out.println( n.getMessage() + " : Error: Enter only numeric value");
            }
            catch (Exception e)
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

