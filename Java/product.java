import java.util.*;

class shop{
	int code;
	double price;
	String pname;
	shop(int code,String pname,double price){
		this.code=code;
		this.pname=pname;
		this.price=price;
		
	}
	
	
	void display(){
	   System.out.println("Product code: "+code);
	   System.out.println("Product Name: "+pname);
	   System.out.println("Product price: "+price);
	}
}	
class product{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		shop[] prd = new shop[3];
		
		for(int i=0;i<3;i++){
			System.out.println("Enter product code: ");
			int code=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Product Name: ");
			String name=sc.next();
			System.out.println("Enter product price : ");
			double price=sc.nextDouble();
			
			prd[i] =new shop(code,name,price);
		}
		for (shop prod : prd) {
            		prod.display();
            		System.out.println();
            		
		}
		shop lowest = prd[0];
		for(int i=0;i<3;i++){
		   if(prd[i].price < lowest.price)
		      lowest = prd[i];
		}
		System.out.println("lowest price is :"+lowest.price);
	}
}


