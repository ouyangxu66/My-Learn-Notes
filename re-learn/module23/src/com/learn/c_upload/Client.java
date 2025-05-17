package com.learn.c_upload;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //1.创建Socket对象,指明服务端的ip和端口号
        Socket socket = new Socket("127.0.0.1", 6666);

        //2.创建FileInputStream,从本地硬盘中读取文件
        FileInputStream fis = new FileInputStream("C:\\Users\\xu\\Desktop\\javaresource\\3.jpg");

        //3.用于将读取的本地文件发送到服务端
        OutputStream os = socket.getOutputStream();

        //4.边读边写
        byte[] buf = new byte[1024];
        int len;
        while ((len = fis.read(buf)) != -1) {
            os.write(buf, 0, len);
        }

        //给服务端传输一个结束标记,服务端才能结束接收
        socket.shutdownOutput();

        System.out.println("=========以下代码是读取响应的结果=========");

        //5.调用getInputStream,读取响应结果
        InputStream is = socket.getInputStream();
        byte[] buf1 = new byte[1024];
        int len1=is.read(buf1);
        System.out.println(new String(buf1,0,len1));

        //6.关流
        is.close();
        fis.close();
        os.close();
        socket.close();
    }
}
