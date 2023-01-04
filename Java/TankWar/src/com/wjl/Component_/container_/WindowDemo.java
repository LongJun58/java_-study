package com.wjl.Component_.container_;

import java.awt.*;

public class WindowDemo {
    public static void main(String[] args) {
        //创建一个窗口对象
        Frame frame = new Frame("这是一个窗口");

        //设置窗口的位置、大小
        frame.setLocation(100,100);
        frame.setSize(300,300);

        //设置窗口对象可见
        frame.setVisible(true);
    }
}
