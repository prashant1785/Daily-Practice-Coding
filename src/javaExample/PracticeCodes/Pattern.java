package PracticeCodes;

public class Pattern {
    public static void main(String[] args) {

        int end = 1;
        for (int i = 1; i <= 9; i++) {
            char A = 'A';
            for (int j = 1; j <= end; j++) {
                    System.out.print(A + " ");
                    A++;
            }
            System.out.println();
            if (i<5)
                end++;
            else end--;
        }
    }
}
