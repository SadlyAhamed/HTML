
package array;


import java.util.Arrays;


public class ArryInitilaizers {
    public static void main(String[] args) {
//        String [] subjects={"JEE","HTML","CSS","JSP"};
//        System.out.println(Arrays.toString(subjects));
//        
//        for(String subject:subjects){
//            System.out.println(subject);
//        }
//        
        int sum=0;
        
        int marks[] = new int[10];

        for (int i = 0; i < marks.length; i++) {
            marks[i] = (int) (Math.random() * 100);
        }
           int max=0;
        int min=999999999;
        
       for(int number: marks){
         //  sum+=number;
           // System.out.println(number+" ");
         
      
          if(max<number){
            max=number;
            }
         else if(min>number){
         min=number;
         }
         
       }
      //  System.out.println("sum ="+sum);
       // System.out.println("avarage ="+sum/marks.length);
        //  System.out.println(Arrays.toString(marks));  
        System.out.println(Arrays.toString(marks));
        System.out.println("max no is = "+max);  
        System.out.println("min no is = "+min);
    }
}
