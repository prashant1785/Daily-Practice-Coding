package assignment3;
/*15. Create a class Person with attributes name and a method displayInfo().
Create a subclass Employee with an attribute employeeId and override displayInfo().
Create another subclass Manager that adds an attribute department and uses the super
keyword to access methods from both Employee and Person.*/

class Person
{
  private String name;
    Person(String name)
    {
        this.name = name;
    }
    public void displayInfo()
    {
        System.out.println("Name : "+ name);
    }
}
class Employee extends Person
{
    private int employeeId;

    Employee(String name,int employeeId)
    {
        super(name);
        this.employeeId = employeeId;
    }
    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("EmployeeId : "+ employeeId);
    }
}
class Manager extends Employee
{
    private String department;

    Manager(String department,String name,int employeeId)
    {
        super(name, employeeId);
        this.department = department;
    }

    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Department : "+department);
    }
}

public class Que15
{
    public static void main(String[] args)
    {
        Person person = new Person("Prashant");
        person.displayInfo();

        Employee employee = new Employee("Prashant", 101);
        employee.displayInfo();

        Manager manager = new Manager("IT","Prashant",101);
        manager.displayInfo();
    }
}
