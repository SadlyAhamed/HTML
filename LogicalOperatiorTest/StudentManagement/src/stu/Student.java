
package stu;

import java.io.Serializable;


public class Student implements Serializable{
    public String name;
    public int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "student {"+"name "+name+" and age "+age+"}";
    
    }
}
