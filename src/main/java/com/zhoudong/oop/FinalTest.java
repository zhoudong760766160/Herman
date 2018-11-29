package com.zhoudong.oop;

public class FinalTest {
    public static void main(String[] args) {
        String str1 = "hello world";
        final String str2 = "hello";
        String str3 = "hello";
        String str4 = str2 + " world";
        String str5 = str3 + " world";
        System.out.println(str1 == str4);
        System.out.println(str1 == str5);
        final String str6;
        str6 = getHello();
        String str7 = str6 + " world";
        System.out.println(str1 == str7);
    }

    public static String getHello(){
        return "hello";
    }
}
