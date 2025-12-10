package assignment3;
/*19. Create an interface Vehicle with a method move().
Create classes Car, Bicycle, and Boat that implement the Vehicle interface and provide
their own implementation of the move() method.
Write a program to demonstrate polymorphism using the Vehicle interface.*/

interface Vehicle1
{
    void move();
}
class Car1 implements Vehicle1
{
    @Override
    public void move()
    {
        System.out.println("Im in class Car1");
    }
}
class Bicycle1 implements Vehicle1
{
    @Override
    public void move()
    {
        System.out.println("Im in class Bicycle1");
    }
}
class Boat1 implements Vehicle1
{
    @Override
    public void move()
    {
        System.out.println("Im in class Boat1");
    }
}
public class Que19
{
    public static void main(String[] args)
    {
        Vehicle1 [] vehicle1s = new Vehicle1[3];

        vehicle1s[0] = new Car1();
        vehicle1s[1] = new Bicycle1();
        vehicle1s[2] = new Boat1();

        for (Vehicle1 data : vehicle1s)
        {
            data.move();
        }
    }
}
