
package exam;

import java.util.Arrays;


public class quesctionSix {
    public static void main(String[] args) {

       int[][] array={{45,69,84},{72,94,91},{41,25,78}};
        System.out.println("Main Array "+Arrays.deepToString(array));
        
        int value;
        for(int i=0;i<array.length;i++){
            for(int row=0;row<array.length;row++){
                for(int col=0;col<array[row].length-1;col++)
                    
                 if(array[row][col]>array[row][col+1]){
                 value=array[row][col];
                 array[row][col]=array[row][col+1];
                 array[row][col+1]=value;
                 }  
            }
        }
        System.out.println("Assending "+Arrays.deepToString(array));
    }
 
}
