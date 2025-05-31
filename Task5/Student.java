/*You are working on a student information system and need to create a Student class. The student class should have private instance variables for the student's Add commentMore actions
name, ID number, and grade point average (GPA). Implement getter and setter methods for the name and ID number, ensuring that they can be accessed and 
modified only through these methods. However, the GPA should be read-only and can only be set within the class constructor.*/


public class Student {
    private String name;
    private String idNumber;
    private double gpa;

    public Student(double gpa) {
        this.gpa = gpa;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    // getter
    public String getName() {
        return name;
    }
    public String getIdNumber() {
        return idNumber;
    }
    public double getGpa() {
        return gpa;
    }

    public void studentinfo(){
        System.out.println("Student Name: " + getName());
        System.out.println("Student Id: " + getIdNumber());
        System.out.println("GPA: " + getGpa());
    }    
}

class StudentDriver{
    public static void main(String[] args) {
        Student s1 = new Student(3.31);
        s1.setName("Simran");
        s1.setIdNumber("240751");

        s1.studentinfo();

    }
}
