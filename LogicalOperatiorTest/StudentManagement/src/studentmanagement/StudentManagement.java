package studentmanagement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Arrays;

import stu.Student;

public class StudentManagement {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        Student student = new Student();
        Student[] students = {
            new Student("Tamim", 26),
            new Student("Hasan", 25),
            new Student("Sabit", 27),
            new Student("Rajib", 28),
            new Student("masud", 29),};

        FileOutputStream fileOutputStream = new FileOutputStream("students.dat");
        ObjectOutput objectOutput = new ObjectOutputStream(fileOutputStream);
        objectOutput.writeObject(students);

        FileInputStream fileInputStream = new FileInputStream("students.dat");
        ObjectInput objectInput = new ObjectInputStream(fileInputStream);
        Student[] newStudents = (Student[]) objectInput.readObject();
        System.out.println(Arrays.toString(newStudents));
    }

}
