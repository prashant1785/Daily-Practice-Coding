package stringExample;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeSet;

public class UniqueChar
{
    public static void main(String[] args)
    {
        String str = "Mahabharata";

        for (int i = 0; i < str.length(); i++)
        {
            int cnt = 0;
            for (int j = 0; j < i; j++)
            {
                if(str.charAt(i) == str.charAt(j))
                   cnt++;
            }
            if(cnt==0)
                System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
//----------------------------------------------------------------------------------------------------
        String str1 = "Mahabharata";

        LinkedHashSet<Character> uniqueChar = new LinkedHashSet<>();

        for(char data : str1.toCharArray())
        {
            if (data != ' ')
            uniqueChar.add(data);
        }
        System.out.println(uniqueChar);
        //----------------------------------------------------------------------------------------------------
        String str2 = "Mahabharata".toLowerCase();

        LinkedHashMap< Character, Integer> lhs = new LinkedHashMap<>();

        for (char data: str.toCharArray() ){
            lhs.put(data,lhs.getOrDefault(data,0)+1);
        }
        for (Map.Entry<Character,Integer>map: lhs.entrySet()){
            if (map.getValue() == 1)
            {
                System.out.print(map.getKey()+" ");
            }
        }
    }
}
