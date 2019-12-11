package com.tank.java8.stream;

import java.util.Arrays;
import java.util.List;

/**
 * @author tank
 * @create 2019/12/08 17:46
 */
public class StreamTest11 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello world hello", "hello welcome", "world hello", "hello welcome");
        list.stream().map(string -> string.split(" ")).flatMap(string -> Arrays.stream(string)).distinct().forEach(System.out::println);
    }
}
