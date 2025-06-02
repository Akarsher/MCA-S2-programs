import java.util.*;
import Mypack.pallindrome;
import Mypack.primeNo;
import Mypack.fibonacci;

public class Main{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        pallindrome p =new pallindrome();
        primeNo pm = new primeNo();
        fibonacci fb =new fibonacci();

        while(true){
            System.out.println("Menu\n1.pallindrome\n2.fibonacci\n3.PrimeNumber\n4.Exit");
            System.out.println("Enter your choice: ");
            int ch=sc.nextInt();

            switch(ch){
                case 1:
                System.out.println("Enter a String or a number: ");
                String a=sc.next();
                p.reverse(a);
                break;
                case 2:
                System.out.println("Enter a limit: ");
                int c=sc.nextInt();
                fb.fibSeries(c);
                break;
                case 3:
                System.out.println("Enter a number: ");
                int b=sc.nextInt();
                pm.primeNumber(b);
                break;
                case 4:
                System.out.println("exiting...");
                return;
                default:
                System.out.println("Invalid entry ...");
                return;
            }
        }
        
    }
}
