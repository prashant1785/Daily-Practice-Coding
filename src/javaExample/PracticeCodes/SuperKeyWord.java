package PracticeCodes;
class Animal
{
    int num1 = 100;             //Veriabe
    Animal()              //Constructor
    {
        System.out.println("Animal Constructor");
    }
    public void sound()     //Method
    {
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    int num1 = 50;
    Dog()
    {
        super();
        System.out.println("Dog Constructor");
    }
    public void sound()
    {
        super.sound();
        System.out.println("Dog barks");
        System.out.println("Animal num1: "+ super.num1);
        System.out.println("Dog num1: "+ num1);
    }

}
public class SuperKeyWord
{
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.sound();
    }
}
