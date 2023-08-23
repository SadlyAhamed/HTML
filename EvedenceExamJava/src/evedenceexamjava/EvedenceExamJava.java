
package evedenceexamjava;

import java.util.Scanner;


public class EvedenceExamJava {

    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Item Number ");
        int input=sc.nextInt();
        int max=0;
        int min=999999999;
       int  avgNumber=input;
        int inputNumber=0;
        int sum=0;
        while(input>0){
            System.out.println("Enter Number ");
            inputNumber=sc.nextInt();
           sum+=inputNumber;
            if(max<inputNumber){
            max=inputNumber;
            }
            
            if(min>inputNumber){
                min=inputNumber;}
        
         input--;
                }
                avgNumber=sum/avgNumber;
      
        System.out.println("Max number is "+max);
        System.out.println("Min number is "+min);
        System.out.println("avgNumber is "+(double)avgNumber);
        
        
        
        
        
        
    }
    
}
