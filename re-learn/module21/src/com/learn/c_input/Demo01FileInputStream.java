package com.learn.c_input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.IOException;

public class Demo01FileInputStream {
    public static void main(String[] args) throws Exception {
        //method001();
        method002();
    }

    private static void method002() throws IOException {

        FileInputStream stream = new FileInputStream("module21\\1.txt");
        byte[] bytes = new byte[2];
//        int length1 = stream.read(bytes);
//        int length2 = stream.read(bytes);
//        int length3 = stream.read(bytes);
//        System.out.println(length1);
//        System.out.println(new String(bytes, 0, length1));
//        System.out.println(length2);
//        System.out.println(new String(bytes, 0, length2));
//        System.out.println(length3);
//        System.out.println(new String(bytes, 0, length3));
        int len;
        while ((len = stream.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }
        stream.close();
    }

    private static void method001() throws IOException {
        FileInputStream stream = new FileInputStream("module21\\1.txt");
        int a=stream.read();
        int b=stream.read();
        System.out.println(a);
        System.out.println(b);
            int len;
            while ((len = stream.read()) != -1) {//当读取的值为-1时,说明已经读取完了文本内容
                System.out.print((char) len);//将读出的int强制转型为char
            }
            stream.close();
    }
}
