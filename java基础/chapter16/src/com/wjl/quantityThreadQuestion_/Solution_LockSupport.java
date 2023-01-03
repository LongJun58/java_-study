package com.wjl.quantityThreadQuestion_;

import java.util.concurrent.locks.LockSupport;

public class Solution_LockSupport {
    //定义两个线程
    static Thread t1 = null,t2 = null;
    public static void main(String[] args) {
        char[] aI = "1234567".toCharArray();
        char[] aC = "abcdefg".toCharArray();

        t1 = new Thread(() -> {
            for (char c : aI) {
                System.out.println(c);
                LockSupport.unpark(t2); //叫醒t2线程
                LockSupport.park(); // 自己休息
            }
        },"t1");

        t2 = new Thread(() -> {
            for (char c : aC) {
                LockSupport.park();
                System.out.println(c);
                LockSupport.unpark(t1);
            }
        },"t2");

        t1.start();
        t2.start();
    }
}
