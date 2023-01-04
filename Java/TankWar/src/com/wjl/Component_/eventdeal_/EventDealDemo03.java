package com.wjl.Component_.eventdeal_;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EventDealDemo03 {
    public static void main(String[] args) {
        //创建窗口对象
        Frame frame = new Frame("测试窗口");
        //设置大小
        frame.setBounds(200,300,400,400);

        //退出功能
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0); //退出
            }
        });

        //设置可见
        frame.setVisible(true);
    }
}
