package com.learn.g_enum;

public class Demo01Enum {
    public static void main(String[] args) {
        State weifahuo = State.WEIFAHUO;
        System.out.println(weifahuo.getName());

        System.out.println("===========================");
        String yifahuo = State.YIFUKUAN.toString();
        System.out.println(yifahuo);

        System.out.println("===========================");
        State[] values = State.values();
        for (State value : values) {
            System.out.println(value.getName());
        }

        System.out.println("===========================");
        State s=State.valueOf("YIFUKUAN");
        System.out.println(s);
    }
}
