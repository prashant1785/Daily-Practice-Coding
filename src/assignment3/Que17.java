package assignment3;
/*17. Create a base class Animal with a method makeSound() that prints "Animal makes a
sound".
Create subclasses Dog, Cat, and Cow that override the makeSound() method to print their
respective sounds ("Dog barks", "Cat meows", "Cow moos").
Write a program to demonstrate runtime polymorphism by storing these objects in an
array of Animal type and calling makeSound().*/

class Animal1
{
    public void makeSound()
    {
        System.out.println("Animal makes a sound!");
    }
}
class Dog1 extends Animal1
{
    @Override
    public void makeSound()
    {
        System.out.println("Dog Braks");
    }
}
class Cat1 extends Animal1
{
    @Override
    public void makeSound()
    {
        System.out.println("Cat Meows");
    }
}
class Cow1 extends Animal1
{
    @Override
    public void makeSound()
    {
        System.out.println("Cow Moos");
    }
}
public class Que17
{
    public static void main(String[] args)
    {
        Animal1 [] animal = new Animal1[3];

        animal [0] = new Dog1();
        animal [1] = new Cat1();
        animal [2] = new Cow1();

        for (Animal1 data : animal )
        {
            data.makeSound();
        }
    }
}
