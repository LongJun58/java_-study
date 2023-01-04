package com.wjl.Component_.layout_;

import javax.swing.*;
import java.awt.*;

public class BoxLayoutDemo02 {
    public static void main(String[] args) {
        //创建窗口容器
        Frame frame = new Frame();

        //创建水平BoxLayout布局管理器
        Box horizontalBox = Box.createHorizontalBox();
        horizontalBox.add(new Button("水平按钮1"));
        horizontalBox.add(new Button("水平按钮2"));

        //创建垂直BoxLayout布局管理器
        Box createVerticalBox = Box.createVerticalBox();
        createVerticalBox.add(new Button("垂直按钮1"));
        createVerticalBox.add(new Button("垂直按钮2"));

        //把四个按钮加入容器中
        frame.add(horizontalBox,BorderLayout.NORTH);
        frame.add(createVerticalBox);
        //设置最佳大小
        frame.pack();
        //设置可见
        frame.setVisible(true);
    }
}
