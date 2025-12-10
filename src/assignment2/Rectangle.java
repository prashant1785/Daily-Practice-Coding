package assignment2;

public class Rectangle
{
    double leftLength;
    double rightLength;
    double topLength;
    double bottomLength;

    public void setRectangle(double left,double rigth,double top,double bottom)
    {
        this.leftLength = left;
        this.rightLength = rigth;
        this.bottomLength = bottom;
        this.topLength = top;
    }
    public double getWidth()
    {
       return leftLength - rightLength;
    }
    public double getHeight()
    {
        return bottomLength - topLength;
    }
    public double getArea()
    {
        return getWidth() * getHeight();
    }
    public double getPerimeter()
    {
        return 2 * (getWidth() + getHeight());
    }
    public void showRectangle()
    {
        System.out.println("Width: " + getWidth());
        System.out.println("Height: " + getHeight());
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }

    public static void main(String[] args)
    {
        Rectangle rect = new Rectangle();
        rect.setRectangle(3,5,7,8);
        rect.showRectangle();

    }
}
