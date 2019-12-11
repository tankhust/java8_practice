package com.tank.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author tank
 * @create 2019/12/08 09:16
 */
public class StreamTest4 {
    public static void main(String[] args) {
//        Stream<String> stream1 = Stream.of("hello", "world", "hello world");
//
////        String[] strings = stream1.toArray(length -> new String[length]);
//        String[] strings = stream1.toArray(String[]::new);
//        Arrays.asList(strings).forEach(System.out::println);

//        Stream<String> stream1 = Stream.of("hello", "world", "hello world");
//        List<String> list = stream1.collect(Collectors.toList());//原版
//        Stream<String> stream2 = Stream.of("hello", "world", "hello world");
//
//        //collect（返回值容器创建，从流中获取数据，将数据合并）
//        List<String> list2 = stream2.collect(() -> new ArrayList<>(), (theList, theItem) -> theList.add(theItem),
//                (theList1, theList2) -> theList1.addAll(theList2));
//        Stream<String> stream3 = Stream.of("hello", "world", "hello world");
//        List<String> list3 = stream3.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
//
//        System.out.println("------------");
//        list.forEach(System.out::println);
//        System.out.println("------------");
//        list2.forEach(System.out::println);
//        System.out.println("------------");
//        list3.forEach(System.out::println);
//        System.out.println("------------");

//        Stream<String> stream1 = Stream.of("hello", "world", "hello world");
//        ArrayList<String> collect = stream1.collect(Collectors.toCollection(ArrayList::new));
//        collect.forEach(System.out::println);

        Stream<String> stream1 = Stream.of("hello", "world", "hello world");
        String s = stream1.collect(Collectors.joining()).toString();
        System.out.println(s);

    }
}
