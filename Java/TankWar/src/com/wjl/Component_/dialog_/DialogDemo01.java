package com.wjl.Component_.dialog_;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogDemo01 {
    public static void main(String[] args) {
        //创建母窗口
        Frame frame = new Frame();

        //创建模式对话框
        Dialog dialog1 = new Dialog(frame, "模式对话框", true);
        Dialog dialog2 = new Dialog(frame, "非模式对话框", false);

        //设置两个模式对话框的大小
        dialog1.setBounds(20,30,200,300);
        dialog2.setBounds(20,30,200,300);

        //创建两个按钮
        Button button1 = new Button("打开模式对话框");
        Button button2 = new Button("打开非模式对话框");
        //点击按钮事件响应
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog1.setVisible(true);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog2.setVisible(true);
            }
        });

        frame.add(button1,BorderLayout.NORTH);
        frame.add(button2);

        frame.pack();
        frame.setVisible(true);
    }
}
