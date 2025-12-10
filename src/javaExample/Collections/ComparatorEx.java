package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorEx implements Comparator<Roommates01> {
    @Override
    public int compare(Roommates01 r1, Roommates01 r2)
    {
        return r1.name.compareTo(r2.name);
    }
}
class CityComparator implements Comparator<Roommates01>
{
    @Override
    public int compare(Roommates01 r1, Roommates01 r2)
    {
        return r1.city.compareTo(r2.city);
    }
}
class main{
    public static void main(String[] args) {

        ArrayList<Roommates01> list2 = new ArrayList<>();
        list2.add(new Roommates01(345,"Sakshi", "Ravet"));
        list2.add(new Roommates01(245,"Komal", "Pathardi"));
        list2.add(new Roommates01(107,"Shital", "Rahata"));

        Collections.sort(list2, new ComparatorEx());
        list2.forEach(System.out::println);
        System.out.println("------------------------------------------------------------------------");
        Collections.sort(list2, Comparator.comparing(l -> l.city));
        list2.forEach(System.out::println);
        System.out.println("------------------------------------------------------------------------");
        Collections.sort(list2, new CityComparator());
        list2.forEach(System.out::println);
        System.out.println("------------------------------------------------------------------------");


    }
}
