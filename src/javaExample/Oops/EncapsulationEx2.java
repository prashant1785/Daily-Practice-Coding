package Oops;

import java.util.Scanner;

public class EncapsulationEx2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        EncapsulationEx1 ex1 = new EncapsulationEx1();

        System.out.println("Enter Student Name: ");
        String name = sc.next();

        System.out.println("Enter Student Marks: ");
        int stuMarks = sc.nextInt();

        ex1.setStuName(name);
        ex1.setMarks(stuMarks);

    }

}
