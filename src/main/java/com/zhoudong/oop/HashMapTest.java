package com.zhoudong.oop;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhoudong
 * @create 2018/12/1
 * HashMap Test
 */
public class HashMapTest {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("aa","AA");
        System.out.println(map.hashCode());
        changeMap(map);
        System.out.println("============");
        System.out.println(map.hashCode());
    }

    private static void changeMap(Map map) {
        map.put("aa","BB");
        System.out.println(map.hashCode());
    }
}
