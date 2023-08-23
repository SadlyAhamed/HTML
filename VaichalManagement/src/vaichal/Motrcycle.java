
package vaichal;


public class Motrcycle extends Vaichal{

    public Motrcycle() {
    }

    public Motrcycle(String regestratinNumber, String brands, int year) {
        super(regestratinNumber, brands, year);
    }

    @Override
    public void start() {
        System.out.println("Motor Cycle Start");  
    }

    @Override
    public void stop() {
System.out.println("Motor Cycle Stop");  
    }
    
}
