package module19.a_collections;

import java.util.ArrayList;
import java.util.Collections;

public class Demo02Collections {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(12,"晚上"));
        list.add(new Student(52,"天天"));
        list.add(new Student(22,"鸡鸡"));
        list.add(new Student(2,"侃侃"));

        Collections.sort(list);
        System.out.println(list);
    }
}
