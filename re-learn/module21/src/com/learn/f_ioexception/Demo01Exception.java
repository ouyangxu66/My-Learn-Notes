package com.learn.f_ioexception;

import java.io.FileWriter;
import java.io.IOException;

public class Demo01Exception {
    public static void main(String[] args) {
        FileWriter fileWriter=null;//作用域问题,如果在try里面new对象赋值,在finally将会不可用,所以要在try之前赋默认值
        try {
            fileWriter = new FileWriter("module21\\3.txt");
            fileWriter.write("你");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fileWriter!=null){
                try {
                    //如果fileWriter不为null,证明new出来了所以需要close;相反则不需要close
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
