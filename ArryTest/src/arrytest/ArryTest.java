
package arrytest;

import java.util.Arrays;


public class ArryTest {

    
    public static void main(String[] args) {
        String [] studentsNames=new String[10];
        
        studentsNames[0] = "rajib";
        studentsNames[1] = "limon";
        studentsNames[2] = "hasan";
        studentsNames[3] = "tamin";
        studentsNames[4] = "mamun";
        studentsNames[5] = "sabit";
        studentsNames[6] = "rajib";
        studentsNames[7] = "limon";
        studentsNames[8] = "hasan";
        studentsNames[9] = "tamin";

        int marks[] = new int[10];

        marks[1] = 20;
        marks[2] = 20;
        marks[3] = 20;
        marks[4] = 20;
        marks[5] = 20;
        marks[8] = 20;
        
        
        String subject[]=new String[10];
        
        subject[0]="Bangla";
        subject[1]="finance";
        subject[2]="Bangla";
        subject[3]="math";
        subject[4]="banking";
        subject[6]="Bangla";
        subject[8]="English";
        subject[9]="Bangla";
        
        
        
//        System.out.println(Arrays.toString(studentsNames));
//        System.out.println(Arrays.toString(marks));
       
        
        for(int i=0;i<studentsNames.length;i++){
        //    System.out.println(studentsNames[i]);
            System.out.println
        ("students name is "+studentsNames[i]+" and marks is "+marks[i]+" and subject is "+subject[i]);
        }
        
//        for(int mark:marks){
//            System.out.println(mark);
//        }
//        for(String name:studentsNames){
//            System.out.println(name);
//        }
//        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
