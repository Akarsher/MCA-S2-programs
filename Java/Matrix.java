import java.util.*;
class Matrix{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter rows of matrix:");
	int row = sc.nextInt();
	System.out.print("Enter columns of matrix:");
	int col = sc.nextInt();
	
	int mtx1[][] = new int[row][col];
	int mtx2[][] = new int[row][col];
	int sum[][] = new int[row][col];
	
	System.out.print("Enter values of 1st matrix:");
	for(int i=0;i<row;i++){
	  for(int j=0;j<col;j++){
	  	mtx1[i][j] = sc.nextInt();
	  }
	}
	System.out.print("Enter values of 2nd matrix:");
	for(int i=0;i<row;i++){
	  for(int j=0;j<col;j++){
	  	mtx2[i][j] = sc.nextInt();
	  }
	}
	System.out.print("sum of matrix:\n");
	for(int i=0;i<row;i++){
	  for(int j=0;j<col;j++){
	  	sum[i][j] = mtx1[i][j]+mtx2[i][j];
	  	System.out.print("\t"+sum[i][j]);
	  }System.out.println();
	}
	System.out.print("difference of matrix:\n");
	for(int i=0;i<row;i++){
	  for(int j=0;j<col;j++){
	  	sum[i][j] = mtx1[i][j]-mtx2[i][j];
	  	System.out.print("\t"+sum[i][j]);
	  }System.out.println();
	}
	System.out.print("Product of matrix:\n");
	for(int i=0;i<row;i++){
	
	  for(int j=0;j<col;j++){
	  sum[i][j]=0;
	     for(int k=0;k<col;k++){
	  	sum[i][j] += mtx1[i][k] * mtx2[k][j];
	     }
	  }
	}
	for(int i=0;i<row;i++){
	  for(int j=0;j<col;j++){
	  	System.out.print("\t"+sum[i][j]);
	  }System.out.println();
	}
   }
}
