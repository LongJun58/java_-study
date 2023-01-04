package com.wjl.draw_;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g); //调用父类方法
//        g.drawOval(100,200,300,300 );  //画圆
        g.setColor(Color.BLACK);
        g.fillRect(0,0,800,600);

        //画坦克
        //设置画笔的颜色
        g.setColor(Color.cyan);
        g.fill3DRect(100,100,10,50,false);
        g.fill3DRect(110,108,20,35,false);
        g.fillOval(110,114,20,20);
        g.drawLine(120,100,120,120);
        g.fill3DRect(130,100,10,50,false);
//        g.draw3DRect(110,105,20,14);
//        g.fillOval(110,110,5,5);
//        g.drawLine(120,100,120,110);
//        g.fillRect(130,100,10,20);
    }
}
