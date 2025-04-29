class fibonacci{

  public static void main(String arg[]){
     int a=Integer.parseInt(arg[0]);
     int num1=0,num2=1,res;
     for(int i=0;i<a;i++){
       System.out.print(num1 + " ");
       res=num1+num2;
       num1=num2;
       num2=res;
     }
   }
 }   
