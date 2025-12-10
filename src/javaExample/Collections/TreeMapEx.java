package Collections;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapEx
{
    public static void main(String[] args)
    {
        TreeMap<Integer,String> tm = new TreeMap<>();

        tm.put(10,"ten");
        tm.put(2,"two");
        tm.put(8,"eight");
        tm.put(7,"seven");
        tm.put(1,"one");
        tm.put(20,null);        //null value allowed
        System.out.println(tm.get(20));
       // tm.put(null,"zero");      null key not allowed

//        System.out.println(tm);
//        System.out.println(tm.pollFirstEntry());
//        System.out.println(tm.firstEntry());
//        System.out.println(tm);
//        NavigableMap<Integer, String> integerStringNavigableMap = tm.descendingMap();
//        System.out.println(integerStringNavigableMap);

        System.out.println(tm.entrySet());
        System.out.println(tm.values());
        System.out.println(tm.keySet());

        for (Map.Entry<Integer, String> map: tm.entrySet()){
            System.out.println(map.getKey()+" -> "+ map.getValue());
        }
    }
}
