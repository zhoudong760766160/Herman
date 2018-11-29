package com.zhoudong.oop;

import org.junit.Test;

/**
 * 多重循环跳出方法
 */
public class BeakTest {

    @Test
    public void testBreak(){
        out:
        for (int i = 0; i<10;i++){
            for (int j = 0;j<i;j++){
                if (j >= 9){
                    break out;
                }
                System.out.println("i*j = "+i*j);
            }
        }
    }
}