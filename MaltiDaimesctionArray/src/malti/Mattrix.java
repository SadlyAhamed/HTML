
package malti;

import java.util.Arrays;


public class Mattrix {
    public static void main(String[] args) {
        
        int mattrix[][]={{20,65,32,36},{45,78,58,41},{45,76,89,34}};
        
      //  System.out.println(Arrays.deepToString(mattrix));
        
        for(int i=0;i<mattrix.length;i++){
        for(int j=0;j<mattrix.length;j++){
            System.out.print(mattrix[i][j]+" ");
        }
            System.out.println("");
        }
            
    }
}
