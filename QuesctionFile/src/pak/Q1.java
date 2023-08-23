package pak;

import java.io.Serializable;

public class Q1 implements Serializable{

    public String name;
    public int age;

    public Q1() {
    }

    public Q1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student {" + " name " + name + " and  age " + age + "}";
    }

}
