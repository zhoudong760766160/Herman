package com.zhoudong.oop;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StaticTest {

}
class Person{
    private Date birthday;
    private static Date startDate,endDate;
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy");

    /**
     * static 初始化一次，提高代码性能
     */
    static {
        try{
            startDate = sdf.parse("1964");
            endDate = sdf.parse("2018");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public boolean isBorn(){
        return birthday.compareTo(startDate) >= 0 && birthday.compareTo(endDate) <= 0;
    }
}
