class fact{

  public static void main(String arg[]){
     int a=Integer.parseInt(arg[0]);
     int res=1,i;
     for(i=2;i<=a;i++){
       res*=i;
      }
      System.out.println( "factorial is "+res);
     }
    }
     
