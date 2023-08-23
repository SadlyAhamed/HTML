
package exam;

import java.util.Scanner;


public class QuesctionOne {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        
        while (true) {            
            System.out.println("Enter The Number ");
            int num=sc.nextInt();
            
            if(num==-1){
            break;
            }
            sum+=num;
        }
        System.out.println("Total Sum = "+sum);
    }
}
