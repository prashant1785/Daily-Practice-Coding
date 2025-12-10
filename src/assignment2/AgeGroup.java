package assignment2;

public class AgeGroup
{
    public static void checkAgeGroup(int age)
    {
        if(age >= 1 && age <= 12)
            System.out.println(age + " :Child");

        else if(age >= 13 && age <= 19)
            System.out.println(age + " :Teenager");

        else if(age >= 20 && age <= 64)
            System.out.println(age + " :Adult");

        else if(age > 65)
            System.out.println(age + " :Senior");

        else
            System.out.println("Invalid Age");
    }

    public static void main(String[] args)
    {
        int age = 22;
        checkAgeGroup(age);
    }
}
