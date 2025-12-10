package PracticeCodes;

import java.util.Arrays;

public class MainMethodOverload
{
    public static void main(String[] args) {
        System.out.println("Main Method");
        int [] intaArr = {12,3335,6};
       main(args,intaArr);
       main(args, intaArr, "Prashant");

    }
    public static void main(String[] args, int [] intaArr) {
        System.out.println("Overload main method..1");
        System.out.println(Arrays.toString(intaArr));
    }
    public static void main(String[] args, int [] intaArr, String name) {
        System.out.println("Overload main method..2");
        System.out.println(Arrays.toString(intaArr)+" "+name);

    }
}
