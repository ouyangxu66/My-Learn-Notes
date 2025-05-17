package com.learn.e_design;

public class Singleton1 {
    //不让外界使用构造方法
    private Singleton1() {}

    //懒汉式不着急new对象,先赋默认值
    private static Singleton1 singleton1=null;

    //为了将内部new出来的对象给外界
    //定义了一个方法,将内部的new出来的对象返回
    public static Singleton1 getSingleton1() {
        //如果singleton1不是null就没有必要抢锁了,直接返回,是null再抢锁
        if(singleton1==null) {
            synchronized(Singleton1.class){
                if(singleton1==null) {
                    singleton1 = new Singleton1();
                }
            }
        }
        return singleton1;
    }
}
