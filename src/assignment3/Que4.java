package assignment3;

import java.util.Scanner;

//Simple Calculator
public class Que4
{
    public static void main(String[] args)
    {
        double num1,num2,result = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st Number : ");
        num1 = sc.nextDouble();
        
        System.out.println("Enter 2st Number : ");
        num2 = sc.nextDouble();

        System.out.println("Enter an Operator : ");
        char operator = sc.next().charAt(0);

        switch (operator)
        {
            case '+' :
                result = num1 + num2;
                break;
            case '-' :
                result = num1 - num2;
                break;
            case '*' :
                result = num1 * num2;
                break;
            case '%' :
                result = num1 % num2;
                break;
            case '/' :
                if(num2 != 0)
                result = num1 / num2;
                else
                    System.out.println("Division by zero is not allowed");
                break;
            default:
                System.out.println("Invalid Operator");
        }
        System.out.println("Result: " + result);
        sc.close();

    }
}
