import java.util.*;
class Mark {
    int rollno,eng,math,total;
    String name;


    Mark(int rollno, String name, int eng, int math) {
        this.rollno = rollno;
        this.eng=eng;
        this.math=math;
        this.name = name;
        this.total=eng+math;
    }
    void display() {
        System.out.println("Student Details:");
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
	System.out.println("English mark: " + eng);
	System.out.println("Maths mark: " + math);
    }
}    
class Marks{
    public static void main(String[] args) {
    	
    	int a=Integer.parseInt(args[0]);
    	String b=args[1];
    	int c=Integer.parseInt(args[2]);
    	int d=Integer.parseInt(args[3]);
    	
        Mark m = new Mark(a,b,c,d);
        m.display();
    }
}
