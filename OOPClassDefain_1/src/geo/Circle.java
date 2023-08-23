
package geo;


public class Circle {
   private double radius;
   
  

    public void setRadius(double r) {
        if(r>=1){
         this.radius = r;
        }
        else{
            System.out.println("Pls enter positive number ");
    }
        
       
    }
   
   public double getArea(){
   double area =Math.PI*radius*radius;
   return area;
   }
   
   
public double getParaeter(){
double parimeter=2*Math.PI*radius;
return parimeter;
}



}
