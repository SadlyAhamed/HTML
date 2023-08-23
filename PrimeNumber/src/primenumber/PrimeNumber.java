package primenumber;

import java.util.Scanner;
import math.DoMath;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DoMath dm = new DoMath();

        System.out.println("enter number ");
        int input=sc.nextInt();
        
        String prime=dm.prime(input);
        
        
        System.out.println("Hasan this number is "+prime);

    }

}
