package com.tank.java8.stream;

import java.util.stream.IntStream;

/**
 * @author tank
 * @create 2019/12/08 09:19
 */
public class StreamTest2 {
    public static void main(String[] args) {

        IntStream.of(new int[]{5,6,7}).forEach(System.out::println);
        System.out.println("----------");

        IntStream.range(3,7).forEach(System.out::println);
        System.out.println("----------");

        IntStream.rangeClosed(3,7).forEach(System.out::println);

    }
}
