
package maltidaimesctionarray;

import java.util.Arrays;
import java.util.Scanner;


public class MaltiDaimesctionArray {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter row number ");
        int row=sc.nextInt();
        
        System.out.println("enter coloumn number ");
        int column=sc.nextInt();
        
        int num [][]=new int [row][column];
        
        for(int i=0;i<row;i++){
        for(int j=0;j<column;j++){
           num [i][j] =(int) (Math.random()*100);
            System.out.print(num [i][j]+"  ");
        }
            System.out.println(" ");
        }
        //System.out.println(Arrays.deepToString(num));
        
        
        
    }
    
   
    
}
