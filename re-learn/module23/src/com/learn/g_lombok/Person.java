package com.learn.g_lombok;

import lombok.*;

//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Person {
    private String name;
    private int age;
}
