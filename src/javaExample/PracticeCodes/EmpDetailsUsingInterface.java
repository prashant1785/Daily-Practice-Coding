package PracticeCodes;

import java.util.ArrayList;
interface Employee10
{
    public void showEmpDetails();
}
class EmpDetails implements Employee10
{
    public int id;
    public String empName;
    public double salary;

    public EmpDetails(int id, String empName, double salary) {
        this.id = id;
        this.empName = empName;
        this.salary = salary;
    }
    @Override
    public void showEmpDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Salary: " + salary);
    }
}
public class EmpDetailsUsingInterface
{
    public static void main(String[] args) {

        ArrayList<EmpDetails> empList = new ArrayList();
        empList.add(new EmpDetails(101, "Prashant", 34000.500));
        empList.add(new EmpDetails(102, "Rohit", 44000));

        for (EmpDetails emp: empList)
        {
            emp.showEmpDetails();
            System.out.println("-------------------------------------------------");
        }

    }
}
