package Mypack;

public class pallindrome {
    public void reverse(String a) {
        String rev = ""; 
        for (int i = a.length() - 1; i >= 0; i--) {
            rev += a.charAt(i);
        }

        if (a.equals(rev)) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }
    }
}
