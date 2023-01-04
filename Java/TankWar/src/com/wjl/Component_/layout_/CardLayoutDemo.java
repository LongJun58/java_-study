package com.wjl.Component_.layout_;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutDemo {
    public static void main(String[] args) {
        //创建窗口容器
        Frame frame = new Frame();

        //创建panel对象，用来存储多张卡片
        Panel p1 = new Panel();

        //创建Cardlayout布局管理器
        CardLayout cardLayout = new CardLayout();

        //把p1容器设置为卡片布局管理器
        p1.setLayout(cardLayout);

        //添加多张卡片
        String[] names = {"第一张","第二张","第三张","第四张","第五张"};
        //添加多张卡片，并为卡片设置名字
        for (String name : names) {
            p1.add(name, new Button(name));
        }
        //把p1放入窗口容器中
        frame.add(p1);

        //创建p2对象，包含五个按钮
        Panel p2 = new Panel();

        //创建五个按钮
        Button b1 = new Button("上一张");
        Button b2 = new Button("下一张");
        Button b3 = new Button("第一张");
        Button b4 = new Button("最后一张");
        Button b5 = new Button("第三张");

        //创建事键监听器
        ActionListener actionListener = e -> {
            String actionCommand = e.getActionCommand();
            switch (actionCommand){
                case "上一张"->{
                    cardLayout.previous(p1);
                }
                case "下一张"->{
                    cardLayout.next(p1);
                }
                case "第一张"->{
                    cardLayout.first(p1);
                }
                case "最后一张"->{
                    cardLayout.last(p1);
                }
                case "第三张"->{
                    cardLayout.show(p1,"第三张");
                }
            }
        };

        //把按钮和事件监听器绑定到一起
        b1.addActionListener(actionListener);
        b2.addActionListener(actionListener);
        b3.addActionListener(actionListener);
        b4.addActionListener(actionListener);
        b5.addActionListener(actionListener);
        //把按钮放入到p2当中
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);

        //把p2放入到窗口当中
//        frame.add(p2,BorderLayout.SOUTH);
        FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER, 2, 2);
        p2.setLayout(flowLayout);
        frame.add(p2,BorderLayout.SOUTH);
        //设置最佳大小和可见
        frame.pack();
        frame.setVisible(true);
    }
}
