class exception1
{
public static void main(String args[ ])

{
int i=10;
int j=10;
try{
	int d=i/(i-j);
	System.out.println("Division =" +d);
}
catch(ArithmeticException ex){
	System.out.println("type of exception =" + ex);
}

}
}
