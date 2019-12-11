package com.tank.java8.defaultMethod;

import org.omg.CORBA.IMP_LIMIT;

/**
 * @author tank
 * @create 2019/12/08 09:03
 */
//public class MyClass implements MyInterface1,MyInterface2 {
public class MyClass extends MyInterface1Impl implements MyInterface2 {

    /*
        1.重写两个接口的同名default方法
     */
//    @Override
//    public void myMethod() {
//        System.out.println("MyClass method");;
//    }

    /*
        2.显示指定父接口的default方法
     */
//    @Override
//    public void myMethod() {
//        MyInterface2.super.myMethod();
//    }



    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.myMethod();
    }
}
