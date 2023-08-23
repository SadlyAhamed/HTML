
package oopclassdefain;

import geo.Circle;
import java.util.Scanner;


public class OOPClassDefain {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double radius=s.nextDouble();
       
        Circle c=new Circle();
        c.setRadius(radius);
       // c.radius=5;
        System.out.println("area : "+c.getArea());
        System.out.println("rad : "+c.getParaeter());
    }
    
}
