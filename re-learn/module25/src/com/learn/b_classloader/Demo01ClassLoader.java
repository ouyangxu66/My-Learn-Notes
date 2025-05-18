package com.learn.b_classloader;

public class Demo01ClassLoader {
    public static void main(String[] args) {
        //appClassLoader
        //app();
        //extClassLoader
       // ext();
        boot();
    }

    private static void boot() {
        ClassLoader classLoader = String.class.getClassLoader();
        System.out.println("classLoader = "+classLoader);
    }


    private static void ext() {

}

private static void app() {
        ClassLoader classLoader = Demo01ClassLoader.class.getClassLoader();
    System.out.println("Demo01ClassLoader.app");
    }

}
