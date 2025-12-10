package assignment2;

import java.util.Scanner;

public class studentsScore
{
    public static void studentGrade(int marks)
    {
        if(marks >= 90)
            System.out.println("Marks: "+marks+" :Grade A");

        else if(marks >= 80 && marks <= 89)
            System.out.println("Marks: "+marks+" :Grade B");

        else if(marks >= 70 && marks <= 79)
            System.out.println("Marks: "+marks+" :Grade C");

        else if(marks >= 60 && marks <= 69)
            System.out.println("Marks: "+marks+" :Grade D");

        else
            System.out.println("Marks: "+marks+" :Fail");
    }
    public static void main(String[] args)
    {
        System.out.println("Enter your Marks:");
        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();
        studentGrade(mark);

        sc.close();
    }
}
