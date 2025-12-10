package assignment2;
import java.util.Scanner;

public class Admission
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int sub1,sub2,sub3;

        System.out.print("Enter marks for Subject 1 (out of 100): ");
       sub1 = sc.nextInt();

        System.out.print("Enter marks for Subject 2 (out of 100): ");
        sub2 = sc.nextInt();

        System.out.print("Enter marks for Subject 3 (out of 100): ");
        sub3 = sc.nextInt();

        int totalMarks = sub1+sub2+sub3;
        double percentage = (totalMarks/300.0)*100;

        int age;
        System.out.print("Enter your age: ");
       age = sc.nextInt();

        if(age >= 18 && percentage >= 75)
            System.out.println("You are eligible for admission.");
        else
        {
            System.out.println("You are not eligible for admission.");
        }
            System.out.println("Your percentage is: " + percentage + "%");

    }
}
