import java.util.*;
class rect{
    int l,b,area;
    
    void rect(){
    	l=10;
    	b=5;
   	area=l*b;
    }
    void display(){
    	System.out.println("length:"+ l);
    	System.out.println("breadth:"+ b);
    	System.out.println("area of rectangle:"+ area);
    }
    }
class rectangle{
	public static void main(String args[]){
	rect r = new rect();
	r.rect();
	r.display();
	
	}
}

