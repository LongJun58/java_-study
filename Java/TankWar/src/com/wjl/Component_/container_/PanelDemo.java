package com.wjl.Component_.container_;

import java.awt.*;

public class PanelDemo {
    public static void main(String[] args) {
        //创建一个frame容器
        Frame frame = new Frame("测试窗口");

        //创建panel对象
        Panel panel = new Panel();

        //向panel添加组件
        panel.add(new TextField("这是一个测试文本0"));
        panel.add(new Button("这是一个测试按钮"));

        //把panel容器加入窗口容器
        frame.add(panel);

        //设置窗口的大小,位置
        frame.setBounds(100,100,500,500);

        //设置窗口可见
        frame.setVisible(true);
    }
}
