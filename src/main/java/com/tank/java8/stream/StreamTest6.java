package com.tank.java8.stream;

import java.util.IntSummaryStatistics;
import java.util.UUID;
import java.util.stream.Stream;

/**
 * @author tank
 * @create 2019/12/08 10:17
 */
public class StreamTest6
{
    public static void main(String[] args) {
//        Stream<String> stream = Stream.generate(UUID.randomUUID()::toString);
//        System.out.println(stream.findFirst().get());

        //不加limit就是无限流
//        Stream.iterate(1,item->item+2).forEach(System.out::println);
//        Stream.iterate(1,item->item+2).limit(6).forEach(System.out::println);
        Stream<Integer> stream = Stream.iterate(1, item -> item + 2).limit(6);

        System.out.println("------------");
        /*
            流的作业：
            1，3，5，7，9，11
            找出流中的大于2的元素，然后将每个元素乘以2，然后忽略掉流中的前两个元素，然后再取流中前两个元素，最后求出流的总和
         */
        System.out.println(Stream.iterate(1,item->item+2).limit(6).filter(item -> item > 2).mapToInt(item -> item * 2).skip(2).limit(2).sum());


        System.out.println("------------");
        IntSummaryStatistics intSummaryStatistics = Stream.iterate(1, item -> item + 2).limit(6).filter(item -> item > 2).mapToInt(item -> item * 2).skip(2).limit(2).summaryStatistics();
        System.out.println(intSummaryStatistics.getAverage());
        System.out.println(intSummaryStatistics.getMax());
        System.out.println(intSummaryStatistics.getMin());
        System.out.println(intSummaryStatistics.getSum());
    }
}
