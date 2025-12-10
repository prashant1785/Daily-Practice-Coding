package ExceptionHandling;

import java.util.Scanner;

public class UncheckedExceptions
{
    public static void checkNullPointerException(String str)    //NullPointerException
    {
        try {
            System.out.println("String is not null: "+str.toUpperCase());
        }catch (NullPointerException n)
        {
            System.out.println("Null String are not allowed: "+n.getMessage());
        }
    }
    public static void checkArithmeticException(int x, int y)
    {
        try {
            int result = x/y;
            System.out.println("Result: "+result);
        } catch (ArithmeticException a) {
            System.out.println("Divide by zero not allowed: "+a);
        }
    }
    public static void checkArrayIndexOutOfBoundsException(int [] arr)
    {
        try {
            System.out.println("Get second element: "+ arr[1]);
            System.out.println("Get element out of array: "+ arr[10]);
        }catch (ArrayIndexOutOfBoundsException a)
        {
            System.out.println("Get element below index 4: "+a);
        }
    }
    public static void checkIllegalArgumentException(int age)
    {
            if (age < 1) {
                throw new IllegalArgumentException("Enter age above 0");
            }
        System.out.println("Age is valid: "+ age);
    }
    public static void checkNumberFormatException(String str)
    {
        try{
            int num = Integer.parseInt(str);
            System.out.println("String converted: "+ num);
        }catch (NumberFormatException n)
        {
            System.out.println("Invalid TypeCasting: "+ n);
        }
    }
    public static void checkClassCastException(Object obj)
    {
        try{
            Integer number = (Integer) obj;
            System.out.println("No Exception: "+ number);
        } catch (ClassCastException c) {
            System.out.println("Invalid TypeCasting: "+ c);
        }
    }


    public static void main(String[] args)
    {
        String str = "Prashant";
        checkNullPointerException(str);

        int num1 = 20;
        int num2 = 0;
        checkArithmeticException(num1, num2);

        int [] arr = {1,20,56,60,30};
        checkArrayIndexOutOfBoundsException(arr);

        int setAge = 10;
        try {
            checkIllegalArgumentException(setAge);
        }catch (IllegalArgumentException i)
        {
            System.out.println(i.getMessage());
        }
        String string = "12345";
        checkNumberFormatException(string);

        Object object = "Hello";
        checkClassCastException(object);
    }
}
