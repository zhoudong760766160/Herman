package com.zhoudong.oop;

/**
 * Java只有值传递
 */
public class DeliverTest {
    public static void main(String[] args) {
        int i = 10;
        Deliver d1 = new Deliver();
        System.out.println("i="+i+"d1 = "+d1);
        change(i,d1);
        System.out.println("i="+i+"d1 = "+d1);
    }

    static void change(int i, Deliver d){
        i = 20;
        d = new Deliver();
    }
}
class Deliver{

}
