package com.wjl.Component_.layout_;

import javax.swing.*;
import java.awt.*;

public class LayoutBordersDemo02 {
    public static void main(String[] args) {
//        JFrame frame = new JFrame();
        Frame frame = new Frame();
        //改变布局管理器
        frame.setLayout(new BorderLayout(30,5));

        //添加按钮
        frame.add(new Button("北侧按钮"),BorderLayout.NORTH);
//        frame.add(new Button("东侧按钮"),BorderLayout.EAST);
        frame.add(new Button("南侧按钮"),BorderLayout.SOUTH);
//        frame.add(new Button("西侧按钮"),BorderLayout.WEST);
//        frame.add(new Button("中间按钮"),BorderLayout.CENTER);

        //测试中间button和textfield会不会同时显示
//        frame.add(new Button("中间按钮"));
//        frame.add(new TextField("测试文本框"));

        //让按钮和文本框同时显示
        Panel panel = new Panel();
        panel.add(new TextField("文本框"));
        panel.add(new Button("测试按钮"));
        frame.add(panel); //把容器放入窗口

        //设置大小和可见
        frame.setSize(200,300);
        frame.pack();//设置最佳大小
        frame.setVisible(true);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit
    }
}
