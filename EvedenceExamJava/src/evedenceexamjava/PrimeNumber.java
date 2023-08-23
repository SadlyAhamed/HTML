package evedenceexamjava;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter Number ");
//        int input = sc.nextInt();
//        
//        int count=0;
//        for(int i=1;i<=input;i++){
//        if(input%i==0){
//            count+=1;
//        }}
//        if(count==2){
//            System.out.println("prime number ");
//        }
//        else{
//            System.out.println("not prime number ");
//        }
//        
        //prime number in range----------
        System.out.println("Enter first  Number ");
        int num1 = sc.nextInt();
        System.out.println("Enter last  Number ");
        int num2 = sc.nextInt();

        int i = 0;

        for (i = num1; i <= num2; i++) {

            int count = 0;
            for (int j = 1; j <= num2; j++) {
                if (i % j == 0) {
                    count += 1;
                }
            }
            if (count == 2) {
                System.out.println("prime number is " + i);
            }
        }

    }

}


