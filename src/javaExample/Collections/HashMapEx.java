package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx
{
    public static void main(String[] args) {

        HashMap<String,Integer> hm = new HashMap<>();

        hm.put("Pune",12);
        hm.put("AhilyaNagar",16);
        hm.put("Beed",23);
        hm.put("Chh.Sambhaji Nagar",26);
        hm.put("Mumbai",04);
        hm.put("Sangli",18);
        hm.put(null,11);    //Only one null key allowed



        System.out.println(hm);
        System.out.println(hm.get("Pune"));
        System.out.println("Size of HashMap: "+hm.size());
        System.out.println("Key contains or not: "+hm.containsKey("Satara"));
        System.out.println("Value contains or not: "+hm.containsValue(16));

        System.out.println("Element retrive by iterator");
        for (Map.Entry<String,Integer> map : hm.entrySet())
        {
            System.out.println(map.getKey() + " "+ map.getValue());
        }
        System.out.println(hm.values());
        System.out.println(hm.keySet());
        System.out.println(hm.get(12)); // This key not contains
        System.out.println(hm.get("AhilyaNagar"));
    }
}
