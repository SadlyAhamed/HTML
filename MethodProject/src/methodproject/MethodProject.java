
package methodproject;

import java.util.Scanner;
import pakege.Greadings;


public class MethodProject {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         Greadings array =new Greadings();
        
        System.out.println("Enter Row Number ");
        int row =sc.nextInt();
        System.out.println("Enter Row Number ");
        int col =sc.nextInt();
        
        int[][] newArray= array.createArray(row, col);
        
       int sumOfArray = array.TwoDArray(newArray);
        System.out.println("total sum is : "+sumOfArray);;
       
        
//        int[][] number={{1,2,3,4},{5,6,7,8}};
////        int[][] marks={{10,20,30,40},{50,60,70,80}};
//        
//       
//        System.out.println("number is : "+array.TwoDArray(number));
//        System.out.println("marks is : "+array.TwoDArray(nmark));
//    }
    

}
}