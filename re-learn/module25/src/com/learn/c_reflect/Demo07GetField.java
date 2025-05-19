package com.learn.c_reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Demo07GetField {
    public static void main(String[] args) throws Exception {
        //method01();
        method02();
    }

    private static void method02() throws Exception {
        Class<Student> aClass = Student.class;
        Student student = aClass.newInstance();
        //获取私有属性
        Field name = aClass.getDeclaredField("name");
        //解除私有权限
        name.setAccessible(true);
        //调用set方法为属性复制
        name.set(student,"公关部");
        //调用get方法获取属性值,相当于Javabean中的get方法
        Object object = name.get(student);
        System.out.println(object);
    }

    private static void method01() {
        Class<Student> aClass = Student.class;
        //获取所有public属性
        Field[] fields = aClass.getFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }
        //获取所有属性,包括private属性
        Field[] dfs = aClass.getDeclaredFields();
        for (Field f : dfs) {
            System.out.println("f = " + f);
        }
    }

}
