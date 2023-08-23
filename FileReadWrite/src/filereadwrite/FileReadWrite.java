
package filereadwrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class FileReadWrite {

   
    public static void main(String[] args) throws FileNotFoundException {
        File file =new File("C:\\Users\\user\\Desktop\\myname.txt");
        
        Scanner read=new Scanner(file);
        
        PrintWriter pw=new PrintWriter(file);
        
        pw.println("Hello Java ");
        
        pw.close();
     //   System.out.println(pw);
        
        
        if(file.length()>0){
            System.out.println(read.nextLine());
        }
        else{
            System.out.println("File not Found ");
        }
    }
    
}
