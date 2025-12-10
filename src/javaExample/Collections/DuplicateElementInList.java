package Collections;

import java.util.*;

public class DuplicateElementInList
{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"Apple","Banana","Apple","Mango");

        Set<String> unique = new HashSet<>();
        Set<String> duplicate = new HashSet<>();

        for (String data: list)
        {
            if (!unique.add(data))
            {
                duplicate.add(data);
            }
        }
        System.out.println(list);
        System.out.println(duplicate);
    }
}
