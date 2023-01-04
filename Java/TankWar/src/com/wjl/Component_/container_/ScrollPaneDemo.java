package com.wjl.Component_.container_;

import java.awt.*;

public class ScrollPaneDemo {
    public static void main(String[] args) {
        Frame frame = new Frame();
        //创建一个ScrollPane对象
        ScrollPane scrollPane = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);

        //在ScrollPane添加内容
        scrollPane.add(new TextField("测试文本"));
        scrollPane.add(new Button("测试按钮"));
        //加入容器
        frame.add(scrollPane);
        frame.setBounds(100, 100,500,500);
        frame.setVisible(true);


    }
}
