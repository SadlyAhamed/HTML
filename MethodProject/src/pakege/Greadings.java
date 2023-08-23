
package pakege;

public class Greadings {
    
    public int[][] createArray(int row, int column){
    
     int[][] myArrays=new int[row][column];
        
        for(int ro=0;ro<myArrays.length;ro++){
        
        for(int colm=0;colm<myArrays[ro].length;colm++){
                
        myArrays[ro][colm]=(int)(Math.random()*100);
        }
        }
        return  myArrays;
    }
    
    public int TwoDArray(int[][] myArray){
    int total=0;
        for(int row=0; row<myArray.length; row++){
        for(int col=0; col<myArray[row].length;col++){
        total+=myArray[row][col];
        
        
        
        }
        }
        
        
        
    return total;
    }
}
