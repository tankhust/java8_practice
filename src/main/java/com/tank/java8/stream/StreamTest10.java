package com.tank.java8.stream;

import javax.xml.transform.sax.SAXSource;
import java.util.Arrays;
import java.util.List;

/**
 * @author tank
 * @create 2019/12/08 17:37
 */
public class StreamTest10 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello1", "world", "hello world");

        list.stream().filter(string -> string.length() == 5).limit(1).forEach(System.out::println);

        System.out.println("--------------");

        // 流存在短路操作
        list.stream().mapToInt(item -> {
            int length = item.length();
            System.out.println(item);
            return length;
        }).filter(length -> length == 5).findFirst().ifPresent(System.out::println);
    }
}
