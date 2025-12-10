package PracticeCodes;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        int cnt = 0;
        for (int i = 2; i < num; i++)
        {
            if(num % i == 0)
                cnt++;
        }
        if(cnt == 0)
            System.out.println(num + " is prime number");
        else {
            System.out.println(num + " is not prime number");
        }
        sc.close();
    }
}


