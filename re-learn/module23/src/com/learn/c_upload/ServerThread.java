package com.learn.c_upload;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class ServerThread {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(6666);
        while(true){
            Socket socket=ss.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    InputStream is=null;
                    FileOutputStream fos=null;
                    OutputStream os=null;
                    try{
                        //3.用于读取客户端发送的文件
                        is = socket.getInputStream();
        /*
            使用工具类UUID.randomUUID生成s随机数,来实现命名不重复即实现文件不覆盖
         */
                        String s = UUID.randomUUID().toString();
                        String name=s+System.currentTimeMillis();
                        //4.用于将客户端文件写入服务端硬盘中
                        fos = new FileOutputStream("C:\\Users\\xu\\Desktop\\javaresource\\haha\\"+name+".jpg");
                        byte[] buf = new byte[1024];
                        int len;
                        while ((len = is.read(buf)) != -1) {
                            fos.write(buf, 0, len);
                        }
                        //5.调用getOutputStream给客户端响应结果
                        System.out.println("=========以下代码为给客户端的响应结果=========");
                        os = socket.getOutputStream();
                        os.write("上传成功".getBytes());

                    }catch (Exception e){
                        e.printStackTrace();
                    }finally {
                       CloseUtils.close(socket,fos,is,os);
                    }
                }
            }).start();
        }
    }
}
