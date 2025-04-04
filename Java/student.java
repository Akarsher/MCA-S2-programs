import java.util.*;
class Student {
    int rollno;
    String name;
    String branch;
    Student(int rollno, String name, String branch) {
        rollno = rollno;
        name = name;
        branch = branch;
    }

    void display() {
        System.out.println("Student Details:");
        System.out.println("Students Roll No: " + rollno);
        System.out.println("Students Name: " + name);
        System.out.println("Students Branch: " + branch);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        int rollno = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Branch: ");
        String branch = sc.nextLine();
        
        Student student = new Student(rollno, name, branch);
        student.display();
    }
}

