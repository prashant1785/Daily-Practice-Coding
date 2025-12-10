package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

class Roommates01 implements Comparable<Roommates01>{

    public int id;
    public String name;
    public String city;

    public Roommates01()
    {   }
    public Roommates01(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Roommates01{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
    @Override
    public int compareTo(Roommates01 other)
    {
        return this.id - other.id;
    }
}
public class ComparableEx{
    public static void main(String[] args) {

        ArrayList<Roommates01> list = new ArrayList<>();
        list.add(new Roommates01(101,"Prashant", "Pathardi"));
        list.add(new Roommates01(100,"Avinash", "Shevgaon"));
        list.add(new Roommates01(103,"Ajay", "Mungi"));

        System.out.println("Before Sorting");
        for (Object data: list)
        {
            System.out.println(data);
        }
        Collections.sort(list);
        System.out.println("After Sorting");
        list.forEach(System.out::println);

        System.out.println("------------------------------------------------------------------------");
        System.out.println("Using Comparator");
        Collections.sort(list, Comparator.comparing(l -> l.name));
        list.forEach(System.out::println);



    }
}
