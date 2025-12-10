package assignment3;
/*20. Create a base class Employee with a method getRole() that returns "Employee".Create
subclasses Manager and Developer that override getRole() to return "Manager" and
"Developer", respectively.
Write a program to demonstrate dynamic method dispatch using an array of Employee
objects.*/

class Employee1
{
    public String getRole()
    {
        return "Employee1";
    }
}
class Manager1 extends Employee1
{
    @Override
    public String getRole()
    {
        return "Manager1";
    }
}
class Developer1 extends Employee1
{
    @Override
    public String getRole()
    {
        return "Developer1";
    }
}
public class Que20
{
    public static void main(String[] args)
    {
        Employee1 employee1[] = new Employee1[3];

        employee1[0] = new Employee1();
        employee1[1] = new Manager1();
        employee1[2] = new Developer1();

        for (Employee1 data : employee1)
        {
            System.out.println("Role : " + data.getRole());
        }
    }
}
