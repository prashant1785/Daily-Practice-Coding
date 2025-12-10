package PracticeCodes;

import java.util.Scanner;

public class ElectricityBillCalculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an units: ");
        int units = sc.nextInt();
        int cost = 0;
        if (units > 0 && units <= 100)
        {
            cost = units * 100;
            System.out.print("Electricity Bill is: "+cost);
        }
        else if (units > 100 && units <= 300 )
        {
            cost = 100 * 10 +(units - 100)* 15;
            System.out.print("Electricity Bill is: "+cost);
        }
        else if (units > 300)
        {
            cost = 100*10 + 200*15 +(units - 300)*25;
            System.out.print("Electricity Bill is: "+cost);
        }
        else
        {
            System.out.println("Enter valid Units");
        }
    }
}
