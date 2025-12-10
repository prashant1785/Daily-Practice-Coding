package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx
{
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        map.put("Prashant",22);
        map.put("Avinash",23);
        map.put("Krushna",21);
        map.put("Om",20);
        map.put("Ajay",23);

        System.out.println(map);    //Insertion order maintain
        System.out.println(map.containsValue(22));

        for (Map.Entry<String,Integer> data : map.entrySet())
        {
            if (data.getValue() > 22)
            {
                System.out.println(data);
            }
        }

    }
}
