package assignment3;
class FinalParameter
{
    public void calSquare(final int num)
    {
        System.out.println("Number is : " + num);
        int square = num*num;
        System.out.println("Square of the number : "+ square);
    }
}
public class Que16
{
    public static void main(String[] args)
    {
        FinalParameter obj = new FinalParameter();
        obj.calSquare(33);
    }
}
