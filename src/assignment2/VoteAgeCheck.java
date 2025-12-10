package assignment2;
import java.util.Scanner;

public class VoteAgeCheck
{
    public static void ageCheck(int age)
    {
        if(age >= 18)
            System.out.println("Eligible to Vote.");
        else
            System.out.println("Not Eligible to Vote.");
    }

    public static void main(String[] args)
    {
        System.out.println("Enter Your Age :");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        ageCheck(age);

        sc.close();
    }

}
