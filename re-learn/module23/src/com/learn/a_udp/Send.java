package com.learn.a_udp;

import java.net.*;

public class Send {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        //创建要发送的数据,ip地址,端口号
        byte[] bytes = "Hello, World!".getBytes();
        InetAddress ip = InetAddress.getByName("127.0.0.1");
        int port = 6666;
        //将数据打包
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, ip,port);
        //调用send方法,传输数据
        socket.send(dp);
        //释放资源
        socket.close();
    }
}
