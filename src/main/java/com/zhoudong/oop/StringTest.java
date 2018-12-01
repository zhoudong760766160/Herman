package com.zhoudong.oop;

/**
 * @author zhoudong
 * @create 2018/12/1
 * 测试String不可变对比StringBuffer
 */
public class StringTest {
    public static void main(String[] args) {
        String str = "Hello";
        str += " World";
        System.out.println(str);

        StringBuffer sBuf = new StringBuffer();
        sBuf.append("Hello");
        sBuf.append(" World");
        System.out.println(sBuf.toString());
    }
}
