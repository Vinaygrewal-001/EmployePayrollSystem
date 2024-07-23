package EmployePayrollSystem;

public class Part_time_Employee extends Employee{
    private double hourlyWork;
    private double hourlyRate;
    public Part_time_Employee(String name, int id ,double hourlyWork,double hourlyRate) {
        super(name, id);
        this.hourlyWork=hourlyWork;
        this.hourlyRate=hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hourlyWork*hourlyRate;
    }
}
