package com.learn.d_copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01CopyFile {
    public static void main(String[] args) throws IOException {
        //1.创建InputStream
        FileInputStream input = new FileInputStream("C:\\Users\\xu\\Desktop\\javaresource\\3.jpg");
        //2.创建OutputStream指定复制到的位置
        FileOutputStream output = new FileOutputStream("C:\\Users\\xu\\Desktop\\javaresource\\十五.jpg");
        //3.创建bytes[] 指定每次传输的字节数
        byte[] bytes = new byte[1024];
        //4.创建变量len用来接收inputStream的字节个数
        int len;
        while((len=input.read(bytes))!=-1){
        //5.input输入读取,output输出写入
            output.write(bytes, 0, len);
        }
    }
}
