package Collections;

import java.util.Collections;
import java.util.HashSet;

public class CommonElementsHashSet
{
    public static void main(String[] args) {

        HashSet<Integer> hs1 = new HashSet<>();
        Collections.addAll(hs1,10,30,50,20,60,70,100);

        HashSet<Integer> hs2 = new HashSet<>();
        Collections.addAll(hs2,10,80,50,20,40,90,100);
        System.out.println(hs1);
        System.out.println(hs2);

        HashSet<Integer> commonEle = new HashSet<>(hs1);

        commonEle.retainAll(hs2);
        System.out.println(commonEle);

    }
}
