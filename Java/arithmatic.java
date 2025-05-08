import java.util.*;

class arithmatic{
	
	int add(int a,int b){
		return a+b;
	}
	double add(double a,double b,double c){
		return a+b+c;
	}
	double add(int a,double b){
		return a+b;
	}
	
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		arithmatic obj = new arithmatic();
		
		System.out.println("enter 2 numbers :");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("sum of integers = "+obj.add(num1,num2));
		
		System.out.println("enter 3 double values :");
		double db1 = sc.nextDouble();
		double db2 = sc.nextDouble();
		double db3 = sc.nextDouble();
		System.out.println("sum of integers = "+obj.add(db1,db2,db3));
		
		System.out.println("enter 2 numbers (one integer and one double) :");
		int a = sc.nextInt();
		double b = sc.nextDouble();
		System.out.println("sum of integers = "+obj.add(a,b));
	}
}
