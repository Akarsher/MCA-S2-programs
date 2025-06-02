import java.util.*;
import java.io.*;

public class inputFile{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        try{
            FileWriter wt = new FileWriter("input.txt");
            System.out.println("enter name:");
            String name=sc.nextLine();
            System.out.println("enter age:");
            int age=sc.nextInt();
            sc.nextLine();
            System.out.println("enter course:");
            String course=sc.nextLine();
            wt.write(name);
            wt.write(String.valueOf(age));
            wt.write(course);

            wt.close();

            FileReader rd = new FileReader("input.txt");
            BufferedReader brf = new BufferedReader(rd);
            String line;
            while((line=brf.readLine())!=null){
                System.out.println(line+"\n");
                
            }
        }
        catch(IOException e){
            System.out.println("program failed.");
        }
    }
}
