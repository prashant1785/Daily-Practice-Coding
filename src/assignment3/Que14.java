package assignment3;
/*Write a program to demonstrate that a final class cannot be extended. Create a final
class MathUtils with a method add(int a, int b).
Attempt to create a subclass AdvancedMathUtils that extends MathUtils, and explain the
resulting error.*/

final class MathUtils
{
    public int add(int a,int b)
    {
        return a+b;
    }
}
        //final class cannot be extended by any other class
/*class AdvancedMathUtils extends MathUtils
{
    public int sub(int a,int b)
    {
        return a-b;
    }
}*/
public class Que14
{
    public static void main(String[] args)
    {
        MathUtils au = new MathUtils();
       int addResult = au.add(3,4);
     //  int subResult = au.sub(4,2);

        System.out.println("Addition : "+addResult);
       // System.out.println("Subtraction : "+subResult);
    }
}

      //  In Java, a final class cannot be extended by any other class.
//If you attempt to extend a final class, the compiler will throw an error.
