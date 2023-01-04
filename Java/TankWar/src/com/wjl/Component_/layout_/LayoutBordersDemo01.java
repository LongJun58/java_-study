package com.wjl.Component_.layout_;

import java.awt.*;

public class LayoutBordersDemo01 {
    public static void main(String[] args) {
        Frame frame = new Frame();

        //改变布局管理器
        frame.setLayout(new BorderLayout(30,5));

        //添加按钮
        frame.add(new Button("北侧按钮"),BorderLayout.NORTH);
        frame.add(new Button("东侧按钮"),BorderLayout.EAST);
        frame.add(new Button("南侧按钮"),BorderLayout.SOUTH);
        frame.add(new Button("西侧按钮"),BorderLayout.WEST);
        frame.add(new Button("中间按钮"),BorderLayout.CENTER);

        //设置大小和可见
        frame.setSize(200,300);
        frame.pack();//设置最佳大小
        frame.setVisible(true);
    }
}
