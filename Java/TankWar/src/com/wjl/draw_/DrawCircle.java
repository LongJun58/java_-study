package com.wjl.draw_;

import javax.swing.*;
import java.awt.*;

public class DrawCircle extends JFrame {
    //定义一个画板
    private MyPanel myPanel = null;
    public static void main(String[] args) {
        DrawCircle drawCircle = new DrawCircle();
    }

    public DrawCircle() {
        //创建画板
        myPanel = new MyPanel();
        add(myPanel);
        setSize(600,600);
        setVisible(true);//设置可见
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
