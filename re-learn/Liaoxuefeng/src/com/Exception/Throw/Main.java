package com.Exception.Throw;

public class Main {

    public static void main(String[] args) {
        System.out.println(tax(2000, 0.1));
        System.out.println(tax(-200, 0.1));
        System.out.println(tax(2000, -0.1));
    }

    static double tax(int salary, double rate)  {
        // TODO: 如果传入的参数为负，则抛出IllegalArgumentException
        try {
            if (salary <= 0||rate <= 0) {
                throw new IllegalAccessException("传入的参数不能为负数");
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return 0;
        }
        return salary * rate;
    }
}

