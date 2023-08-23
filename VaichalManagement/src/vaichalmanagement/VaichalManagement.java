
package vaichalmanagement;

import vaichal.Car;
import vaichal.Motrcycle;
import vaichal.Vaichal;


public class VaichalManagement {

   
    public static void main(String[] args) {
       Vaichal car=new Car();
       Vaichal motrcycle=new Motrcycle();
       
       car.start();
       car.stop();
       
       motrcycle.start();
       motrcycle.stop();
    }
    
}
