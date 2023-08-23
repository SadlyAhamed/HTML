
package midmonthexam;

import java.util.Scanner;


public class MidMonthExam {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
           int sum=0;
        
        while (true) {
            System.out.println("Enter The Number ");
            int num = sc.nextInt();
            if (num < 0) {
                break;
            }
            sum += num;
        }

        System.out.println("Total Sum = " + sum);
    }
    
}
