package com.tank.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author tank
 * @create 2019/12/07 10:22
 */
public class Test1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }

        System.out.println("--------------");

        for (Integer i : list) {
            System.out.println(i);
        }

        System.out.println("---------------");

//        list.forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer);
//            }
//        });
        list.forEach(i -> System.out.println(i));//Lambda表达式 创建函数式接口实例
        list.forEach(System.out::println);//方法引用 创建函数式接口实例
    }
}
