package com.tank.java8;

import java.util.function.Predicate;

/**
 * @author tank
 * @create 2019/12/07 12:22
 */
public class PredicateTest {
    public static void main(String[] args) {
        Predicate<String> predicate = p -> p.length() > 5;
        System.out.println(predicate.test("hello"));
    }
}
