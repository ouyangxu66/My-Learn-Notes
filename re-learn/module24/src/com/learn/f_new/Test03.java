package com.learn.f_new;

public class Test03 {
    public static void main(String[] args) {
        //method01();
        //method02();
        String str = """
                hello World
                    nihaoshijie
                """;
        System.out.println(str);
    }

    //java 13之后
    private static void method02() {
        int month=10;
       var a= switch(month) {
            case 12,1,2->{
                yield "winter";
            }
            case 3,4,5-> {
                yield "Spring";
            }
            case 6,7,8-> {
                yield "Summer";
            }
            case 9,10,11->{
                yield "fall";
            }
            default -> {
                yield "null";
            }
        };
       System.out.println(a);
    }
    //Java 13之前
    private static void method01() {
        int month=10;
        switch(month) {
            case 12,1,2-> System.out.println("冬季");
            case 3,4,5-> System.out.println("春季");
            case 6,7,8-> System.out.println("夏季");
            case 9,10,11-> System.out.println("秋季");
            default -> System.out.println("没有");
        }
    }
}
