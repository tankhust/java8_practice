package com.tank.java8.stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author tank
 * @create 2019/12/10 10:03
 */
public class StreamTest2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "hello world");

        NullPointerException my_exception = new NullPointerException("my exception");
        try ( Stream<String> stream = list.stream()){
            stream.onClose(()->{
                System.out.println("aaa");
//                throw new NullPointerException("first exception");
                throw my_exception;
            }).onClose(()->{
                System.out.println("bbb");
//                throw new NullPointerException("second exception");
                throw my_exception;
            }).forEach(System.out::println);
        }

    }
}
