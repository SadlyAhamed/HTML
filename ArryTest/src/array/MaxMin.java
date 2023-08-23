
package array;

import java.util.Arrays;


public class MaxMin {
    
    public static void main(String[] args) {

        int numbers[] = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);}
             int max=numbers[0];
             int min=numbers[0];
        for(int number:numbers){
            
       
        max=number > max ? number : max;
        min=number < min ? number : min;
        }
        
        System.out.println(Arrays.toString(numbers));
        System.out.println("max no is = "+max+" min no is = "+min );
        
        
        }
    }

