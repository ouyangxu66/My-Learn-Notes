package com.learn.a_junittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 */
public class Demo02Junit {
    @Before
    public void before() {
        System.out.println("这是一条before测试");
    }
    @Test
    public void add() {
        System.out.println("这是add");
    }
    @Test
    public void delete() {
        System.out.println("这是delete");
    }
    @After
    public void after() {
        System.out.println("这是after");
    }


}
