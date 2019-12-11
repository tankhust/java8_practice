package com.tank.java8;

import java.util.function.Supplier;

/**
 * @author tank
 * @create 2019/12/07 13:36
 */
public class SupplierTest {
    public static void main(String[] args) {
        Supplier<String> stringSupplier = () -> "hello world";
        System.out.println(stringSupplier.get());

        System.out.println("--------------");

        Supplier<Student> studentSupplier = () -> new Student();
        System.out.println(studentSupplier.get().getName());

        System.out.println("--------------");

        Supplier<Student> studentSupplier2 = Student::new;
        System.out.println(studentSupplier2.get().getName());

    }
}
