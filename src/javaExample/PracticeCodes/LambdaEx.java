package PracticeCodes;

interface MyInterface
{
    void show();
}
@FunctionalInterface
interface Greet
{
    void sayHello(String name);
}
public class LambdaEx
{
    public static void main(String[] args)
    {
        MyInterface obj = ()-> System.out.println("This is lambda!");
        obj.show();

        Greet g = (name) -> System.out.println("Hello "+name);
        g.sayHello("Prashant");
    }
}
