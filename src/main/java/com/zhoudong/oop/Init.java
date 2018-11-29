package com.zhoudong.oop;

public class Init extends SuperInit{
    static {
        System.out.println("init");
    }

    Init() {
        System.out.println("create init");
    }
}
class SuperInit{
    static {
        System.out.println("super init");
    }

    public SuperInit() {
        System.out.println("create super init");
    }
}
