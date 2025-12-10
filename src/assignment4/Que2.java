/* Checked and Unchecked Exceptions
• Write a program that reads a file from the disk.
• Prompt the user for the file path.
• Handle the following exceptions:
• FileNotFoundException (checked exception).
• IOException (checked exception).
• If the file is successfully read, print its content to the console.
• Add logic to handle NullPointerException (unchecked exception) if the file
object is null.
 */

package assignment4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Que2
{
    public static void readAndPrintFile(File file) throws IOException
    {
        try (Scanner fileScanner = new Scanner(file))
        {
            System.out.println("File content:");
            while (fileScanner.hasNextLine())
            {
                System.out.println(fileScanner.nextLine());
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter the file path: ");
                String filePath = scanner.nextLine();

                if (filePath.equalsIgnoreCase("exit"))
                {
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                }
                File file = new File(filePath);

                if (file == null)
                {
                    throw new NullPointerException("File object is null");     //unchecked exception
                }
                readAndPrintFile(file);

            } catch (FileNotFoundException e)    //checked exception
            {
                System.out.println("Error: The file was not found");
            }
            catch (IOException e)               //checked exception
            {
                System.out.println("Error: An I/O error occurred while reading the file");
            }
            catch (NullPointerException e)          //Unchecked exception
            {
                System.out.println("Error: " + e.getMessage());
            }
            catch (Exception e)
            {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        }
        scanner.close();
    }
}


