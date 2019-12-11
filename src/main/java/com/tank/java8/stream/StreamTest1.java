package com.tank.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author tank
 * @create 2019/12/08 09:16
 */
public class StreamTest1 {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("hello", "world", "hello world");

        String[] myArray = new String[]{"hello", "world", "hello world"};
        Stream stream2 = Stream.of(myArray);
        Stream stream3 = Arrays.stream(myArray);

        List<String> list = Arrays.asList(myArray);
        Stream<String> stream4 = list.stream();


    }
}
