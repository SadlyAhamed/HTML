
package exam;

import java.util.Scanner;

public class QuesctionFour {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
          System.out.println("Enter Number ");
           int input = sc.nextInt();
        
        int count=0;
        for(int i=1;i<=input;i++){
        if(input%i==0){
            count+=1;
        }}
        if(count==2){
            System.out.println("prime number ");
        }
        else{
            System.out.println("not prime number ");
        }
    }
}
