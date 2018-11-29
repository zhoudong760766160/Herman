package com.zhoudong.oop.clone;

/**
 * 浅复制：
 * 1.基本类型的成员变量，clone后的对象值得改变不会影响源对象
 * 2.引用类型的成员变量，clone后的对象值的改变会影响源对象
 * 深复制：
 * 1.无论基本类型或引用类型，clone后的对象的改变均不影响源对象
 */
public class TestClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Source source1 = new Source();
        source1.setData(new Data("aa"));
        source1.setName("a");
        source1.setNo(1);
        System.out.println("before shadow clone...");
        System.out.println("source1 "+source1);
        Source source2 = (Source) source1.clone();
        System.out.println("after shadow clone...");
        Data data = source2.getData();
        data.setName("bb");
        source2.setName("b");
        source2.setNo(2);
        System.out.println("source2 "+source2);
        System.out.println("source1 "+source1);

        System.out.println("==============================");

        Source1 source3 = new Source1();
        source3.setData(new Data("cc"));
        source3.setName("3");
        source3.setNo(3);
        System.out.println("before deep clone");
        System.out.println("source3 "+source3);

        Source1 source4 = (Source1)source3.clone();
        Data data2 = source4.getData();
        data2.setName("dd");
        source4.setNo(4);
        source4.setName("dd");
        System.out.println("after deep clone");
        System.out.println("source3 "+source3);
        System.out.println("source4 "+source4);
    }
}
