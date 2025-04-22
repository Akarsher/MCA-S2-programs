import java.util.*;
class Employee {
    int id,salary;
    String name;
    
    Employee(int id,int salary,String name){
    this.id=id;
    this.salary=salary;
    this.name=name;
    }
    void display(){
       System.out.println("Employee Details:");
       System.out.println("Employee ID:"+ id);
       System.out.println("Employee Name: "+ name);
       System.out.println("Employee Salary:"+ salary);
    }
 }   
class Employees{
	public static void main(String args[]){
	
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter employee ID:");
	  int id = sc.nextInt();
	  System.out.print("Enter employee Nmae:");
	  String name = sc.next();
	  System.out.print("Enter employee Salary:");
	  int salary = sc.nextInt(); 
	  
	  Employee emp = new Employee(id,salary,name);
	  emp.display();
	}
}    
    
