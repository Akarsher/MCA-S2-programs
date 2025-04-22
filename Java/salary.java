import java.util.*;

class employee{
	int empid;
	double sal;
	double gross;
	double hra;
	double da;
	String name;
	employee(int empid,String name,double sal){
		this.empid=empid;
		this.name=name;
		this.sal=sal;
		
		calculate();
	}
	void calculate(){
	   this.da=0.50*sal;
	   this.hra=0.05*sal;
	   this.gross=sal+da+hra;
	}
	
	void display(){
	   System.out.println("Employee ID: "+empid);
	   System.out.println("Employee Name: "+name);
	   System.out.println("Employee Gross Salary: "+gross);
	}
}	
class salary{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		employee[] emp = new employee[5];
		
		for(int i=0;i<5;i++){
			System.out.println("Enter Employee ID: ");
			int empid=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Employee Name: ");
			String name=sc.next();
			System.out.println("Enter Employee's basic salary : ");
			double sal=sc.nextDouble();
			
			emp[i] =new employee(empid,name,sal);
		}
		for (employee empl : emp) {
            		empl.display();
		}
	}
}
