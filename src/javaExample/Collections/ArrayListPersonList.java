package Collections;

import java.util.ArrayList;

public class ArrayListPersonList
{
    public static void main(String[] args) {

        ArrayList al = new ArrayList<>();

        al.add(new PersonTest("Prashant",22,"Pathardi"));
        al.add(new PersonTest("Avinash",23,"Shevgaon"));
        al.add(new PersonTest("Ajay",23,"Mungi"));
        al.add(new PersonTest("Krushna",21,"Pathardi"));
        al.add(new PersonTest("Mayur",25,"Shevgaon"));

        System.out.println(al);
    }
}
