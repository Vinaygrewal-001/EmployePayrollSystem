package EmployePayrollSystem;

public class Full_time_Employee extends Employee {

    private double salary;
    public Full_time_Employee(String name, int id,double salary) {
        super(name, id);
        this.salary=salary;
    }

    @Override
    public double calculateSalary() {

        return salary;
    }

}
