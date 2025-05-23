import java.io.File;

class fileProperty{
    
public static void main(String []args){
    
    String fname=args[0];
    
    File f= new File(fname);
    
    System.out.println("File Name: "+f.getName());
    System.out.println("Path: "+f.getPath());
    System.out.println("Absolute path: "+f.getAbsolutePath());
    System.out.println("Parent: "+f.getParent());
    System.out.println("Exists: "+f.exists());
    
    if(f.exists()){
        
    System.out.println("is writable: "+f.canWrite());
    System.out.println("is readable: "+f.canRead());
    System.out.println("is a directory: "+f.isDirectory());
    System.out.println("File size in bytes: "+f.length());
        }
            }    
    }
