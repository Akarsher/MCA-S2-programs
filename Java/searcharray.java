import java.util.*;
class searcharray{
	public static void main(String args[]){
	
	int arr[] = new int[4];
	int i,t;
	int flag=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 4 elements to the array:");
	for(i=0;i<4;i++){
		arr[i]=sc.nextInt();
	}
	System.out.println("array :");
	for(i=0;i<4;i++){
		System.out.println(arr[i]);
	}
	System.out.println("enter element to search:");
	t=sc.nextInt();
	for(i=0;i<4;i++){
		if(arr[i]==t){
		flag=1;
		break;
		}
	}
	if(flag==1)
		System.out.println("element found in array" + i);
	else
		System.out.println("element not found in array");
   }
}	
