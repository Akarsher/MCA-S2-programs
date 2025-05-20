class multipleException
{
public static void main(String args[ ])

{
int i=10;
int j=10;
try{
	int d=i/(i-j);
	System.out.println("Division =" +d);
	
	int arr[] = {1,2,3};
	int a = arr[5];
}
catch (AithmeticException ex) {
	System.out.println("Caught ArithmeticException: " + ex);
        } 
catch (ArrayIndexOutOfBoundsException ai) {
	System.out.println("Caught ArrayIndexOutOfBoundsException: " + ai);
        } 
finally {
	System.out.println("Finally block executed.");
        }
   }
}
