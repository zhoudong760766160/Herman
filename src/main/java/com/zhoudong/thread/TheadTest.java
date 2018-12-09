package com.zhoudong.thread;

/**
 * @author zhoudong
 * @create 2018/12/9
 * create a thread
 */
public class TheadTest {
    public static void main(String[] args) {
        TheadTest1 t1 = new TheadTest1();
        new Thread(t1).start();
        TheadTest2 t2 = new TheadTest2();
        t2.start();
    }
}
class TheadTest1 implements Runnable{
    @Override
    public void run() {
        System.out.println("TheadTest1");
    }
}
class TheadTest2 extends Thread{
    @Override
    public void run() {
        System.out.println("TheadTest2");
    }
}
