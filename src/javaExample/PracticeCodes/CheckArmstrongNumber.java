package PracticeCodes;

public class CheckArmstrongNumber {
    public static void main(String[] args) {
        int num = 999, sum = 0, temp = num;

        while (temp != 0){
            int digit = temp % 10;
            sum += Math.pow(digit, 3);
            temp/= 10;
        }
        if(num == sum)
        System.out.println("Number is Armstrong");
        else
        System.out.println("Number is not Armstrong");
    }
}
