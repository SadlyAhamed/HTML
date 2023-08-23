
package possell;

import java.util.Scanner;
import price.ObjectPosSell;

public class PosSell {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ObjectPosSell n = new ObjectPosSell();
        
        System.out.println("Pls Enter Unit Price ");
        double unitprice = sc.nextDouble();
        System.out.println("Enter Quantity ");
        double quantity = sc.nextDouble();
        double actualPrice = 0.0;
        n.setUnitprice(unitprice);
        n.setQuantity(quantity);
        
        double totalprice=n.calculateTotalPrice();
        double discount =0.0;
        if(totalprice>=100){
            discount=totalprice*.05;
            actualPrice= totalprice-discount;
        }else{
            actualPrice= totalprice;
        }
         System.out.println("You have to pay "+Math.round(actualPrice)+"\nDiscount Amount is "+discount);
        System.out.println("Thanks, stay with us ");
    }
    
}
