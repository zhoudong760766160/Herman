package com.zhoudong.oop;

/**
 * @author zhoudong
 * @create 2018/12/2
 * 测试单线程下StringBuffer和StringBuilder效率问题
 */
public class StringBufferTest {

    public static void main(String[] args) {
        testString();
        testStringBuffer();
        testStringBuilder();
    }

    public static void testString(){
        String str = "Hello";
        long startTime = System.currentTimeMillis();
        int i = 0;
        while(i<100000){
            str += "Hi";
            i ++;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("String:"+(endTime-startTime));
    }

    public static void testStringBuffer(){
        StringBuffer sBuf = new StringBuffer("Hello");
        long startTime = System.currentTimeMillis();
        int i = 0;
        while(i<100000){
            sBuf.append("Hi");
            i ++;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("StringBuffer:"+(endTime-startTime));
    }

    public static void testStringBuilder(){
        StringBuilder sBuf = new StringBuilder("Hello");
        long startTime = System.currentTimeMillis();
        int i = 0;
        while(i<100000){
            sBuf.append("Hi");
            i ++;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("StringBuilder:"+(endTime-startTime));
    }
}
