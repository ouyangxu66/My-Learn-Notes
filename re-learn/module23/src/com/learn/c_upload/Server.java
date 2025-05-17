package com.learn.c_upload;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class Server {
    public static void main(String[] args) throws IOException {
        //1.创建ServerSocket对象
        ServerSocket server = new ServerSocket(6666);
        //2.调用accept等待客户端连接
        Socket socket = server.accept();
        //3.用于读取客户端发送的文件
        InputStream is = socket.getInputStream();
        /*
            使用工具类UUID.randomUUID生成s随机数,来实现命名不重复即实现文件不覆盖
         */
        String s =UUID.randomUUID().toString();
        String name=s+System.currentTimeMillis();
        //4.用于将客户端文件写入服务端硬盘中
        FileOutputStream fos = new FileOutputStream("C:\\Users\\xu\\Desktop\\javaresource\\haha\\"+name+".jpg");
        byte[] buf = new byte[1024];
        int len;
        while ((len = is.read(buf)) != -1) {
            fos.write(buf, 0, len);
        }
        //5.调用getOutputStream给客户端响应结果
        System.out.println("=========以下代码为给客户端的响应结果=========");
        OutputStream os = socket.getOutputStream();
        os.write("上传成功".getBytes());
        //5.关流
        os.close();
        fos.close();
        is.close();
        socket.close();
        server.close();
    }
}
