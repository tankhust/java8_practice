package com.tank.java8.stream2;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/**
 * @author tank
 * @create 2019/12/09 20:09
 */
public class MySetCollector2<T> implements Collector<T, Set<T>, Map<T, T>> {
    @Override
    public Supplier<Set<T>> supplier() {//中间结果容器
        System.out.println("supplier invoked");
        /*
         *     A a1 = supplier.get();
         *     accumulator.accept(a1, t1);
         *     accumulator.accept(a1, t2);
         *     R r1 = finisher.apply(a1);  // result without splitting
         *
         *     A a2 = supplier.get();
         *     accumulator.accept(a2, t1);
         *     A a3 = supplier.get();
         *     accumulator.accept(a3, t2);
         *     R r2 = finisher.apply(combiner.apply(a2, a3));  // result with splitting
         */
        return ()->{
            System.out.println("--------------");
            HashSet<T> set = new HashSet<>();
            return set;
        };
    }

    @Override
    public BiConsumer<Set<T>, T> accumulator() {
        System.out.println("accumulator invoked");
        return (set, item) -> {
            System.out.println("accumulator: " + set + ", " + Thread.currentThread().getName());
            set.add(item);
        };
    }

    @Override
    public BinaryOperator<Set<T>> combiner() {
        System.out.println("combiner invoked");
        return (set1, set2) -> {
            set1.addAll(set2);
            return set1;
        };
    }

    @Override
    public Function<Set<T>, Map<T, T>> finisher() {
        System.out.println("finisher invoked");
        return set -> {
            Map<T, T> ttMap = new TreeMap<>();
            set.stream().forEach(item -> ttMap.put(item, item));
            return ttMap;
        };
    }

    @Override
    public Set<Characteristics> characteristics() {
        System.out.println("characteristics");
        return Collections.unmodifiableSet(EnumSet.of(Characteristics.UNORDERED));
    }

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        for (int i = 0; i < 1; i++) {
            List<String> list = Arrays.asList("hello", "world", "hello world", "a", "b", "c", "d");
            Set<String> set = new HashSet<>();
            set.addAll(list);
//        Map<String, String> map = set.stream().collect(new MySetCollector2<>());
            Map<String, String> map = set.parallelStream().collect(new MySetCollector2<>());
            System.out.println(map);
        }

    }
}
