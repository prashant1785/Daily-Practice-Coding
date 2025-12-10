package PracticeCodes;

@FunctionalInterface
interface Addable {
    int add(int a, int b);
}
public class SumUsingLambda {
    public static void main(String[] args) {
        Addable sum = (a, b) -> a + b;

        System.out.println("Sum: " + sum.add(10, 20));
    }
}
