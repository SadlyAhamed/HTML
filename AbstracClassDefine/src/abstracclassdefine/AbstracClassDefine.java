
package abstracclassdefine;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AbstracClassDefine {

   
    public static void main(String[] args) {
       
      int[] numbers={10,20,30,40,50};
      String[] gradings={"hello","welcomw","good night"};
      
        try {
            FileOutputStream fileOutputstream=new FileOutputStream("C:\\Users\\user\\Desktop\\myname.dat");
            ObjectOutput objectOutput=new ObjectOutputStream(fileOutputstream);
            
            objectOutput.writeObject(numbers);
            objectOutput.writeObject(gradings);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AbstracClassDefine.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AbstracClassDefine.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            FileInputStream fileInputstream=new FileInputStream("C:\\Users\\user\\Desktop\\myname.dat");
            
            ObjectInputStream inputStream=new ObjectInputStream(fileInputstream);
            
            int[] newNumbers = (int[]) inputStream.readObject();
            String[]newGreadings=(String[]) inputStream.readObject();
            
             System.out.println(Arrays.toString(newNumbers ));
             System.out.println(Arrays.toString(newGreadings ));
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AbstracClassDefine.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AbstracClassDefine.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AbstracClassDefine.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
    }
    
}
