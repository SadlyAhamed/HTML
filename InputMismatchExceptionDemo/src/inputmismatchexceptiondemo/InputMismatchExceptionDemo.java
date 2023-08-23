
package inputmismatchexceptiondemo;

import static com.sun.org.apache.xerces.internal.util.FeatureState.is;
import java.util.InputMismatchException;
import java.util.Scanner;


public class InputMismatchExceptionDemo {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean continueInput = false;
        do{
        try{
            System.out.println("Enter an integer ");
            int number=sc.nextInt();
            System.out.println("The number entered is "+number);
            continueInput = false;
        }
        catch(InputMismatchException ex) {
            System.out.println("Try again. (" + "Incorrect)");
            sc.nextLine();
        }
        }
        while (continueInput);
        }
        }
    

