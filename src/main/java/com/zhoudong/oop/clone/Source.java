package com.zhoudong.oop.clone;

public class Source implements Cloneable{
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

    /**
     * 直接调用Object类的clone方法，为浅复制
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
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
