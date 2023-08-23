
package vehical;


public class Truck extends Vehicle{
   public int weight;

    @Override
  public double getSalePrice() {
        if (weight > 2000) {
            return regulaPrice * 10; 
        } else {
            return regulaPrice;
}
    }
}