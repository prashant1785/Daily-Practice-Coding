package assignment3;
// Write a program to demonstrate the use of a final variable. Create a class Circle with a
//final variable PI (value = 3.14) and a method calculateArea() that calculates the area of a
//circle. Attempt to modify the PI value and observe what happens.

class Circle
{
    final double PI = 3.14;

    public double calculateArea(double radius)
    {
        return PI * radius * radius;
    }
}
public class Que12
{
    public static void main(String[] args)
    {
        Circle circle = new Circle();
        double radius = 10.0;
        double area = circle.calculateArea(radius);
        System.out.println("Area of the Circle : " + area);
        System.out.println("Area of the Radius : " + radius);

    }
}
