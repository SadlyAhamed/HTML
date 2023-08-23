
package vaical;


public class MotorCycle extends Vaichal{

    public MotorCycle() {
    }

    public MotorCycle(String registrationNumber, String brand, int year) {
        super(registrationNumber, brand, year);
    }

    
    @Override
    public void start() {
        System.out.println("MotorCycle start"); 
    }

    @Override
    public void stop() {
        System.out.println("MotorCycle stop"); 
    }
    
   
}
