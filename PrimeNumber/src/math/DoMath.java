package math;

public class DoMath {

    public String prime(int input) {

        int count = 0;
        for (int i = 1; i <= input; i++) {
            if (input % i == 0) {
                count += 1;
            }
        }        
        if(count == 2){
          return "prime number";
        }
        else{
            return "not prime";
        }

        
    }

}
