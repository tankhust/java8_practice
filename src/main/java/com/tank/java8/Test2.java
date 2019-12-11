package com.tank.java8;

/**
 * @author tank
 * @create 2019/12/07 10:26
 */
@FunctionalInterface
interface MyInterface {
    void test();

    //    String mystring();
    String toString();//重写自Object类，不算抽象方法个数，该接口仍是函数式接口
}

public class Test2 {
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.mytest(() -> System.out.println("hello"));
    }

    public void mytest(MyInterface myInterface) {

        System.out.println(1);
        myInterface.test();
        System.out.println(2);
    }
}