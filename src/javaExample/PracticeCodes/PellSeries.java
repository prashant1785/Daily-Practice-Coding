package PracticeCodes;

public class PellSeries {
    public static void main(String[] args) {

        int n = 10, a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            int c = 2 * b + a;
            System.out.println(b);
            a = b;
            b = c;
        }
    }
}
