package com.wjl.Component_.eventdeal_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventDealDemo02 {
    //创建Text文本框
    private final TextField tf = new TextField();

    private final Frame myFrame = new Frame("测试事件处理机制");

    /*private class MyEventListener implements ActionListener {

        //事件监听器
        @Override
        public void actionPerformed(ActionEvent e) {
            tf.setText("Hello word");
        }
    }*/
    private void into(){
        //创建下拉选择框
        Choice starNames = new Choice();
        String[] names = new String[]{"吴京","胡歌","陈毅"};
        for (String name : names) {
            starNames.add(name);
            System.out.println(name);
        }
        //注册监听
        starNames.addItemListener(e->{
//            System.out.println(" = " + starNames.getSelectedItem());
            tf.setText((String) e.getItem());
        });

        /*tf.addActionListener(e->{
//            tf.setText(starNames.getSelectedItem());
            String text = tf.getText();
            Object[] objects = starNames.getSelectedObjects();
            for (Object object : objects) {
                String strName = (String) object;
                if (text.compareTo(strName) == 0){
                    tf.setText("已经添加过明星了");
                }else {
                    starNames.add(text);
                }
            }

        });*/

        tf.addTextListener(e->{
            String text = tf.getText();
            Object[] selectedObjects = starNames.getSelectedObjects();
            for (Object selectedObject : selectedObjects) {
                String str = (String)selectedObject;
                if (!str.equals(text)){
                    starNames.add(text);
                }
            }
        });

        myFrame.addContainerListener(new ContainerListener(){
            @Override
            public void componentAdded(ContainerEvent e) {
                Component child = e.getChild();
                System.out.println("添加了：" + child.getName()); //输出添加的组件信息
            }

            @Override
            public void componentRemoved(ContainerEvent e) {

            }
        });

        //进行添加下拉选择框和文本框
        Box horizontalBox = Box.createHorizontalBox();
        horizontalBox.add(starNames); // 添加下拉选择框
        horizontalBox.add(tf);



        
        myFrame.add(horizontalBox);//添加box容器
        myFrame.pack(); //设置最佳大小
        myFrame.setVisible(true);//设置可见
    }
    public static void main(String[] args) {
        new EventDealDemo02().into();
    }
}
