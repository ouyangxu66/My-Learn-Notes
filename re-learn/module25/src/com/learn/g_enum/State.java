package com.learn.g_enum;

public enum State {
    //相当于State WEIFUKUAN=new State();new了一个本类对象
    WEIFUKUAN("未付款"),
    YIFUKUAN("已付款"),
    WEIFAHUO("未发货"),
    YIFAHUO("已发货");

    private String name;
    private State(String name) {
        this.name=name;
    }

    String getName(){
        return name;
    }
}
