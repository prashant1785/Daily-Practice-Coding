package assignment1;

public class AreaCalculator
{
    public static int calculateArea(int length, int width)
    {
        return length * width;
    }

    public static double calculateArea(double radius)
    {
        return Math.PI * radius * radius;
    }
    public static void main(String[] args)
    {

        int length = 10;
        int width = 5;
        int rectangleArea = calculateArea(length, width);
        System.out.println("Area of the rectangle (int values): " + rectangleArea);


        double radius = 7.5;
        double circleArea = calculateArea(radius);
        System.out.println("Area of the circle (double values): " + circleArea);
    }
}
