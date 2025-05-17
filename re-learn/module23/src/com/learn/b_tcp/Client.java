package com.learn.b_tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //1.创建Socket对象,指明服务端的ip和端口号
        Socket socket = new Socket("127.0.0.1", 6666);
        //2.调用Socket中的OutputStream,往服务端发送请求
        OutputStream os = socket.getOutputStream();
        os.write("Hello, World!".getBytes());
        //3.调用Socket中的InputStream,读取服务端响应回来的数据
        InputStream is = socket.getInputStream();
        byte[] buffer = new byte[1024];
        int len = is.read(buffer);
        System.out.println(new String(buffer,0,len));
        //4.关流
        is.close();
        os.close();
        socket.close();
    }
}
