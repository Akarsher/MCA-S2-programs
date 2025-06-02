import java.util.*;
import java.io.*;

public class fileHandling {
    public static void main(String arg[]){
        try{
            FileWriter wt = new FileWriter("sample.txt",true);
            wt.write("More contents are added to file.");
            wt.close();
            FileReader rd = new FileReader("sample.txt");
            BufferedReader bfr = new BufferedReader(rd);
            
            String line;
            while ((line=bfr.readLine())!=null) {
                System.out.println(line);
            }
            bfr.close();
        }
        catch(IOException e){
            System.out.println("error occured on writing");
        }
    }
}
