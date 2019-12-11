package com.tank.java8.methodRefrence;

import java.util.Arrays;
import java.util.List;

/**
 * @author tank
 * @create 2019/12/07 14:34
 */
public class MethodReferenceDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("zhangsan", "lisi", "wangwu");
//        list.forEach(item -> System.out.println(item));
        list.forEach(System.out::println);
    }
}
