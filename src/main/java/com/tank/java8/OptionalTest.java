package com.tank.java8;

import javax.swing.text.html.Option;
import java.util.Optional;

/**
 * @author tank
 * @create 2019/12/07 14:03
 */
public class OptionalTest {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("hello");
        Optional<String> optional2 = Optional.ofNullable("hello");
//        Optional<String> optional3 = Optional.empty();

//        if (optional.isPresent()) {
//            System.out.println(optional.get());
//        }

        optional.ifPresent(item -> System.out.println(item));// 推荐的Optional使用方式

        System.out.println("----------");

        System.out.println(optional.orElse("world"));

        System.out.println("----------");

        System.out.println(optional.orElseGet(()-> "nihao"));
    }
}
