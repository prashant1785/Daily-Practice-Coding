package PracticeCodes;

import java.util.Scanner;

public class ScholarshipEligibilityCheck
{
    static void checkScore(int score)
    {
        if (score >= 90 && score <= 100)
        {
            System.out.println("Score :" + score + " :Eligible for scholarship");
        }
        else if (score > 100)
        {
            System.out.println("Enter an score below 100");
        }
        else
        {
            System.out.println("Score :" + score + " :Not eligible for scholarship");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your score: ");
        int score = sc.nextInt();

        checkScore(score);
    }
}
