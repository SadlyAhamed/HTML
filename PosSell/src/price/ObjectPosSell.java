
package price;


public class ObjectPosSell {
    private double quantity;
    private double unitprice;

    public ObjectPosSell() {
    }

    public ObjectPosSell(double quantity, double unitprice) {
        this.quantity = quantity;
        this.unitprice = unitprice;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }
    
    public double calculateTotalPrice(){
        
    double totalprice=quantity*unitprice;
    
    return totalprice;
    }
}
