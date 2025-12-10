package ExceptionHandling;

import java.util.Scanner;

class FailException extends Exception
{
    FailException(String name)
    {
        super(name);
    }
}
public class TryAndCatch5
{
    public static void markCheck(int mark) throws FailException
    {
        if(mark > 90)
            System.out.println("A Grade");
        else if (mark > 75)
        {
            System.out.println("B Grade");
        }
        else if (mark > 60)
        {
            System.out.println("C Grade");
        }
        else if (mark > 35)
        {
            System.out.println("D Grade");
        }
        else if (mark < 35)
        {
            throw new FailException("F Grade");
           // System.out.println("F Grade");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an marks: ");
        int marks = sc.nextInt();
        try {
            markCheck(marks);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
