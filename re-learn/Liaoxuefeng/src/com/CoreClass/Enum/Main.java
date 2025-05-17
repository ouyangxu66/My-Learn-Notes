package com.CoreClass.Enum;

// enum
public class Main {
    public static void main(String[] args) {
        Weekday day = Weekday.SUN;
        if (day.dayValue == 6 || day.dayValue == 0) {
            System.out.println("Today is "+day+" Work at home!");
        } else {
            System.out.println(day+" Work at office!");
        }
    }
}

//因为enum本身是class，所以我们可以定义private的构造方法，并且，给每个枚举常量添加字段
//这样就无需担心顺序的变化，新增枚举常量时，也需要指定一个int值
enum Weekday {
    MON(1,"周一"), TUE(2,"周二" ), WED(3,"周三" ), THU(4,"周四" ), FRI(5,"周五" ), SAT(6,"周六" ), SUN(0,"周天" );


    public final int dayValue;
    private final String chinese;

    private Weekday(int dayValue, String chinese) {
        this.dayValue = dayValue;
        this.chinese = chinese;
    }
    //默认情况下，对枚举常量调用toString()会返回和name()一样的字符串。
    //但是，toString()可以被覆写，而name()则不行。我们可以给Weekday添加toString()方法
    @Override
    public String toString() {
        return this.chinese;
    }
    //判断枚举常量的名字，要始终使用name()方法，绝不能调用toString()！
}

