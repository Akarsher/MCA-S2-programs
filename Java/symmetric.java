import java.util.*;
class symmetric{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter rows of matrix:");
	int row = sc.nextInt();
	System.out.print("Enter columns of matrix:");
	int col = sc.nextInt();
	
	int mtx1[][] = new int[row][col];
	int flag=0;
	System.out.print("Enter values of matrix:");
	for(int i=0;i<row;i++){
	  for(int j=0;j<col;j++){
	  	mtx1[i][j] = sc.nextInt();
	  }
	}
	System.out.print("matrix:\n");
	for(int i=0;i<row;i++){
	  for(int j=0;j<col;j++){
	  	System.out.print("\t"+mtx1[i][j]);
	  }System.out.println();
	}
	for(int i=0;i<row;i++){
	  for(int j=0;j<col;j++){
	  	if(mtx1[i][j]!=mtx1[j][i]){
	  	flag =1;
	  	
	  	break;
	  	}
	  }
	}
	if(flag==0)
	System.out.print("This matrix is symmetric");
	else
	System.out.print("This matrix is not symmetric");
   }
}	
