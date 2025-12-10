package assignment3;
/*22. Create an interface Operation with a method performOperation().
Create classes Addition, Subtraction, and Multiplication that implement the Operation
interface.
Write a program to store objects of these classes in a List and invoke performOperation()
using a loop.*/

import java.util.ArrayList;
import java.util.List;

interface Operation
{
    int performOperation(int a,int b);
}
class Addition implements Operation
{
    @Override
    public int performOperation(int a, int b) {
        return a+b;
    }
}
class Subtraction implements Operation
{
    @Override
    public int performOperation(int a, int b) {
        return a-b;
    }
}
class Multiplication implements Operation
{
    @Override
    public int performOperation(int a, int b) {
        return a*b;
    }
}
public class Que22
{
    public static void main(String[] args)
    {
        Operation addition = new Addition();
        Operation subtraction = new Subtraction();
        Operation multiplication = new Multiplication();

        List<Operation> operations = new ArrayList<>();
        operations.add(addition);
        operations.add(subtraction);
        operations.add(multiplication);

        int num1 = 10;
        int num2 = 20;

        for (Operation data : operations)
        {
            System.out.println(data.performOperation(num1,num2));
        }
    }
}
