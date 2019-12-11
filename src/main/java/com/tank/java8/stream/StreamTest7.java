package com.tank.java8.stream;

import java.util.Arrays;
import java.util.List;

/**
 * @author tank
 * @create 2019/12/08 10:44
 */
public class StreamTest7 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "hello world");
//        list.stream().map(item -> item.substring(0,1).toUpperCase() + item.substring(1)).forEach(System.out::println);

/*
           中间操作没有终止操作，不会输出值，lazy惰性操作
 */
//        list.stream().map(item -> {
//            String result = item.substring(0, 1).toUpperCase() + item.substring(1);
//            System.out.println("test");
//            return result;
//        });
        list.stream().map(item -> {
            String result = item.substring(0, 1).toUpperCase() + item.substring(1);
            System.out.println("test");
            return result;
        }).forEach(System.out::println);
    }

}
