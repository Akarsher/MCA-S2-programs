class loops{

  public static void main(String arg[]){
     int a=Integer.parseInt(arg[0]);
     int i=1,sum1=0;
     
     while(i<=a){
       sum1+=i;
       i++;
     }
     System.out.println("sum1 is "+sum1);
     int j=1,sum2=0;
     
     do{
       sum2+=j;
       j++;
     }while(j<=a);
     System.out.println("sum2 is "+sum2);
     
     int k=1,sum3=0;
     for(k=1;k<=a;k++){
	sum3+=k;
	}
	System.out.println("Sum3 is "+sum3); 
     }
}
