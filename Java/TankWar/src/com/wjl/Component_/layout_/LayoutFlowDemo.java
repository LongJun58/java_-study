package com.wjl.Component_.layout_;

import java.awt.*;

public class LayoutFlowDemo {
    public static void main(String[] args) {
        //创建窗口
        Frame frame = new Frame("测试窗口");

        //通过setlayout改变frame容器的布局方式
        //左对齐
//        frame.setLayout(new FlowLayout(FlowLayout.LEFLEFT,T,20,20));
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,30,20));

        //添加多个按钮到窗口容器中
        for (int i = 0; i < 100; i++) {
            frame.add(new Button("按钮"+ i));
        }

        //设置最佳大小，pack方法
        frame.pack();

        //设置窗口的大小
        frame.setSize(1080,900);

        //设置可见
        frame.setVisible(true);
    }
}
