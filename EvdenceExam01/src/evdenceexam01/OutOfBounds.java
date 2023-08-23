
package evdenceexam01;

import java.util.Arrays;
import java.util.Scanner;


public class OutOfBounds {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int[] myArray= new int[100];
        
        for(int i=1;i<myArray.length;i++){
            myArray[i]=(int)(Math.random()*100);
            
        }
        System.out.println(Arrays.toString(myArray));
        
        System.out.println("pls Enter a Number ");
        int input=sc.nextInt();
        
        try{
            int value=myArray[input];
            System.out.println("Your Value is "+value); 
                }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
