package com.Exception.TryCatch;

// try...catch
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

//只要是方法声明的Checked Exception，不在调用层捕获，也必须在更高的调用层捕获。
//所有未捕获的异常，最终也必须在main()方法中捕获，不会出现漏写try的情况。
//这是由编译器保证的。main()方法也是最后捕获Exception的机会

public class Main {

    public static void main(String[] args) {
        String a = "12";
        String b = "x9";
        // TODO: 捕获异常并处理
        int c = 0;
        int d = 0;
        try {
            c = stringToInt(a);
            d = stringToInt(b);
            System.out.println(c * d);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
    static int stringToInt(String s) {
        return Integer.parseInt(s);
    }
}



