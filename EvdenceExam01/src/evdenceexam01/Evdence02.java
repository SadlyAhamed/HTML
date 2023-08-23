
package evdenceexam01;

import vaical.Car;
import vaical.MotorCycle;
import vaical.Vaichal;


public class Evdence02 {
   public static void main(String[] args) {
      Vaichal car=new Car();
      Vaichal motorcycle=new MotorCycle();
      Car c=new Car();
      
      car.start();
      car.stop();
      c.doWelcome();
      c.doBye();
      
      motorcycle.start();
      motorcycle.stop();
      
      
    }
   
    
}