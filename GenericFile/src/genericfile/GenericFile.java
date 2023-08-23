
package genericfile;


public class GenericFile {

   
    public static void main(String[] args) {
        Integer[] integers={1,2,3,4,5,6};
        String[] strings={"london","japan","India","bangladesh"};
   
        GenericFile.<Integer>print(integers);
        GenericFile.<String>print(strings);
    
    }
    public static <E>void print(E[]list){
    for(int i=0;i<list.length;i++){
        System.out.print(list[i]+"");
        System.out.println("");
    }
    }
    
}
