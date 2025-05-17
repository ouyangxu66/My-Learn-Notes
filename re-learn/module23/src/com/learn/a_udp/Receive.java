package com.learn.a_udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Receive {
    public static void main(String[] args) throws Exception {
        //创建DatagramSocket对象,指定服务端的的端口号
        DatagramSocket socket = new DatagramSocket(6666);
        //接收数据
        byte[] bytes = new byte[1024];
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length);
        socket.receive(packet);
        //解析数据
        int length = packet.getLength();//数据包中获取数据的个数
        byte[] data=packet.getData();//接收的数据
        InetAddress address = packet.getAddress();//获取发送端的主机
        int port = packet.getPort();//发送端的端口号
        //打印
        System.out.println(new String(data,0,length));
        System.out.println(address+":"+port);
        //释放资源
        socket.close();
    }
}
