
package vaichal;


public class Car extends Vaichal{

    public Car() {
    }

    public Car(String regestratinNumber, String brands, int year) {
        super(regestratinNumber, brands, year);
    }
    
    

    @Override
    public void start() {
        System.out.println("cat start");    }

    @Override
    public void stop() {
 System.out.println("cat stop");     }
    
}
