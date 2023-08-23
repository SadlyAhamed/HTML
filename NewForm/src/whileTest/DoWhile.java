
package whileTest;

import java.util.Scanner;
import newform.NewForm;


public class DoWhile {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        NewForm dm=new NewForm();
        
        System.out.println("Pls Enter A Number ");
        int n1=sc.nextInt();
        System.out.println("Pls Enter A Number ");
        int n2=sc.nextInt();
        System.out.println("Pls Enter A Number ");
        int n3=sc.nextInt();
        
        
        
        System.out.println(dm.doSum(n2, n3));
        System.out.println(dm.doSum(n1, n2));
        System.out.println(dm.doSum(n1, 56));
        
    }
    
}
