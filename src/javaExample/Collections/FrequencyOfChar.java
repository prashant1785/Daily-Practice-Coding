package Collections;

import java.util.*;

public class FrequencyOfChar {
    public static void main(String[] args) {

        String str = "Mahabharata";
        str = str.toLowerCase();

        HashMap<Character,Integer> freq = new HashMap<>();
        for (char data: str.toCharArray()){
            freq.put(data,freq.getOrDefault(data,0)+1);
        }
        for (Map.Entry<Character, Integer> map: freq.entrySet()){
            System.out.println(map.getKey()+" -> "+map.getValue());
        }
    }
}
