package com.tank.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author tank
 * @create 2019/12/07 11:18
 */
public class StringComparator {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("zhangsan", "lisi", "wangwu", "zhaoliu");
//        Collections.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.compareTo(o1);
//            }
//        });
//        System.out.println(names);

        // statement: o2.compareTo(o1)
        // expression: {return o2.compareTo(o1);}

//        Collections.sort(names,(o1, o2) -> o2.compareTo(o1));
        Collections.sort(names,((o1, o2) -> {return o2.compareTo(o1);}));

        System.out.println(names);
    }
}
