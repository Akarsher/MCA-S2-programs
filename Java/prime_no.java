import java.util.*;

class prime_no{

	static boolean isprime(int n){
	if(n==1||n==0)
	   return false;
          for(int i=2; i<n; i++){
           if(n%i==0)
           return false;
          }
          return true;
	}

    public static void main(String[] args) {

       int i;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter limit:");
	int l=sc.nextInt();
	System.out.println("Prime no. series :");
	for(i=1;i < l;i++){
	   if(isprime(i)){
	     System.out.println(i + " ");
	}
      }
   }
}	
