import java.util.*;
class cpu{
double price;

	cpu(double price){
	this.price=price;
	}
	
	class processor{
		int core;
		String manufactorer;
		
		processor(int core,String manufacturer){
		this.core=core;
		this.manufactorer=manufactorer;
		
		void prodisplay(){
			System.out.println("core: "+core);
			System.out.println("manufactorer: "+manufactorer);
		}
		}
	}
	
	static class ram{
		String memory;
		String manufactorer;
		
		ram(int memory,String manufactorer){
			this.memory=memory;
			this.manufactorer=manufactorer;
			
			void ramdisplay(){
				System.out.println("ram size : "+memory);
			System.out.println("manufactorer: "+manufactorer);
			}
		}
	}
	void cpudisplay(){
		System.out.println("cpu price : "+ price);
	}
	public static void main(String args[]){
		for
	}
}
