// Write a Java program to create a class called "Employee" with a name, job title, and salary attributes, and methods to calculate and update salary.Add commentMore actions


public class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    // constructor
    public Employee(String name, String jobTitle, double salary){
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    // setter
    public void setName(String name){
        this.name = name;
    }
    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }

    // getter
    public String getName(){
        return name;
    }
    public String getJobTitle(){
        return jobTitle;
    }
    public double getSalary(){
        return salary;
    }
    public void updateSalary(double percentage) {
        salary += salary * (percentage / 100);
    }

    // method to display info
    public void displayinfo(){
        System.out.println("Name: " + getName());
        System.out.println("Job Title: " + getJobTitle());
        System.out.println("Salary: " + getSalary());
    }
}

class EmployeeDriver{
    public static void main(String[] args) {
        Employee e = new Employee("Ram", "Software Engineer", 50000);

        System.out.println("Before salary update");
        e.displayinfo();

        e.updateSalary(10);
        
        System.out.println("\nAfter Salary Increase:");
        e.displayinfo();
    }
}