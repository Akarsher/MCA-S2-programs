import java.util.*;

class constructor{
	
	constructor(int a,int b){

		System.out.println("sum of integers = "+(a+b));
	}
	constructor(double a,double b,double c){

		System.out.println("sum of integers = "+(a+b+c));
	}
	constructor(int a,double b){
		System.out.println("sum of integers = "+(a+b));
	}
	
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);

		
		System.out.println("enter 2 numbers :");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		new constructor(num1,num2);

		
		System.out.println("enter 3 double values :");
		double db1 = sc.nextDouble();
		double db2 = sc.nextDouble();
		double db3 = sc.nextDouble();
		new constructor(db1,db2,db3);

		System.out.println("enter 2 numbers (one integer and one double) :");
		int a = sc.nextInt();
		double b = sc.nextDouble();
		new constructor(a,b);

	}
}
