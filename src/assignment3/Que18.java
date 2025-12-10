package assignment3;
/*18. Create an abstract class Shape with an abstract method calculateArea().
Create subclasses Circle and Rectangle that implement calculateArea().
Write a program to calculate the area of a circle and a rectangle using polymorphism.*/

abstract class Shape
{
    abstract double calculateArea();
}
class Circle1 extends Shape
{
    private double radious;

    Circle1(double radious)
    {
        this.radious = radious;
    }
    @Override
    public double calculateArea()
    {
            return Math.PI * radious * radious;
    }
}
class Rectangle1 extends Shape
{
    private double length;
    private double width;

    Rectangle1(double length,double width)
    {
        this.length = length;
        this.width = width;
    }
    @Override
    public double calculateArea()
    {
        return length * width;
    }
}
public class Que18
{
    public static void main(String[] args)
    {
       Shape circle = new Circle1(7.0);
       Shape rectangle = new Rectangle1(5.0,5.0);

        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());

    }
}
