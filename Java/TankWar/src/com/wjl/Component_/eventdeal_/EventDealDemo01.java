package com.wjl.Component_.eventdeal_;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventDealDemo01 {
    //创建Text文本框
    private TextField tf = new TextField();

    private Frame myFrame = new Frame("测试事件处理机制");

    private class MyEventListener implements ActionListener {

        //事件监听器
        @Override
        public void actionPerformed(ActionEvent e) {
            tf.setText("Hello word");
        }
    }
    private void into(){
        //创建按钮
        Button button = new Button("确认");

        //注册监听
        button.addActionListener(new MyEventListener());

        myFrame.add(tf,BorderLayout.NORTH);
        myFrame.add(button);
        myFrame.pack(); //设置最佳大小
        myFrame.setVisible(true);//设置可见
    }
    public static void main(String[] args) {
        new EventDealDemo01().into();
    }
}
