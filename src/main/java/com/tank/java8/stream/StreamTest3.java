package com.tank.java8.stream;

import java.util.Arrays;
import java.util.List;

/**
 * @author tank
 * @create 2019/12/08 09:22
 */
public class StreamTest3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(list.stream().map(i -> i * 2).reduce(0, Integer::sum));
    }
}
