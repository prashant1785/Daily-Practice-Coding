package PracticeCodes;

public class PersonOverloading
{ // The real time example of Compile-time and Method Overloading in Polymorphism.

    public void intrdouce()
    {
        System.out.println("Hi, I am a person.");
    }
    public void intrdouce(String name)
    {
        System.out.println("Hi, my name is " + name + ".");
    }
    public void intrdouce(String name,int age)
    {
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
    }
    public void intrdouce(String name,int age,String jobRole)
    {
        System.out.println("Hi, I'm " + name + ", " + age + " years old, and I work as a "+jobRole+". ");
    }
    public static void main(String[] args)
    {
        PersonOverloading personOverloading = new PersonOverloading();
        personOverloading.intrdouce();
        personOverloading.intrdouce("Sakshi");
        personOverloading.intrdouce("Sakshi",24);
        personOverloading.intrdouce("Sakshi",24,"Software Developer");
    }
}
