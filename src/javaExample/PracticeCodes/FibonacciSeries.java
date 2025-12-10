package PracticeCodes;

public class FibonacciSeries{
    public static void main(String[] args) {
        int n = 10, a =0, b = 1;

        System.out.println("Fibonacci Series: ");
        System.out.println(a);
        System.out.println(b);

        for (int i = 2; i <= n; i++) {
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}


