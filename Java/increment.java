import java.io.*;
class increment{
	
	static int a=10;
	
  public static void main(String args[])
  {
    System.out.println("value of a:"+a);
    a++;
    System.out.println("postfix increment ="+a);
    System.out.println("prefix increment ="+(++a));
    a--;
    System.out.println("postfix decrement ="+a);
    System.out.println("prefix decrement ="+(--a));
    }
  }
