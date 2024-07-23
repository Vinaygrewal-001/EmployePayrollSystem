package EmployePayrollSystem;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
//        System.out.println("Enter the name  of Full_time_Employee the Employe");
//        String permanent_employee_name= in.nextLine();
//        System.out.println("Enter the name of Part_time_Employee the Employe");
//        String temporary_employee_name= in.nextLine();
//        System.out.println("Enter the id of the Employe");
//        int id=in.nextInt();
//        System.out.println("Enter the hourlyWork of the Employe");
//        double hourlyWork=in.nextDouble();
//        System.out.println("Enter the hourlyRate of the Employe");
//        double hourlyRate=in.nextDouble();
//        System.out.println("Enter the salary of the Employe");
//        double salary= in.nextDouble();
    Payroll_System ps=new Payroll_System();
    Full_time_Employee fte=new Full_time_Employee("rohit",1,50000);
    Part_time_Employee pte=new Part_time_Employee("rahul",2,1,2);
    ps.addEmployee(fte);
    ps.addEmployee(pte);
        System.out.println("Total employe of the organization");
        ps.allEmploye();
    ps.removeEmployee(1);
       System.out.println("Total employe of the organization");
        ps.allEmploye();
    }
}
