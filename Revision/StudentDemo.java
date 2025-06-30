class Student {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    String calculateGrade() {
        if (marks >= 80) {
            return "A";
        } else if (marks >= 60) {
            return "B";
        } else if (marks >= 40) {
            return "C";
        } else {
            return "F";
        }
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Marks: " + marks + ", Grade: " + calculateGrade());
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Simran", 85);
        Student s2 = new Student(2, "Sonu", 72);
        Student s3 = new Student(3, "Saniya", 55);
        Student s4 = new Student(4, "Aabriti", 35);

        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}
