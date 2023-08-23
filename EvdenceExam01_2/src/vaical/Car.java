
package vaical;


public class Car extends Vaichal{

    public Car() {
    }

    public Car(String registrationNumber, String brand, int year) {
        super(registrationNumber, brand, year);
    }

    
    @Override
    public void start() {
        System.out.println("Car start"); 
    }

    @Override
    public void stop() {
        
        System.out.println("Car start"); 

    }
    
}
