import java.util.*;

class Employee {
	String name;
	double salary;
	Employee(){}
	Employee(String name, double salary) {
	this.name=name;
	this.salary=salary;
	}
	double calculate() {
		return salary;
		}
	}

class Manager extends Employee {
	double bonus;
	Manager(String mgname, double mgsalary,double bonus) {
	super(mgname,mgsalary);
	this.bonus=bonus;
	}
	double calculate( ) {
		return salary+bonus;
		}
	}
class Programer extends Employee {
	double tips;
	Programer(String pgname, double pgsalary,double tips) {
	super(pgname,pgsalary);
	this.tips=tips;
	}
	double calculate( ) {
		return salary+tips;
		}
	}
	
class SuperEmp{
	public static void main(String args[ ]) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Manager name :");
		String mgname = sc.nextLine();
		System.out.println("Enter Manager salary :");
		double mgsalary = sc.nextDouble();
		System.out.println("Enter Manager bonus :");
		double bonus = sc.nextDouble();
		sc.nextLine();
		
		Manager mg = new Manager(mgname,mgsalary,bonus);
		
		System.out.println("Enter Programer name :");
		String pgname = sc.nextLine();
		System.out.println("Enter Programer salary :");
		double pgsalary = sc.nextDouble();
		System.out.println("Enter Programmer tips :");
		double tips = sc.nextDouble();
		
		Programer pg = new Programer(pgname,pgsalary,tips);
		
		
		System.out.println("Programer name : "+pg.name);
		System.out.println("Programer salary : "+pg.calculate());
		System.out.println("Manager name : "+mg.name);
		System.out.println("Manager salary : "+mg.calculate());
		}
	}	
