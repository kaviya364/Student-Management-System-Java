class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
    }
}

class PGStudent extends Student {

    PGStudent(String name, int rollNo) {
        super(name, rollNo);
    }
}

public class StudentManagement {

    public static void main(String[] args) {

        String[] students = {"Arun","Meena","Karthik"};

        System.out.println("Student Name Length:");

        for(String s : students) {
            System.out.println(s + " = " + s.length());
        }

        PGStudent pg = new PGStudent("Rahul",101);

        System.out.println("\nPG Student Details:");
        pg.displayDetails();
    }
}