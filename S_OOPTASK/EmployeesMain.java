class Employee{
    public void work(){
        System.out.println("Employee is working");
    }

    public double getSalary(){
        return 50000;
    }
}

class HRManager extends Employee {
    @Override
    public void work(){
        System.out.println("HR Manager is managing recruitment");
    }
}

public class EmployeesMain {
    public static void main(String[] args) {
        HRManager hr = new HRManager();
        hr.work();
        System.out.println("Salary: " +hr.getSalary());
    }
}