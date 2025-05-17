package com.learn.b_tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //1.创建ServerSocket对象,设置端口号
        ServerSocket server = new ServerSocket(6666);//端口号要对应
        //2.调用ServerSocket中的accept方法,等待客户端连接,返回Socket对象
        Socket socket = server.accept();
        //3.调用socket中的getInputStream,用于读取客户端发送来的数据
        InputStream is = socket.getInputStream();
        byte[] buffer = new byte[1024];
        int len = is.read(buffer);
        System.out.println(new String(buffer,0,len));
        //4.调用Socket中的getOutputStream,用于给客户端响应数据
        OutputStream os = socket.getOutputStream();
        os.write("Hello, World too!".getBytes());
        //5.关流
        is.close();
        os.close();
        socket.close();
    }
}
