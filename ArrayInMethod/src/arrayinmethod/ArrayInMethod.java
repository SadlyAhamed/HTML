
package arrayinmethod;

import array.MyArray;


public class ArrayInMethod {

    
    
    public static void main(String[] args) {
       
        MyArray array=new MyArray();
       
        
        
             int numbers[] = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);}
        
        array.findMaxMin(numbers);
    
        System.out.println(array.doSum(20,56,69,98));
    
  
    }
    

        
    
    
}
