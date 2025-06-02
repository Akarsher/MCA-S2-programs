package Mypack;

public class primeNo{
    public void primeNumber(int b){
        boolean isPrime=true;
        int i;
        if(b<=1){
            isPrime=false;
        }
        else {
            for(i=2;i<Math.sqrt(b);i++){
                if(b % i == 0){
                    isPrime=false;
                }

            }
        }
        if(isPrime){
            System.out.println("It is a prime number");
        }
        else{
            System.out.println("It is not a prime number");
        }
    }
}
