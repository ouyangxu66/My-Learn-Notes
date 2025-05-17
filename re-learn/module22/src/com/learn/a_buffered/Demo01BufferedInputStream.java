package com.learn.a_buffered;

import java.io.*;

public class Demo01BufferedInputStream {
    public static void main(String[] args) throws IOException {
        method01();//3.78s
        method02();//0.10s
    }

    private static void method02() throws IOException {
        long start = System.currentTimeMillis();

        FileInputStream fis = new FileInputStream("C:\\Users\\xu\\Desktop\\javaresource\\4.jpg");
        BufferedInputStream bis=new BufferedInputStream(fis);

        FileOutputStream fos=new FileOutputStream("C:\\Users\\xu\\Desktop\\javaresource\\db.jpg");
        BufferedOutputStream bos=new BufferedOutputStream(fos);

        int len;
        while ((len=bis.read())!=-1){
            bos.write(len);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        bos.close();
        bis.close();
    }

    private static void method01() throws IOException {
        long start = System.currentTimeMillis();

        FileInputStream fis = new FileInputStream("C:\\Users\\xu\\Desktop\\javaresource\\4.jpg");
        FileOutputStream fos=new FileOutputStream("C:\\Users\\xu\\Desktop\\javaresource\\db.jpg");

        int len;
        while ((len=fis.read())!=-1){
            fos.write(len);
        }

        long end = System.currentTimeMillis();

        System.out.println(end-start);

        fis.close();
        fos.close();
    }
}
