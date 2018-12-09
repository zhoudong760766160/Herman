package com.zhoudong.oop;

/**
 * @author zhoudong
 * @create 2018/12/2
 * hashCode test
 */
public class ObjectTest {
    public static void main(String[] args) {
        Object obj = new Object();
        System.out.println(obj.hashCode());
        obj = new Object();
        System.out.println(obj.hashCode());
    }
}
