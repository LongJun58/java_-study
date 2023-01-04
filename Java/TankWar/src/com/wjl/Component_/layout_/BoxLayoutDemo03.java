package com.wjl.Component_.layout_;

import javax.swing.*;
import java.awt.*;

public class BoxLayoutDemo03 {
    public static void main(String[] args) {
        //创建容器
        Frame frame = new Frame();
        //创建水平按钮
        Box horizontalBox = Box.createHorizontalBox();
        horizontalBox.add(new Button("水平按钮1"));
        horizontalBox.add(Box.createHorizontalGlue()); //设置水平按钮水平间距，可以自动调整水平间距
        horizontalBox.add(new Button("水平按钮2"));
        horizontalBox.add(Box.createHorizontalStrut(20)); //设置值水平值间距，不可以自动拉伸水平间距
        horizontalBox.add(new Button("水平按钮3"));

        //创建垂直按钮
        Box verticalBox = Box.createVerticalBox();
        verticalBox.add(new Button("垂直按钮1"));
        verticalBox.add(Box.createVerticalGlue());
        verticalBox.add(new Button("垂直按钮2"));
        verticalBox.add(Box.createVerticalStrut(20));
        verticalBox.add(new Button("垂直按钮3"));

        //把按钮加入到容器中
        frame.add(horizontalBox,BorderLayout.NORTH);
        frame.add(verticalBox);
        //设置最佳大小
        frame.pack();
        //设置为可见
        frame.setVisible(true);
    }
}
