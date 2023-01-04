package com.wjl.Component_.layout_;

import java.awt.*;

public class GirdLayoutDemo {
    public static void main(String[] args) {
        //创建窗口
        Frame frame = new Frame("计算器");

        //创建第一个panel对象，显示文本框
        Panel p1 = new Panel();
        //放入一个文本框组件，最多字符串长度不超过30
        p1.add(new TextField(30));
        //再把p1容器放入窗口容器中
        frame.setLayout(new BorderLayout());
        frame.add(p1,BorderLayout.NORTH);

        //创建第二个容器对象，显示button
        Panel p2 = new Panel();
        //设置第二个对象为girdLayout布局管理器
        p2.setLayout(new GridLayout(3,5,4,4));
        for (int i = 0; i < 10; i++) {
            p2.add(new Button(i+""));
        }
        //放入加减乘除按钮
        p2.add(new Button("+"));
        p2.add(new Button("-"));
        p2.add(new Button("*"));
        p2.add(new Button("/"));
        p2.add(new Button("."));
        //把第二个panel对象放入窗口容器中
        frame.add(p2);

        //设置可见
        frame.pack();
        frame.setVisible(true);
    }
}
