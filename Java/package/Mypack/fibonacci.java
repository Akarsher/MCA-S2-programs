package Mypack;

public class fibonacci {
    public void fibSeries(int c){
        int first=0;
        int second=1;
        int next;

        for(int i=0;i<c;i++){
            System.out.println(first+" ");
            next=first+second;
            first=second;
            second=next;
        }
    }
}
