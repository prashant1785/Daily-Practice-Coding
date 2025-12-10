package stringExample;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class commonChar
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an name: ");

        String input = sc.nextLine();
        input = input.toLowerCase();

        LinkedHashSet<Character> name = new LinkedHashSet<>();
        LinkedHashSet<Character> duplicates = new LinkedHashSet<>();

        for (char ch : input.toCharArray())
        {
            if (!name.add(ch))
            {
                duplicates.add(ch);
            }
        }
        if (duplicates.isEmpty())
            System.out.println("No duplicates found");
        else{
            System.out.println("Duplicates: "+duplicates);}

        sc.close();
     //----------------------------------------------------------------------------------------
        String str1 = "xyssz";
        String str2 = "xZqSs";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        List<Character> commonChar = new ArrayList<>();
        List<Character> list = new ArrayList<>();

        for (char data : str1.toCharArray()) {
            list.add(data);
        }
        for (char data : str2.toCharArray()) {
            if (list.contains(data))
                commonChar.add(data);
        }

        System.out.println(commonChar);
    }
}
