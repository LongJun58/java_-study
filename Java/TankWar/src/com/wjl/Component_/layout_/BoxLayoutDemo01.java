package com.wjl.Component_.layout_;

import javax.swing.*;
import java.awt.*;

public class BoxLayoutDemo01 {
    public static void main(String[] args) {
        //创建一个窗口
        Frame frame = new Frame();

        //创建Boxlayout布局管理器
        BoxLayout boxLayout = new BoxLayout(frame, BoxLayout.Y_AXIS);

        //把布局管理器放入窗口容器中
        frame.setLayout(boxLayout);

        //创建两个按钮
        frame.add(new Button("按钮1"));
        frame.add(new Button("按钮2"));

        //设置最佳大小
        frame.pack();
        //设置可见
        frame.setVisible(true);
    }
}
