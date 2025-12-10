package ExceptionHandling;

import PracticeCodes.Gto;
import java.util.Scanner;

class InvalidAgeException extends Exception
{
    InvalidAgeException()
    {
        super();
    }
}
public class CustumException {
    public void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException();
        }
        System.out.println("Age is valid: " + age);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int setAge = sc.nextInt();

        CustumException obj = new CustumException();
        try {
            obj.checkAge(setAge);
        } catch (InvalidAgeException e) {
            System.out.println("Enter age above 18: " + e);
        }


    }
}
