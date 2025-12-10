package PracticeCodes;

import java.util.*;

public class SecondMax {
    public static void main(String[] args) {

        int [] arr = {23,54,66,87,23,66};
        ArrayList<Integer> list = new ArrayList<>();
//        List<Integer> list = Arrays.asList(arr);
//        Set<Integer> set = new LinkedHashSet<>(list);
//        ArrayList<Integer> list1 = new ArrayList<>(set);

        for (int data: arr){
            if (!list.contains(data))
               list.add(data);
        }
        Collections.reverse(list);
        System.out.println(list);
        System.out.println("Second Max: "+ list.get(1));
    }
}







