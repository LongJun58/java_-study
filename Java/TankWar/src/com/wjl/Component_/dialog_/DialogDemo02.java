package com.wjl.Component_.dialog_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogDemo02 {
    public static void main(String[] args) {
        //创建母窗口
        Frame frame = new Frame();

        //创建模式对话框
        Dialog dialog1 = new Dialog(frame, "模式对话框", true);
        Box verticalBox = Box.createVerticalBox();
        verticalBox.add(new TextArea(5,20));
        verticalBox.add(new Button("确认"));
        dialog1.add(verticalBox); //给模式对话框加入组件
//        Dialog dialog2 = new Dialog(frame, "非模式对话框", false);

        //设置两个模式对话框的大小
        dialog1.pack();
//        dialog2.setBounds(20,30,200,300);

        //创建两个按钮
        Button button1 = new Button("打开模式对话框");
//        Button button2 = new Button("打开非模式对话框");
        //点击按钮事件响应
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog1.setVisible(true);
            }
        });
/*        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog2.setVisible(true);
            }
        });*/

        frame.add(button1,BorderLayout.NORTH);
//        frame.add(button2);

        frame.pack();
        frame.setVisible(true);
    }
}
