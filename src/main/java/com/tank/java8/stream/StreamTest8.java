package com.tank.java8.stream;

import java.util.stream.Stream;

/**
 * @author tank
 * @create 2019/12/08 10:51
 */
public class StreamTest8 {
    public static void main(String[] args) {
        /*
            一下代码会一直执行，相当于创建了无限流，因为distinct会一直等待前面的数据，传给后面的数据数量不超过两个
         */
        Stream.iterate(0,item->(item + 1) % 2).distinct().limit(6).forEach(System.out::println);
        /*
            正确写法
         */
//        Stream.iterate(0,item->(item + 1) % 2).limit(6).distinct().forEach(System.out::println);

    }
}
