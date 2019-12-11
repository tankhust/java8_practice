package com.tank.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author tank
 * @create 2019/12/07 10:52
 */
public class Test3 {
    public static void main(String[] args) {
//        TheInterface i1 = () -> {
//        };
//        System.out.println(i1.getClass());
//        System.out.println(i1.getClass().getInterfaces()[0]);
//
//        TheInterface2 i2 = () -> {
//        };
//        System.out.println(i2.getClass().getInterfaces()[0]);
//
//
//        new Thread(() -> System.out.println("hello world")).start();

        List<String> list = Arrays.asList("hello", "world", "hello world");
//        list.forEach(item-> System.out.println(item.toUpperCase()));
        List<String> list2 = new ArrayList<>();
//        list.forEach(item -> list2.add(item));
//        list2.forEach(item -> System.out.println(item.toUpperCase()));

//        list.stream().map(item -> item.toUpperCase()).forEach(item -> System.out.println(item));
        list.stream().map(String::toUpperCase).forEach(item -> System.out.println(item));

    }
}

@FunctionalInterface
interface TheInterface {
    void Mymethod();
}

@FunctionalInterface
interface TheInterface2 {
    void Mymethod2();
}