package com.learn.c_reflect;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Demo02GetClass {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Properties properties = new Properties();
        FileInputStream in = new FileInputStream("module25\\pro.properties");
        properties.load(in);

        String className=properties.getProperty("className");
        System.out.println("className = " + className);

        System.out.println("==============================");
        Class<?> aClass = Class.forName(className);
        System.out.println("className = " + aClass);
    }
}
