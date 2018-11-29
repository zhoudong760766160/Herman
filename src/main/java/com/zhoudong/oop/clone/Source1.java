package com.zhoudong.oop.clone;

public class Source1 implements Cloneable{
    private int No;
    private String name;
    private Data data;

    public int getNo() {
        return No;
    }

    public void setNo(int no) {
        No = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Source1 source1 = (Source1)super.clone();
        source1.data = (Data)this.getData().clone();
        return source1;
    }

    @Override
    public String toString() {
        return "Source{" +
                "No=" + No +
                ", name='" + name + '\'' +
                ", data=" + data +
                '}';
    }
}
