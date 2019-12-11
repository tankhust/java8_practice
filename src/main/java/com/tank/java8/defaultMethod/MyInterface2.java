package com.tank.java8.defaultMethod;

/**
 * @author tank
 * @create 2019/12/08 09:01
 */
public interface MyInterface2 {
    default void myMethod() {
        System.out.println("MyInterface1 default method");
    }
}
