
package quesctionfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import pak.Q1;


public class QuesctionIO {

   
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        Q1 student = new Q1();
       
        
        Q1[] students={
        new Q1("hasan",23),
        new Q1("rajb",25),
        new Q1("tamim",29),
        new Q1("rahaman",24),
        new Q1("sabit",26),
        
        };
        FileOutputStream fileOutputStream=new FileOutputStream("student.dat");
        ObjectOutput objectOutput=new ObjectOutputStream(fileOutputStream);
        objectOutput.writeObject(students);
        
        
        FileInputStream fileInputStream=new FileInputStream("student.dat");
        ObjectInputStream inputStream=new ObjectInputStream(fileInputStream);
        
        Q1[] newStudents=(Q1[])inputStream.readObject();
        System.out.println(Arrays.toString(newStudents));
        
    }
    
}
