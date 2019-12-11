package com.tank.java8;

import java.util.Comparator;
import java.util.function.BinaryOperator;

/**
 * @author tank
 * @create 2019/12/07 13:44
 */
public class BinaryOperatorTest {
    public static void main(String[] args) {
        BinaryOperatorTest test = new BinaryOperatorTest();
        System.out.println(test.compute(1, 2, (value1, value2) -> value1 + value2));
        System.out.println(test.compute(1, 2, (value1, value2) -> value1 - value2));

        System.out.println("-----------");

        System.out.println(test.getShort("1hao123", "hello", (a, b) -> a.length() - b.length()));

        System.out.println("-----------");
        System.out.println(test.getShort("1hao123", "hello", (a, b) -> a.charAt(0) - b.charAt(0)));



    }

    public int compute(int a, int b, BinaryOperator<Integer> binaryOperator) {
        return binaryOperator.apply(a, b);
    }

    public String getShort(String a, String b, Comparator<String> comparator) {
        return BinaryOperator.minBy(comparator).apply(a, b);
    }
}
