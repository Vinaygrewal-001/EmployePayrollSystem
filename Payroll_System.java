package EmployePayrollSystem;

import java.util.ArrayList;
import java.util.List;

public class Payroll_System {
    private ArrayList<Employee> employeeList;

    public Payroll_System(){
        employeeList  =new ArrayList<>() ;
    }

    public void addEmployee(Employee emp)
    {
        employeeList.add(emp);
    }
    public void removeEmployee(int id)
    {
        Employee  employeeRemove=null;
        for(Employee i:employeeList)
        {
         if (i.getId()==id){
             employeeRemove=i;
             break;
         }
         }
        if ( employeeRemove!=null)
        {
            employeeList.remove(employeeRemove);
        }
        else {
            System.out.println("Employe not found");
        }
    }

    public void allEmploye()
    {
        for(Employee i:employeeList){
            System.out.println(i);
            int id = i.getId();
            System.out.println(id);
        }
    }
}
