package com.learn.c_upload;


import java.io.*;
import java.net.Socket;

public class CloseUtils {
    private CloseUtils() {}
    public static void close(Socket socket, FileOutputStream fos, InputStream is, OutputStream os) {
        //5.关流
        if (os != null) {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (fos != null) {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (is != null) {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
