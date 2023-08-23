
package pak;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GoogleSerch {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\user\\Desktop\\myname.txt");

        Scanner read = new Scanner(file);

        if (file.exists()) {
            String tenWord = "";
            int count = 0;
            while (read.hasNext()) {
                String word = read.next();
                tenWord += word + " ";
                count++;

                if (count == 10) {
                    System.out.println(tenWord);
                    count = 0;
                    tenWord = "";
                }

            }
        } else {
            System.out.println("file not found ");
        }
        read.close();
    }
}
