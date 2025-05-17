package com.ClassInstance.InnerClass;

// inner class
//Outer是一个普通类，而Inner是一个Inner Class，它与普通类有个最大的不同，
//就是Inner Class的实例不能单独存在，必须依附于一个Outer Class的实例
public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer("Nested"); // 实例化一个Outer
        Outer.Inner inner = outer.new Inner(); // 实例化一个Inner
        inner.hello();
    }
}
//内部类可以修改Outer中的private变量和方法
class Outer {
    private String name;

    Outer(String name) {
        this.name = name;
    }

    class Inner {
        void hello() {
            System.out.println("Hello, " + Outer.this.name);
        }
    }
}
