package Oops;

class GrandParent{       // Example of Multilevel Inheritance
    public void showGrandParent()
    {
        System.out.println("I am GrandParent");
    }
}
class Parent extends GrandParent{
    public void showParent()
    {
        System.out.println("I am Parent");
    }
}
class Child extends Parent{
    public void showChild()
    {
        System.out.println("I am Child");
    }
}

public class InheritanceExample3
{
    public static void main(String[] args) {

        Child child = new Child();
        child.showGrandParent();
        child.showParent();
        child.showChild();
    }
}
