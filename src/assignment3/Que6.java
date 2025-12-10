package assignment3;
import java.util.Scanner;
                           //Grade System
public class Que6
{
    public static void main(String[] args)
    {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Grade");
        ch = sc.next().charAt(0);

        switch (ch)
        {
            case 'A' :
                System.out.println("Excellent!");
                break;
            case 'B' :
                System.out.println("Good job!");
                break;
            case 'C' :
                System.out.println("Fair!");
                break;
            case 'D' :
                System.out.println("Needs improvement!");
                break;
            case 'F' :
                System.out.println("Fail!");
                break;
            default :
                System.out.println("Invalid Grade");
        }
        sc.close();
    }
}
