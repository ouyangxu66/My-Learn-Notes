package com.learn.d_reflect;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class Demo01Reflect {
    public static void main(String [] args) throws Exception {

        Properties properties = new Properties();

        InputStream in = Demo01Reflect.class.getClassLoader().getResourceAsStream("pro.properties");
        properties.load(in);
        //System.out.println(properties);

        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");

        Class<?> aClass = Class.forName(className);

        Object o = aClass.newInstance();

        Method method = aClass.getMethod(methodName);

        method.invoke(o);
    }
}
