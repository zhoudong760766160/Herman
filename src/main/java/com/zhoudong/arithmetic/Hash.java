package com.zhoudong.arithmetic;

/**
 * @author zhoudong
 * @create 2018/12/5
 * Simulate Hash Arithmetic
 */
public class Hash {
    public static int hash(int i){
        return i%8 ^ 5;
    }
    
    public static int hash(String str){
        char[] ch = str.toCharArray();
        int i = 0;
        for (char c : ch) {
            i += c%8 ^ 5;
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(hash(10));
        System.out.println(hash(11));
        System.out.println(hash(12));
        System.out.println(hash(13));
        System.out.println("=============");
        System.out.println(hash("10"));
        System.out.println(hash("11"));
        System.out.println(hash("12"));
        System.out.println(hash("13"));

        System.out.println(new Object().hashCode());
    }
}
