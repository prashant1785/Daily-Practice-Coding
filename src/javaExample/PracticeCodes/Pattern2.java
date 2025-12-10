package PracticeCodes;

public class Pattern2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if(i == 1 || i == 9 || j==1 || j==9||i+j == 7
                        ||i-j==3||j-i==3||i+j==13)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
