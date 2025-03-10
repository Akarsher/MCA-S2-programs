import java.util.*;
class array{
	public static void main(String args[]){
	
	int arr[] = new int[4];
	int i;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 4 elements to the array:");
	for(i=0;i<4;i++){
		arr[i]=sc.nextInt();
	}
	System.out.println("array before sorting:");
	for(i=0;i<4;i++){
		System.out.println(arr[i]);
	}
	Arrays.sort(arr);
	System.out.println("array after sorting:");
	for(i=0;i<4;i++){
		System.out.println(arr[i]);
	}
	System.out.println("length of array:" +arr.length);
	
    }
}
