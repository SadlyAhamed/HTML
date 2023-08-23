
package recurtionuse;


public class RecurtionUse {

    
    public static void main(String[] args) {
        long result=factorial(5);
        
        System.out.println(factorial(5));

    }
    public static long factorial(int n){
    
   if(n>0){
       return n*factorial(n-1);
   }
   
   else{
       return 1;
   }}
}
