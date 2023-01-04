package com.wjl.draw_;

import javax.swing.*;
import java.awt.*;

public class WjlTankGame01 {
    public static void main(String[] args) {
        //创建窗口容器
        JFrame jFrame = new JFrame("画坦克");

        MyPanel myPanel = new MyPanel();
        jFrame.add(myPanel);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit
        jFrame.setSize(800,600);
        jFrame.setVisible(true);//可见
    }
}
