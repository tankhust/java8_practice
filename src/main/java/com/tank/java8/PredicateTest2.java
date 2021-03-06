package com.tank.java8;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author tank
 * @create 2019/12/07 12:53
 */
public class PredicateTest2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        PredicateTest2 predicateTest2 = new PredicateTest2();
        System.out.println("--------------");
        predicateTest2.conditionFilter(list, item -> item % 2 == 0);
        System.out.println("--------------");
        predicateTest2.conditionFilter(list, item -> item % 2 != 0);
        System.out.println("--------------");
        predicateTest2.conditionFilter(list, item -> item> 5);
        System.out.println("--------------");
        predicateTest2.conditionFilter(list, item -> item< 5);
        System.out.println("--------------");
        predicateTest2.conditionFilter(list, item -> true);
        System.out.println("--------------");
        predicateTest2.conditionFilter(list, item -> false);
        System.out.println("--------------");


        predicateTest2.conditionFilter2(list, item -> item > 5, item -> item % 2 == 0);
        System.out.println("-----------");

        predicateTest2.conditionFilter3(list, item -> item > 5, item -> item % 2 == 0);
        System.out.println("-----------");

//        System.out.println(predicateTest2.isEqual("test").test("test"));
        System.out.println(predicateTest2.isEqual(new Date()).test(new Date()));
    }

    public void conditionFilter(List<Integer> list, Predicate<Integer> predicate) {
        for (Integer integer : list) {
            if (predicate.test(integer)) {
                System.out.println(integer);
            }
        }
    }

    public void conditionFilter2(List<Integer> list, Predicate<Integer> predicate, Predicate<Integer> predicate2) {
        for (Integer integer : list) {
            if (predicate.and(predicate2).test(integer)) {
                System.out.println(integer);
            }
        }
    }
    public void conditionFilter3(List<Integer> list, Predicate<Integer> predicate, Predicate<Integer> predicate2) {
        for (Integer integer : list) {
            if (predicate.and(predicate2).negate().test(integer)) {
                System.out.println(integer);
            }
        }
    }

    public Predicate<Date> isEqual(Object object) {
        return Predicate.isEqual(object);
    }
}
