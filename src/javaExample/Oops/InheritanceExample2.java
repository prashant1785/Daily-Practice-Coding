package Oops;

class Vehicle{      // Example of Hierarchical Inheritance
    public void start()
    {
        System.out.println("Vehicle is start");
    }
}
class Car extends Vehicle
{
    public void model()
    {
        System.out.println("Car model is XUV");
    }
}
class Bike extends Vehicle{
    public void speed()
    {
        System.out.println("Bike speed is 50km/hr");
    }
}
public class InheritanceExample2
{
    public static void main(String[] args) {

        Car obj = new Car();
        obj.start();
        obj.model();

        Bike obj1 = new Bike();
        obj1.start();
        obj1.speed();
    }
}
