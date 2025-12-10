package Oops;

class A
    {
    public void showA()
       {
        System.out.println("class Oops.A");
       }
    }
    class B extends A
        {
            public void showB()
            {
                System.out.println("class Oops.B");
            }
        }
public class InheritanceExample1
{
    public static void main(String[] args)
    {
        B b = new B();
        b.showA();
        b.showB();
    }
}
