package com.learn.c_serializable;

import java.io.*;
import java.util.ArrayList;

public class Demo01Serilizable {
    public static void main(String[] args) throws Exception{
        writer();
        reader();
    }
    //反序列化流
    private static void reader() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("module22\\person.txt"));
        ArrayList<Person> list = (ArrayList<Person>) ois.readObject();
        for (Person person : list) {
            System.out.println(person);
        }
        ois.close();
    }
    //序列化流
    private static void writer() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("module22\\person.txt"));
        Person p1 = new Person("jj", 12);
        Person p2 = new Person("bb", 32);
        Person p3 = new Person("pp", 22);
        ArrayList<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        oos.writeObject(list);
        oos.close();
    }
}
