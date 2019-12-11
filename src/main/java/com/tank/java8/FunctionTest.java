package com.tank.java8;

import java.util.function.Function;

/**
 * @author tank
 * @create 2019/12/07 11:22
 */
public class FunctionTest {
    public static void main(String[] args) {
        FunctionTest test = new FunctionTest();

        System.out.println(test.compute(1, value -> 2 * value));
        System.out.println(test.compute(1, value -> {return value + 5;}));

        System.out.println(test.convert(1, value -> {return String.valueOf(value + "hello world");}));
    }

    public int compute(int a, Function<Integer, Integer> function) {
        int res = function.apply(a);
        return res;
    }
    public String convert(int a, Function<Integer, String> function) {
        return function.apply(a);
    }
}
