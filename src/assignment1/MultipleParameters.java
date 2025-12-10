package assignment1;
/*16. Method with Multiple Parameters:
 Write a method called calculateArea that takes two parameters: length
(double) and width (double). This method should calculate and return the area of
a rectangle.
 Test this method by calling it with different values of length and width.*/

public class MultipleParameters
{
    public static double calculateArea(double length,double width)
    {
        return length*width;
    }
    public static void main(String[] args) {

        double area1 = calculateArea(5.90, 7.40);
        double area2 = calculateArea(4.60, 3.70);
        double area3 = calculateArea(1.70, 2.30);

        System.out.println("Area of rectangle 1: " + area1);
        System.out.println("Area of rectangle 2: " + area2);
        System.out.println("Area of rectangle 3: " + area3);

    }
}
