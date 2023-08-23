
package array;

import java.util.Arrays;

public class MyArray {
    
    public void findMaxMin(int[] numbers){

     int max=numbers[0];
             int min=numbers[0];
        for(int number:numbers){
            
       
        max=number > max ? number : max;
        min=number < min ? number : min;
        }
        
        System.out.println(Arrays.toString(numbers));
        System.out.println("max no is = "+max+" min no is = "+min );
    }
    
    
     public int doSum(int...a){
    int sum=0;
    for(int val:a){
    sum+=val;
    }
    return sum;
            
    }
     
         public  void findElement(int a, int[]MyArray){
         
             
             
             
             
             
             
         }
     
}
