package stringExample;

import java.util.Arrays;
import java.util.Comparator;

public class StringSortByLength
{
    public static void main(String[] args)
    {
        String str = "Hello I am Prashant";
        String [] aceOrder = str.split(" ");
        String [] decOrder = str.split(" ");

        Arrays.sort(aceOrder, Comparator.comparingInt(String::length));
        Arrays.sort(decOrder,Comparator.comparingInt(String::length).reversed());

        for (String ace: aceOrder)
        {
            System.out.print(ace+" ");
        }
        System.out.println();
        for (String dec: decOrder)
        {
            System.out.print(dec+" ");
        }
    }
}
