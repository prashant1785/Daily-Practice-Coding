package Collections;

import java.util.LinkedHashSet;

public class LinkedHashSetEx
{
    public static void main(String[] args) {

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(10);
        lhs.add(30);
        lhs.add(20);
        lhs.add(50);
        lhs.add(40);

        System.out.println(lhs);
        lhs.add(60);
        System.out.println(lhs);
        lhs.add(60);
        lhs.add(null);
        lhs.add(null);

        System.out.println(lhs);

    }
}
