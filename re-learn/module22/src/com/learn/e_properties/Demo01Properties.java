package com.learn.e_properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Demo01Properties {
    public static void main(String[] args) throws IOException {
        //创建propertise对象
        Properties properties = new Properties();
        //创建字符输入流对象,将硬盘文件加载到内存
        FileInputStream fis = new FileInputStream("module22\\jdbc.properties");
        //使用load()方法从流中加载数据
        properties.load(fis);
        //将获取的所有的key放入set集合中
        Set<String> set = properties.stringPropertyNames();
        //遍历set集合打印
        for (String key : set) {
            System.out.println(key+"="+properties.getProperty(key));
        }
        fis.close();
    }
}
