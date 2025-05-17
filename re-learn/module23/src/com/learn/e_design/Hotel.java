package com.learn.e_design;

public abstract class Hotel {
    public  void eat(){
        System.out.println("diandan");
        eatCai();
        System.out.println("maidan");
    }
    public abstract  void eatCai();
}
