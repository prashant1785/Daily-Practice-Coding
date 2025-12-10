package PracticeCodes;

import java.util.*;

class EmpInfo{
     int empId;
     String empName;
     double empSalary;

    EmpInfo(int empId, String empName, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }
    @Override
    public String toString() {
        return "LargeSalaryFindInClass{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSalary=" + empSalary +
                '}';
    }
}
public class LargeSalaryFindInClass {

    public static void main(String[] args) {
        ArrayList<EmpInfo> empList = new ArrayList<>();
        empList.add(new EmpInfo(101,"Mahajan", 36000));
        empList.add(new EmpInfo(102,"Domkawale", 29500));
        empList.add(new EmpInfo(101,"Patil", 21000));

        EmpInfo maxSalary = empList.get(0);
        for (EmpInfo e: empList)
        {
            if (e.empSalary > maxSalary.empSalary)
                maxSalary.empSalary = e.empSalary;
        }
        System.out.println("Employee with the Highest Salary: "+ maxSalary);

        Map<Integer,Integer> idCnt = new HashMap<>();
        for (EmpInfo e: empList)
        {
            idCnt.put(e.empId, idCnt.getOrDefault(e.empId, 0)+ 1);
        }

        Set<Integer> printed = new HashSet<>();
        for (EmpInfo emp: empList) {
            if (idCnt.get(emp.empId) > 1 && !printed.contains(emp.empId)) ;{
                System.out.println("Duplicate ID: " + emp.empId);

                for (EmpInfo e : empList) {
                    if (e.empId == emp.empId) {
                        System.out.println(" → " + e);
                    }
                }
                System.out.println(emp.empId);
            }
        }

    }
}
