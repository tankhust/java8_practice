package com.tank.java8.stream2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author tank
 * @create 2019/12/09 17:37
 */
public class MyComparatorTest {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("hello", "nihao", "world", "welcome");
        Collections.sort(list);
        Collections.sort(list, (item1, item2) -> item1.length() - item2.length());
        Collections.sort(list, (item1, item2) -> item2.length() - item1.length());
        Collections.sort(list, Comparator.comparingInt(String::length).reversed());
//        Collections.sort(list, Comparator.comparingInt(item->item.length()).reversed());//item类型推断不出
        Collections.sort(list, Comparator.comparingInt((String item) -> item.length()).reversed());
        list.sort(Comparator.comparingInt(String::length).reversed());


        /*
            thenComparing是对前面比较值为0的值继续比较
         */
        Collections.sort(list, Comparator.comparingInt(String::length)
                .thenComparing(String.CASE_INSENSITIVE_ORDER));
        Collections.sort(list, Comparator.comparingInt(String::length)
                .thenComparing((item1, item2) -> item1.length() - item2.length()));

        Collections.sort(list, Comparator.comparingInt(String::length)
                .thenComparing(Comparator.comparing(String::toLowerCase)));

        Collections.sort(list, Comparator.comparingInt(String::length)
                .thenComparing(Comparator.comparing(String::toLowerCase,Comparator.reverseOrder())));

        Collections.sort(list, Comparator.comparingInt(String::length).reversed()
                .thenComparing(Comparator.comparing(String::toLowerCase,Comparator.reverseOrder())));

        Collections.sort(list, Comparator.comparingInt(String::length).reversed()
                .thenComparing(Comparator.comparing(String::toLowerCase, Comparator.reverseOrder()))
                .thenComparing(Comparator.reverseOrder()));

        System.out.println(list);


    }
}
