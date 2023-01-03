package com.wjl.draw_;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g); //调用父类方法
        g.drawOval(100,200,300,300 );  //画圆
    }
}
