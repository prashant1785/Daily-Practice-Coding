package PracticeCodes;

import java.util.Scanner;

public class convertSecondsToHours
{
    public static void convertSecondsToHours1(int totelSec)
    {
        int hrs = totelSec/3600;
        int remsec = totelSec%3600;

        int min = remsec/60;
        int sec1 = remsec%60;

        System.out.println("Hours: "+ hrs);
        System.out.println("Minutes: "+ min);
        System.out.println("Sec: "+ sec1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a totalSeconds: ");
        int sec = sc.nextInt();

        convertSecondsToHours1(sec);

        sc.close();
    }
}
