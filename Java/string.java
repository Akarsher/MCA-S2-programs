import java.util.Scanner;

class string {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);      
        System.out.print("Enter a string: ");
        String str = sc.nextLine(); 
        System.out.println("You entered: " + str);
        System.out.println("length of string: "+str.length());
        System.out.println("1st and 4th character of string: "+str.charAt(0) +" and "+str.charAt(3));
        System.out.println("sub string: " +str.substring(4));
        System.out.println("sub string: " +str.substring(1, 4));
        System.out.print("Enter another string: ");
        String str1 = sc.nextLine(); 
     }
 }
        
