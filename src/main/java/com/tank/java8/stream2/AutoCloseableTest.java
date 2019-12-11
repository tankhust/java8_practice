package com.tank.java8.stream2;

/**
 * @author tank
 * @create 2019/12/09 23:06
 */
public class AutoCloseableTest implements AutoCloseable {
    public void doSomething() {
        System.out.println("doSomething invoked!");
    }
    /*
        实现AutoCloseable接口，重写close()方法，可以在try-with-resources方法中省略finally操作（在close()方法中完成）
     */
    @Override
    public void close() throws Exception {
        System.out.println("close invoked!");
    }

    public static void main(String[] args) throws Exception {
        try (AutoCloseableTest autoCloseableTest = new AutoCloseableTest()){
            autoCloseableTest.doSomething();
        }
    }
}
